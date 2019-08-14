package com.asyncmdDemo.asyn.asyncmd;

import com.asyncmd.model.AsynCmd;
import com.asyncmdDemo.asyn.asynbiz.OrderModifyBiz;

/**
 * @author wangwendi
 * @date 2019/8/14
 */
public class OrderModifyAsynCmd extends AsynCmd<OrderModifyBiz> {
    public static final String type = "orderModify";

    @Override
    protected Class<OrderModifyBiz> getObject() {
        return OrderModifyBiz.class;
    }
}