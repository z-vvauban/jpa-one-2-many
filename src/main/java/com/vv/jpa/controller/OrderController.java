package com.vv.jpa.controller;

import com.vv.jpa.domain.VVItem;
import com.vv.jpa.domain.VVOrder;
import com.vv.jpa.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepository orderRepository;


    @GetMapping("/orders")
    public List<VVOrder> findAllOrders(){
        orderRepository.save( VVOrder.builder()
                                     .id(1L)
                                     .name( "commande decat" )
                                     .VVItems( List.of( VVItem.builder()
                                                              .id( 2L )
                                                              .name( "polo Adidas" )
                                                              .build(),
                                                        VVItem.builder()
                                                              .id( 3L )
                                                              .name( "casquette kalenji" )
                                                              .build() ) )
                                     .build() );

        return orderRepository.findAll();
    }
}
