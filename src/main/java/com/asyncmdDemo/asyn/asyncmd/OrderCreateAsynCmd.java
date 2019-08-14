package com.asyncmdDemo.asyn.asyncmd;

import com.asyncmd.model.AsynCmd;
import com.asyncmdDemo.asyn.asynbiz.OrderCreateBiz;

/**
 * @author wangwendi
 * @date 2019/8/14
 */
public class OrderCreateAsynCmd extends AsynCmd<OrderCreateBiz> {
    public static final String type = "orderCreate";

    @Override
    protected Class<OrderCreateBiz> getObject() {
        return OrderCreateBiz.class;
    }
}