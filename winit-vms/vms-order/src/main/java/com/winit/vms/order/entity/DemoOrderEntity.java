package com.winit.vms.order.entity;

import java.io.Serializable;  
import java.util.Date;



/**
 * demo order entity
 * TODO wen.bai: Change to the actual description of this class
 * @version   Revision History
 * <pre>
 * Author     Version       Date        Changes
 * wen.bai    1.0           2014-10-20     Created
 *
 * </pre>
 * @since 1.
 */
public class DemoOrderEntity implements Serializable{

 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2593865624600082345L;
	/**订单Id*/
	private Long id;
	/**订单号*/
	private String orderNo; 
	/**订单状态*/
	private String orderStatus;
	/**创建时间*/
	private Date createTime;
	/**操作人*/
	private String operator;
	/**订单来源地*/
	private String orderFrom;
	/**订单去向*/
	private String orderTo;
	/**更新时间*/
	private Date updateTime;
	/**卖家订单号*/
	private String sellerOrderNo;
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	} 
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getOrderFrom() {
		return orderFrom;
	}
	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}
	public String getOrderTo() {
		return orderTo;
	}
	public void setOrderTo(String orderTo) {
		this.orderTo = orderTo;
	}
	public String getSellerOrderNo() {
		return sellerOrderNo;
	}
	public void setSellerOrderNo(String sellerOrderNo) {
		this.sellerOrderNo = sellerOrderNo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
