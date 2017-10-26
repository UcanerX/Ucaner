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
package cn.ucaner.pattern.structure.bridge.abs;

/***             
 *作者：MirsFang    
 *模式：桥接模式
 *时间：2017/04/05/下午12:25  
 *备注  抽象化角色
 ***/

public abstract class Abstraction{
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void doSomethings(){
        implementor.doSomethingA();
    }

    public Implementor getImplementor(){
        return implementor;
    }
}
