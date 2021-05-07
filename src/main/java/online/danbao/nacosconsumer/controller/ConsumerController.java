package online.danbao.nacosconsumer.controller;

import online.danbao.nacosconsumer.feign.CallProviderFeign;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: 蛋宝
 * @date: 2021/5/7 23:38
 * @description: ConsumerController
 */
@RestController
@RefreshScope
public class ConsumerController {
    @Resource
    private CallProviderFeign callProviderFeign;

    @GetMapping("hi")
    public String hi() {
        return callProviderFeign.hello();
    }
}