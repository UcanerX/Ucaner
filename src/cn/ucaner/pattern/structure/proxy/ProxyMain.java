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
package cn.ucaner.pattern.structure.proxy;

import cn.ucaner.pattern.structure.proxy.dynamicProxy.RealSujectImpl;
import cn.ucaner.pattern.structure.proxy.dynamicProxy.Subject;
import cn.ucaner.pattern.structure.proxy.dynamicProxy.SubjectInvocationHandler;
import cn.ucaner.pattern.structure.proxy.staticProxy.Proxy;
import cn.ucaner.pattern.structure.proxy.staticProxy.RealSuject;

/***
 *作者：MirsFang
 *模式：代理模式
 *时间：2017/2/28/
 *备注  代理模式运行类
 ***/
public class ProxyMain {

    public static void main(String[] args) {

//        staticProxy();

        dynamicProxy();
    }


    /*
    * 静态代理
    * */
    private static void staticProxy() {

        RealSuject realSuject = new RealSuject();

        Proxy proxy = new Proxy(realSuject);
        proxy.request();

    }


    /**
    *
    *作者:Mirsfang
    *日期:2017/2/28/下午12:54
    *描述:动态代理
    **/
    private static void dynamicProxy(){
        RealSujectImpl realSubject=new RealSujectImpl();
        SubjectInvocationHandler handler=new SubjectInvocationHandler(realSubject);
        Subject subject= (Subject) handler.getProxy();
        subject.request();
    }


}