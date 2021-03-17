package com.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springcloud.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chenshirong6
 * @date Created in 2021/3/17 9:34
 */
@Mapper
public interface OrderInfoMapper extends BaseMapper<OrderInfo> {
}
