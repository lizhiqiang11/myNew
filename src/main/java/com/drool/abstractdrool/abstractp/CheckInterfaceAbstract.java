package com.drool.abstractdrool.abstractp;

import org.drools.core.base.RuleNameEndsWithAgendaFilter;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.drool.abstractdrool.entity.TestBean;

public abstract class CheckInterfaceAbstract {

    protected KieContainer kieContainer;

    // 校验参数
    public abstract void checkParam();
    // 扩展
    public abstract void checkExt();
    // 最后
    public abstract void checkAfter();

    public void executeCheck(TestBean bean){
        // 1 校验参数
        checkParam();
        // 2 扩展
        checkExt();
        // 3 调用检测
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(bean);
        kieSession.insert(this);
        RuleNameEndsWithAgendaFilter user = new RuleNameEndsWithAgendaFilter("rule2");
        int i = kieSession.fireAllRules(user);
        kieSession.destroy();
        // 4 后置处理
        checkAfter();
    };

    // 1
    public void check1(){
        System.out.println("类型1");
    }
    // 2
    public void check2(){
        System.out.println("类型2");
    }
    // 3
    public void check3(){
        // todo----
    }
}
