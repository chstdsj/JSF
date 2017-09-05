package cn.zskl.wh.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * 小区
 */
public class Complex {
	private Long id;
	private String name;		//名称
	private String privince;	//省
	private String city;		//市
	private String location;	//位置：具体到街道
	private Set<HouseHolder> houseHolders = new HashSet<>();//业主
	private Set<House> houses = new HashSet<>();	//房子
}
