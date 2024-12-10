package cn.newbeedaly.dubbo.provider.api.impl;

import cn.newbeedaly.dubbo.api.InfoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;


/**
 * dubbo提供的Service注解，用于声明对外暴露服务(dubbo的@Service注解已废弃)
 *
 * @author newbeedaly
 */
@Service
@DubboService
public class InfoServiceImpl implements InfoService {

    @Override
    public String getInfo() {
        return "hello，这里是dubbo-provider模块！";
    }
}
