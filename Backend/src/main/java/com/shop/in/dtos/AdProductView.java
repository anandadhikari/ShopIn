package com.shop.in.dtos;

import com.shop.in.entity.Thumbnail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdProductView {
    private int productId;
    private String productName;
    private Thumbnail thumbnail;
}
