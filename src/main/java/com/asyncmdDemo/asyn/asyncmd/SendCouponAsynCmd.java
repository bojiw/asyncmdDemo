
package com.asyncmdDemo.asyn.asyncmd;

import com.asyncmd.enums.DispatchMode;
import com.asyncmd.model.AsynCmd;
import com.asyncmdDemo.asyn.asynbiz.SendCouponBiz;

/**
 * @author wangwendi
 * @version $Id: SendCouponAsynCmd.java, v 0.1 2019年07月24日 下午5:36 wangwendi Exp $
 */
public class SendCouponAsynCmd extends AsynCmd<SendCouponBiz> {

    @Override
    public DispatchMode getDispatchMode() {
        //因为是指定发送时间来发送 需要设置调度方式为调度中心调度 不然默认是立刻进行赠券
        return DispatchMode.DISPATCH;
    }

    public static final String type = "sendcoupon";

    @Override
    protected Class<SendCouponBiz> getObject() {
        return SendCouponBiz.class;
    }
}