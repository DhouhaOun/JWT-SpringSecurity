package com.example.demo;

public class JWTUtil {

    public static final String AUTH_HEADER="Authorization";
    public static final String SECRET="secret";
    public static final long EXPIRATION=2*60*1000;
    public static final long EXPIRATION_REFRESH_TOKEN=15*60*1000;
    public static final String HEADER_PREFIX="Bearer ";
}
