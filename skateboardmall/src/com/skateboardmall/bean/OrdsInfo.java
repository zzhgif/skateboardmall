package com.skateboardmall.bean;

public class OrdsInfo {
	
	private String ords_id;
	private String order_id;
	private String ski_id;
	private Integer count;
	
	public OrdsInfo() {}
	
	
	public OrdsInfo(String ords_id, String order_id, String ski_id, Integer count) {
		super();
		this.ords_id = ords_id;
		this.order_id = order_id;
		this.ski_id = ski_id;
		this.count = count;
	}

	public String getOrds_id() {
		return ords_id;
	}

	public void setOrds_id(String ords_id) {
		this.ords_id = ords_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getSki_id() {
		return ski_id;
	}

	public void setSki_id(String ski_id) {
		this.ski_id = ski_id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "OrdsInfo [ords_id=" + ords_id + ", order_id=" + order_id + ", ski_id=" + ski_id + ", count=" + count
				+ "]";
	}

}
