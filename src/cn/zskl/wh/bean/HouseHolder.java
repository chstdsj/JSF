package cn.zskl.wh.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * 房主类
 */
public class HouseHolder {

	private static final int OWNER = 1;	//业主
	private static final int FAMILY = 2;//家属
	private static final int LESSEE = 3;//租户

	private Long id;
	private String name;	//名字
	private int grade;		//性别
	private String phone;	//电话
	private String ID;		//身份证号
	private int type;		//类型：业主，家属，租户
	private String weChat;	//微信号
	private Set<Complex> complexes = new HashSet<>();	//小区
	private Set<House> houses = new HashSet<>();	//房子
}
