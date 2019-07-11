package cn.edu.cuit.ssm.entity;

import java.io.Serializable;

/**
 * 
 * 南阳德刚版权所有<br>
 * 个人主页http://www.guodexian.com<br>
 *
 * 说明:注意要实现序列化接口让dubbo使用
 */
public class Goods implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double price;
	private int num;
	private String img;
	private int type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
