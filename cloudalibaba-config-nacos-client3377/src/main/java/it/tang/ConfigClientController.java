package it.tang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //支持Nacos的动态刷新功能。
public class ConfigClientController {


    @Value("${config.info}")
    private String confing;


    @GetMapping("config/info")
    public String getConfing(){

        return confing;
    }


}