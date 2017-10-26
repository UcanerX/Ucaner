package cn.ucaner.pattern.structure.decorator.decoratorIml;

import cn.ucaner.pattern.structure.decorator.decoratorAbs.Decorator;
import cn.ucaner.pattern.structure.decorator.decoratorAbs.SchoolReport;



/***
 *作者：MirsFang    
 *模式：装饰器模式
 *时间：2017/03/01/下午12:53  
 *备注  装饰学校排名
 ***/

public class RankDecortaor extends Decorator {

    public RankDecortaor(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void rankDecortaor(){
        System.out.println("在学校排名也很靠前");
    }

    @Override
    public void report() {
        rankDecortaor();
        super.report();
    }
}
