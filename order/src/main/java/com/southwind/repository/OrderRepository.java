package com.southwind.repository;

import com.southwind.entity.Order;

import java.util.List;

public interface OrderRepository {
    public void save(Order order);
    public List<Order> findAllByUid(int index, int limit, long uid);
    public int countByUid(long uid);
    public List<Order> findAllByState(int index, int limit);
    public void updateState(long id);
    public int count();
}
