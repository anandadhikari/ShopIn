package com.shop.in.dtos;

import com.shop.in.entity.Thumbnail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WishlistView {
    private int wid;
    private int pid;
    private String name;
    private double price;
    private Thumbnail thumbnail;
    private boolean available;
}
