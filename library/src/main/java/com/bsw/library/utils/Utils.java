package com.bsw.library.utils;

import java.util.List;
import java.util.Map;

public class Utils {
    /**
     * 判断集合的长度
     *
     * @param list 索要获取长度的集合
     * @return 该集合的长度
     */
    public static <T> int judgeListNull(T[] list) {
        if (list == null || list.length == 0) {
            return 0;
        } else {
            return list.length;
        }
    }

    /**
     * 判断集合的长度
     *
     * @param list 索要获取长度的集合
     * @return 该集合的长度
     */
    public static <T> int judgeListNull(List list) {
        if (list == null || list.size() == 0) {
            return 0;
        } else {
            return list.size();
        }
    }

    /**
     * 判断集合的长度
     *
     * @param map 索要获取长度的集合
     * @return 该集合的长度
     */
    public static <T> int judgeListNull(Map map) {
        if (map == null || map.size() == 0) {
            return 0;
        } else {
            return map.size();
        }
    }
}
