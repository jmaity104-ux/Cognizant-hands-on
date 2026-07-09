import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Date;
import javax.crypto.SecretKey;

public class JwtService {

    private final SecretKey secretKey = Keys.hmacShaKeyFor(
            "cognizanttrainingjwtsecretkeyforhandsontask2026".getBytes(StandardCharsets.UTF_8)
    );

    public String generateToken(String username) {
        Instant now = Instant.now();
        Instant expiry = now.plusSeconds(30 * 60);

        return Jwts.builder()
                .subject(username)
                .issuedAt(Date.from(now))
                .expiration(Date.from(expiry))
                .signWith(secretKey)
                .compact();
    }
}
