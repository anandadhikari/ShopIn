package com.shop.in.dtos;

import com.shop.in.entity.ProductRatings;
import com.shop.in.entity.Productimage;
import com.shop.in.entity.Thumbnail;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Product {
    private int id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private int inStock;
    private boolean trending;
    private Thumbnail thumbnail;
    private ProductRatings productRatings;
    private List<Productimage> productimage;
    private boolean isWishListed;
}
