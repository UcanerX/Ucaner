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
package cn.ucaner.pattern.action.command;

import cn.ucaner.pattern.action.command.absCommand.Group;

/***
 *作者：MirsFang    
 *模式：命令模式
 *时间：2017/03/14/下午1:01
 *备注  UI
 ***/

public class UI extends Group {


    @Override
    public void getCommand() {
        System.out.println("UI收到命令");
    }

    @Override
    public void doAdd() {
        System.out.println("UI新增了一个页面");
    }

    @Override
    public void doDel() {
        System.out.println("UI去掉了一个页面");
    }

    @Override
    public void plan() {
        System.out.println("UI变更完毕");
    }
}
