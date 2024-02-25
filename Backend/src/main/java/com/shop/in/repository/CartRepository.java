package com.shop.in.repository;

import com.shop.in.entity.CartDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartDetails, Integer> {

}
