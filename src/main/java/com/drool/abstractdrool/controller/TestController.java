package com.drool.abstractdrool.controller;

import com.drool.abstractdrool.entity.TestBean;
import com.drool.abstractdrool.service.ServiceImpl;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    KieContainer kieContainer;
    @RequestMapping("/a")
    public void test(){
        TestBean testBean = new TestBean();
        testBean.setType(1);
        ServiceImpl service = new ServiceImpl();

        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(testBean);
        kieSession.insert(service);
        int i = kieSession.fireAllRules();
        kieSession.destroy();
    }
}
