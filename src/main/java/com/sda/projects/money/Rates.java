package com.sda.projects.money;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class Rates {
    private String currency;
    private String code;
    private double bid;
    private double ask;
}
