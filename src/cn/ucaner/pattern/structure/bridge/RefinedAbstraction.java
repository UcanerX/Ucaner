package cn.ucaner.pattern.structure.bridge;

import cn.ucaner.pattern.structure.bridge.abs.Abstraction;
import cn.ucaner.pattern.structure.bridge.abs.Implementor;


/***
 *作者：MirsFang    
 *模式：桥接模式
 *时间：2017/04/05/下午12:28  
 *备注  具体抽象化角色
 ***/

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void doSomethings() {
        super.doSomethings();
        getImplementor().doSomethingB();
    }
}
