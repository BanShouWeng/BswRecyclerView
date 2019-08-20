package com.bsw.library;

/**
 * @author 半寿翁
 * @date 2019/3/12.
 */
public interface BswFilterLayoutFilter<T> {
    void performFilter(T t, BswLayoutItem layoutItem);
}
