package com.vv.jpa.repository;


import com.vv.jpa.domain.VVOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<VVOrder,Long> {


}
