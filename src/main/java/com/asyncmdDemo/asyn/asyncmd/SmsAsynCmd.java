/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.asyncmdDemo.asyn.asyncmd;

import com.asyncmd.model.AsynCmd;
import com.asyncmdDemo.asyn.asynbiz.SmsBiz;

/**
 * 短信异步命令
 * @author wangwendi
 * @version $Id: SmsAsynCmd.java, v 0.1 2019年07月23日 下午8:57 wangwendi Exp $
 */
public class SmsAsynCmd extends AsynCmd<SmsBiz> {

    @Override
    protected Class getObject() {
        return SmsBiz.class;
    }
}