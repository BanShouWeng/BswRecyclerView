package com.bsw.library.utils;

import android.widget.TextView;

/**
 * 字符串提取工具
 */
public class TextExtractUtils {
    /**
     * 获取String类型
     *
     * @param textText 文本控件，EditText/Button都是继承TextView，不加额外封装
     * @return 返回字符串
     */
    public static String getString(TextView textText) {
        return textText.getText().toString().trim();
    }
}
