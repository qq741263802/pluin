package com.common;

import java.util.UUID;

public class Getuuid {


    public static String get32UUID() {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }


}
