package com.skateboardmall.bean;

//订单表			
public class OrderInfo {
	private	Integer order_id; //订单编号
	private	String order_date;//订单时间
	private	Integer rec_id;//收货地址编号
	private	Integer user_id;//用户编号	
	private Integer order_state;//订单状态
	
	public OrderInfo() {
		super();
	}

	public OrderInfo(Integer order_id,  String order_date, Integer rec_id, Integer user_id,Integer order_state) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.rec_id = rec_id;
		this.user_id = user_id;
		this.order_state=order_state;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public Integer getRec_id() {
		return rec_id;
	}

	public void setRec_id(Integer rec_id) {
		this.rec_id = rec_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	

	public Integer getOrder_state() {
		return order_state;
	}

	public void setOrder_state(Integer order_state) {
		this.order_state = order_state;
	}

	@Override
	public String toString() {
		return "OrderInfo [order_id=" + order_id + ", order_data=" + order_date + ", rec_id=" + rec_id + ", user_id="
				+ user_id + ", order_state=" + order_state + "]";
	}
	
}
