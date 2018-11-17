package com.fx;

import java.util.List;

public interface OrderdetailMapper {
    public List<OrderDetail> findOrderDetail();
    public List<OrderDetail> findOrderDetailByIds(List<Integer> ids);
}
