/*
 * The MIT License (MIT)
 * Copyright (c) 2016 baoyongzhang <baoyz94@gmail.com>
 */
package com.topwise.fenciinone.fencibase;

/**
 * Created by baoyongzhang on 2016/10/27.
 */
public interface Callback<T> {

    void finish(T result);
    void error(Exception e);
}
