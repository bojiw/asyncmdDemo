
package com.asyncmdDemo.asyn.asyncmd;

import com.asyncmd.enums.DispatchMode;
import com.asyncmd.model.AsynCmd;
import com.asyncmdDemo.asyn.asynbiz.SmsBiz;

/**
 * 短信异步命令
 * @author wangwendi
 * @version $Id: SmsAsynCmd.java, v 0.1 2019年07月23日 下午8:57 wangwendi Exp $
 */
public class SmsAsynCmd extends AsynCmd<SmsBiz> {

    public static final String name = "sms";

    /**
     * 设置调度模式为调度中心调度
     * @return
     */
    @Override
    public DispatchMode getDispatchMode() {
        return DispatchMode.DISPATCH;
    }

    /**
     * 设置调度频率
     * @return
     */
    @Override
    public String getExecuterFrequencys() {
        return "10s,20s,1m";
    }

    @Override
    protected Class getObject() {
        return SmsBiz.class;
    }
}