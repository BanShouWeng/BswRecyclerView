package com.bsw.library;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 半寿翁
 * @date 2018/9/7.
 */
public class LimitAnnotation {
    /**
     * 纵向布局
     */
    public static final int VERTICAL = 10;
    /**
     * 横向布局
     */
    public static final int HORIZONTAL = 11;

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({VERTICAL, HORIZONTAL})
    @interface LayoutManagerType {
    }

    public static final int BOTTOM_DECORATION = 0x010;
    public static final int ROUND_DECORATION = 0x011;

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({BOTTOM_DECORATION, ROUND_DECORATION})
    @interface DecorationType {
    }

    public static final int LAYOUT_MAIN = 0x020;
    public static final int LAYOUT_RIGHT = 0x021;
    public static final int LAYOUT_LEFT = 0x022;

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({LAYOUT_MAIN, LAYOUT_RIGHT, LAYOUT_LEFT})
    @interface LayoutType {
    }
}
