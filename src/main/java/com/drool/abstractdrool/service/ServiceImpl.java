package com.drool.abstractdrool.service;

import com.drool.abstractdrool.abstractp.CheckInterfaceAbstract;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ServiceImpl extends CheckInterfaceAbstract {

    @Override
    public void checkParam() {

    }

    @Override
    public void checkExt() {

    }

    @Override
    public void checkAfter() {

    }

    public void setKie(KieContainer kieContainer){
        super.kieContainer = kieContainer;
    }
}
