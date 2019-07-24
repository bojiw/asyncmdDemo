/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.asyncmdDemo.asyn.asyncmd;

import com.asyncmd.model.AsynCmd;
import com.asyncmdDemo.asyn.asynbiz.SendCouponBiz;

/**
 * @author wangwendi
 * @version $Id: SendCouponAsynCmd.java, v 0.1 2019年07月24日 下午5:36 wangwendi Exp $
 */
public class SendCouponAsynCmd extends AsynCmd<SendCouponBiz> {

    public static final String type = "sendcoupon";

    @Override
    protected Class<SendCouponBiz> getObject() {
        return SendCouponBiz.class;
    }
}