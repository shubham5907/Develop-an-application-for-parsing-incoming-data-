package javadeveloper.javadeveloper.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {

    @JsonProperty
	private Long OrderId ;
	private Double amount;
	private String currency;
	private String comment;
	
	public static int id=1;
	
	
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Long orderId, Double amount, String currency, String comment) {
		super();
		OrderId = orderId;
		this.amount = amount;
		this.currency = currency;
		this.comment = comment;
	}
	public Long getOrderId() {
		return OrderId;
	}
	public void setOrderId(Long orderId) {
		OrderId = orderId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	
	
}
