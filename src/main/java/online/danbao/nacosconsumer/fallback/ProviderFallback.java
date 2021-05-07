package online.danbao.nacosconsumer.fallback;

import online.danbao.nacosconsumer.feign.CallProviderFeign;
import org.springframework.stereotype.Component;

/**
 * @author: 蛋宝
 * @date: 2021/5/8 1:53
 * @description: feign接口的熔断类
 */
@Component
public class ProviderFallback implements CallProviderFeign {

    @Override
    public String hello(){
        return "现在服务器忙，请稍后再试！";
    }
}