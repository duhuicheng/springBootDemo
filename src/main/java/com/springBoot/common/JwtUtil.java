package com.springBoot.common;


import io.jsonwebtoken.*;
import java.util.Date;
import java.util.Map;

public class JwtUtil<T> {

    public static final String SUBJECT = "demo";

    public static final long EXPIRE = 15*60*1000;  //过期时间，毫秒，一周

    //秘钥
    public static final  String APPSECRET = "demo";


    //创建token对象
    public static String JwtCreate(Map<String, Object> map){
        String token= Jwts.builder().setSubject(SUBJECT)
                .claim("userId",map.get("userId"))
                .claim("userName",map.get("userName"))
                //设置签署时间
                .setIssuedAt(new Date())
                //设置有效时间
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE))
                //设置签名
                .signWith(SignatureAlgorithm.HS256,APPSECRET).compact();
        return token;
    }

    //用作创建token对象
    public String JwtCreate(T user){
        String token= Jwts.builder().setSubject(SUBJECT)
                .claim("user",user)
                //设置签署时间
                .setIssuedAt(new Date())
                //设置有效时间
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE))
                //设置签名
                .signWith(SignatureAlgorithm.HS256,APPSECRET).compact();
        return token;
    }

    /**
     * 用作校验token
     * @param token
     * @return
     */
    public static Claims checkJWT(String token){

        try{
            final Claims claims =  Jwts.parser().setSigningKey(APPSECRET).
                    parseClaimsJws(token).getBody();
            return  claims;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }


}