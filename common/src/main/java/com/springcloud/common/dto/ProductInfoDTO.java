package com.springcloud.common.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenshirong6
 * @date Created in 2021/3/16 14:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductInfoDTO {


    private Long productNo;

    private String productName;

    private Integer productStore;

    private double productPrice;
}
