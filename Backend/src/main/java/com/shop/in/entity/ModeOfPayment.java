package com.shop.in.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class ModeOfPayment {
    private String modeOfPayment;
}