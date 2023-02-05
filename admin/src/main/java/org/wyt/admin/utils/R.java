/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package org.wyt.admin.utils;

import lombok.Data;

/**
 * 返回类
 */
@Data
public class R<T> {

    private int status;

    private String message;

    private T data;

    public static <T> R ok(String msg, T data) {

        R<T> r = new R<>();
        r.setStatus(20000);
        r.setMessage(msg);
        r.setData(data);
        return r;
    }

    public static <T> R error(String msg, T data) {

        R<T> r = new R<>();
        r.setStatus(20001);
        r.setMessage(msg);
        r.setData(data);

        return r;
    }


}
