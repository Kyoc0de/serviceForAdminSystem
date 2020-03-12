package com.kyo.admin.utils;

public class TokenUtils {
    //签名秘钥
    public static final String SECRET = "admin";
    //生成token
    public static String createJwtToken(String id){
        String issuer = "www.aske.tech";
        String subject = "admin@admin.com";
        long ttlMillis = 36000000;
        return createJwtToken(id);
    }

}
