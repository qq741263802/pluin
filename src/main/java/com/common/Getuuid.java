package com.common;

import java.util.UUID;

public class Getuuid {


    public static String get32UUID() {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }

    public static String getType(Object test) {
        return test.getClass().getName().toString();
    }

    public static void main(String[] args) {
        String k="10";
        String l="22";
        Integer count=new Integer(k)+new Integer(l);
        System.out.println(count);
    }

}
