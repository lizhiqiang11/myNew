package com.drool.abstractdrool;

import com.drool.abstractdrool.entity.TestBean;
import com.drool.abstractdrool.service.ServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AbstractDroolApplicationTests {

    @Autowired
    KieContainer kieContainer;
    @Test
    public void testDr(){

        TestBean testBean = new TestBean();
        testBean.setType(1);
        ServiceImpl service = new ServiceImpl();
        service.setKie(kieContainer);
        service.executeCheck(testBean);
//        KieSession kieSession = kieContainer.newKieSession();
//        kieSession.insert(testBean);
//        kieSession.insert(service);
//        int i = kieSession.fireAllRules();
//        kieSession.destroy();


    }

}
