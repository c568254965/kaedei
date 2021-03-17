package com.springcloud.api;

import com.springcloud.common.dto.ProductInfoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenshirong6
 * @date Created in 2021/3/16 14:05
 */

@FeignClient(name = "csrr-product")
public interface ProductCenterFeignApi {

    @PostMapping("/selectProductById/{productId}")
    ProductInfoDTO selectProductById(@PathVariable("productId")Long productId );
}
