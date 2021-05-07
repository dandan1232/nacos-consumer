package online.danbao.nacosconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 蛋宝
 * @date: 2021/5/7 23:55
 * @description: 远程调用生产者
 */
@FeignClient("nacos-provider")
public interface CallProviderFeign {
    /**
     * 远程调用生产者的hello接口
     *
     * @return String
     */
    @RequestMapping("hello")
    String hello();
}