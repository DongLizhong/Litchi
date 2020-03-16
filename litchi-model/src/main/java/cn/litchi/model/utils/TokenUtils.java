package cn.litchi.model.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

import java.util.Date;

public class TokenUtils {

    public static final int EXPIRE_TIME = 1 * 24 * 60 * 60 * 1000;

    public static String getToken(Object id, Object secret) {
        String token = "";
        // 生成过期时间
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
       /* 使用HS256生成token,密钥则是用户的密码，唯一密钥的话可以保存在服务端。
        withAudience()存入需要保存在token的信息，这里我把用户ID存入token中*/
        token = JWT.create().withAudience(String.valueOf(id))
                .withExpiresAt(date)
                .sign(Algorithm.HMAC256(String.valueOf(secret)));
        return token;
    }

    public static String getToken(Object id, Object secret, int expireTime) {
        String token = "";
        // 生成过期时间
        Date date = new Date(System.currentTimeMillis() + expireTime);
       /* 使用HS256生成token,密钥则是用户的密码，唯一密钥的话可以保存在服务端。
        withAudience()存入需要保存在token的信息，这里我把用户ID存入token中*/
        token = JWT.create().withAudience(String.valueOf(id))
                .withExpiresAt(date)
                .sign(Algorithm.HMAC256(String.valueOf(secret)));
        return token;
    }

    public String getIdFromToken(String token) {
        return JWT.decode(token).getAudience().get(0);
    }

    public boolean verifiyUserByToken(Object secret, String token) {
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(String.valueOf(secret))).build();
        try {
            jwtVerifier.verify(token);
        } catch (JWTVerificationException e) {
            return false;
        }
        return true;
    }
}
