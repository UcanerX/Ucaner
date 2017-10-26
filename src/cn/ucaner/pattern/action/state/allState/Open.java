/**
 * <html>
 * <body>
 *  <P> Copyright 1994 JsonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 19941115</p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.action.state.allState;

import cn.ucaner.pattern.action.state.absState.Context;
import cn.ucaner.pattern.action.state.absState.State;


/***
 *作者：MirsFang    
 *模式：状态模式
 *时间：2017/03/16/下午12:23  
 *备注  打开状态
 ***/

public class Open extends State {


    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        //状态修改
        context.setNowState(Context.close);
        //委托执行
        context.getNowState().close();
    }

    //开着门不能跑
    @Override
    public void run() {

    }

    //开着门就是停止的
    @Override
    public void stop() {


    }
}
