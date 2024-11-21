package com.br.erp.web.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.br.erp.web.types.Role;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TokenService {

    @Value("${secretKey}")
    private String secretKey;

    private SecretKey SECRET_KEY;
    private Algorithm ALGORITHM;

    private static final long EXPIRATION_TIME = 86400000L; // 1 dia em milissegundos

    @PostConstruct
    public void init() {
        SECRET_KEY = Keys.hmacShaKeyFor(Base64.getDecoder().decode(secretKey));
        ALGORITHM = Algorithm.HMAC256(SECRET_KEY.getEncoded());
    }

    public String generateToken(Authentication authentication) {
        User user = (User) authentication.getPrincipal();

        return JWT.create()
                .withSubject(user.getUsername())
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .withClaim("roles", user.getAuthorities().stream()
                        .map(Object::toString)
                        .toList())
                .sign(ALGORITHM);
    }

    public Claims validateToken(String token) {
        return Jwts.parserBuilder().setSigningKey(SECRET_KEY).build().parseClaimsJws(token).getBody();
    }
}
