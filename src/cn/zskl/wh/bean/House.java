package cn.zskl.wh.bean;

/**
 * 房子类
 */
public class House {
	private Long id;
	private String address;			//地址：具体到门牌号
	private HouseHolder houseHolder;	//业主
	private Complex complex;			//所属小区
}
