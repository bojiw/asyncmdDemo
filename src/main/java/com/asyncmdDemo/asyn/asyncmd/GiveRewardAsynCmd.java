/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.asyncmdDemo.asyn.asyncmd;

import com.asyncmd.model.AsynCmd;
import com.asyncmdDemo.asyn.asynbiz.GiveRewardBiz;

/**
 * 赠送奖励异步命令对象
 * @author wangwendi
 * @version $Id: GiveRewardAsynCmd.java, v 0.1 2019年07月23日 下午9:56 wangwendi Exp $
 */
public class GiveRewardAsynCmd extends AsynCmd<GiveRewardBiz> {
    @Override
    protected Class<GiveRewardBiz> getObject() {
        return GiveRewardBiz.class;
    }
}