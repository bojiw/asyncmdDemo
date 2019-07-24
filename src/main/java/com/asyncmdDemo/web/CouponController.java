/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package com.asyncmdDemo.web;

import com.asyncmd.manager.AsynExecuterFacade;
import com.asyncmdDemo.asyn.asynbiz.SendCouponBiz;
import com.asyncmdDemo.asyn.asyncmd.SendCouponAsynCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * 优惠券定向赠券服务
 * @author wangwendi
 * @version $Id: CouponController.java, v 0.1 2019年07月24日 下午5:34 wangwendi Exp $
 */
@Controller
@RequestMapping("/asyn")
public class CouponController {

    @Autowired
    private AsynExecuterFacade asynExecuterFacade;

    @RequestMapping(value = "/sendCoupons")
    public String sendCoupons(List<Long> userIds, List<Long> coupons, Date sendDate, String requestId) {
        SendCouponBiz sendCouponBiz = new SendCouponBiz();
        sendCouponBiz.setCouponIds(coupons);
        sendCouponBiz.setUserIds(userIds);
        SendCouponAsynCmd sendCouponAsynCmd = new SendCouponAsynCmd();
        sendCouponAsynCmd.setContent(sendCouponBiz);
        String bizId = SendCouponAsynCmd.type + requestId;
        sendCouponAsynCmd.setBizId(bizId);
        //设置发送时间 需要在SendCouponExecuter设置调度方式为调度中心调度 不然会立刻发送
        sendCouponAsynCmd.setNextTime(sendDate);
        asynExecuterFacade.saveExecuterAsynCmd(sendCouponAsynCmd);
        return "ok";
    }
}