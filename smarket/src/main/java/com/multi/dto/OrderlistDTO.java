package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderlistDTO {
	private int orderno;
	private String custid;
	private int shipid;
	private String orderstatus;
	private Date orderdate;
	private int totalprice;

}