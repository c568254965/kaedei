package com.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springcloud.entity.ProductInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chenshirong6
 * @date Created in 2021/3/16 17:05
 */
@Mapper
public interface ProductInfoMapper extends BaseMapper<ProductInfo> {
}
