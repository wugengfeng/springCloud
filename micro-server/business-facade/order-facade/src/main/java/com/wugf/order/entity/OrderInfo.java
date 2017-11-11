package com.wugf.order.entity;

public class  OrderInfo{
		
	/**
	 *	
	 */
	private Integer id;
		
	/**
	 *	订单编号
	 */
	private String orderNum;
		
	/**
	 *	订单总价格
	 */
	private java.math.BigDecimal totalPrice;
		
	/**
	 *	拍单人
	 */
	private Integer orderUserId;
		
	/**
	 *	收获地址id
	 */
	private String deliveryAddress;
		
	/**
	 *	拍单时间
	 */
	private java.util.Date createDate;
		
	/**
	 *	支付时间
	 */
	private java.util.Date paymentDate;
	
		
	/**
	 * 获取 
	 */
	public Integer getId(){
		return this.id;
	}
	
	/**
	 * 设置 
	 */
	public void setId(Integer id){
		this.id = id;
	}
		
	/**
	 * 获取 订单编号
	 */
	public String getOrderNum(){
		return this.orderNum;
	}
	
	/**
	 * 设置 订单编号
	 */
	public void setOrderNum(String orderNum){
		this.orderNum = orderNum;
	}
		
	/**
	 * 获取 订单总价格
	 */
	public java.math.BigDecimal getTotalPrice(){
		return this.totalPrice;
	}
	
	/**
	 * 设置 订单总价格
	 */
	public void setTotalPrice(java.math.BigDecimal totalPrice){
		this.totalPrice = totalPrice;
	}
		
	/**
	 * 获取 拍单人
	 */
	public Integer getOrderUserId(){
		return this.orderUserId;
	}
	
	/**
	 * 设置 拍单人
	 */
	public void setOrderUserId(Integer orderUserId){
		this.orderUserId = orderUserId;
	}
		
	/**
	 * 获取 收获地址id
	 */
	public String getDeliveryAddress(){
		return this.deliveryAddress;
	}
	
	/**
	 * 设置 收获地址id
	 */
	public void setDeliveryAddress(String deliveryAddress){
		this.deliveryAddress = deliveryAddress;
	}
		
	/**
	 * 获取 拍单时间
	 */
	public java.util.Date getCreateDate(){
		return this.createDate;
	}
	
	/**
	 * 设置 拍单时间
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
		
	/**
	 * 获取 支付时间
	 */
	public java.util.Date getPaymentDate(){
		return this.paymentDate;
	}
	
	/**
	 * 设置 支付时间
	 */
	public void setPaymentDate(java.util.Date paymentDate){
		this.paymentDate = paymentDate;
	}
}