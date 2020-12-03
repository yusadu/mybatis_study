package edu.nf.ch02.util;

import java.util.UUID;

/**
 * @author wangl
 * @date 2020/11/6
 * UUID生成工具类
 */
public class UUIDUtils {

    public static String createUUID(){
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        return uuid;
    }

}
