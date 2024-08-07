package com.sky.mapper;

import com.sky.entity.OrderDetail;
import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface OrderDetailMapper {
    void insertBatch(ArrayList<OrderDetail> orderDetailList);

    @Select("select * from order_detail where order_id =#{orderId}")
    List<OrderDetail> getByOrderId(Long orderId);

    @Select("select * from orders where id=#{id}")
    Orders getById(Long id);

}
