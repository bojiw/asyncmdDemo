/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.asyncmdDemo.asyn.asynexecuter;

import com.alibaba.fastjson.JSON;
import com.asyncmd.enums.DispatchMode;
import com.asyncmd.model.AbstractAsynExecuter;
import com.asyncmdDemo.asyn.asynbiz.SendCouponBiz;
import com.asyncmdDemo.asyn.asynbiz.SmsBiz;
import com.asyncmdDemo.asyn.asyncmd.SendCouponAsynCmd;
import com.asyncmdDemo.asyn.asyncmd.SmsAsynCmd;
import com.asyncmdDemo.server.AsynCmdServer;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangwendi
 * @version $Id: SendCouponExecuter.java, v 0.1 2019年07月24日 下午5:37 wangwendi Exp $
 */
@Service
public class SendCouponExecuter extends AbstractAsynExecuter<SendCouponAsynCmd> {

    @Override
    public DispatchMode getDispatchMode() {
        //因为是指定发送时间来发送 需要设置调度方式为调度中心调度 不然默认是立刻进行赠券
        return DispatchMode.DISPATCH;
    }

    @Autowired
    private AsynCmdServer asynCmdServer;
    @Override
    protected void executer(SendCouponAsynCmd cmd) {
        SendCouponBiz content = cmd.getContent();
        System.out.println("赠送优惠券成功");
        System.out.println("根据用户id获取手机号" + JSON.toJSONString(content.getUserIds()));
        //模拟逻辑 获取到手机号
        List<String> mobils = Lists.newArrayList();
        SmsBiz smsBiz = new SmsBiz();
        smsBiz.setMobile(mobils);
        smsBiz.setContent("恭喜你成功收到优惠券");
        String bizId = "sms" + JSON.toJSONString(mobils) + cmd.getBizId();
        asynCmdServer.notify(smsBiz,bizId,SmsAsynCmd.class);

    }
}