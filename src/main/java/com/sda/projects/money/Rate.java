package com.sda.projects.money;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@NoArgsConstructor
@Getter
@ToString
public class Rate {
 private String table;
 private String no;
 private String tradingDate;
 private String effectiveDate;
 private List<Rates> rates;
}
