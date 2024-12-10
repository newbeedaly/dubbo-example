package cn.newbeedaly.dubbo.consumer.controller;

import cn.newbeedaly.dubbo.api.InfoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    /**
     * dubbo提供的Reference注解，用于调用远程服务(dubbo的@Reference注解已废弃)
     */
    @DubboReference
    private InfoService infoService;

    @GetMapping("/getInfo")
    public String getInfo() {
        return infoService.getInfo();
    }

}
