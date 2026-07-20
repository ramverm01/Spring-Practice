package com.nit.SpringCore_AutowiringusingbyName;

public class Order
{
	private int orderId;
	private String customerName;
	private String foodItem;
	private DeliveryPartner deliveryPartner;
	
	public Order()
	{
		super();
	}

	public int getOrderId() 
	{
		return orderId;
	}

	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerNane) 
	{
		this.customerName = customerNane;
	}

	public String getFoodItem()
	{
		return foodItem;
	}

	public void setFoodItem(String foodItem) 
	{
		this.foodItem = foodItem;
	}

	public DeliveryPartner getDeliveryPartner() 
	{
		return deliveryPartner;
	}

	public void setDeliveryPartner(DeliveryPartner deliveryPartner) 
	{
		this.deliveryPartner = deliveryPartner;
	}

	@Override
	public String toString()
	{
		return "Order [orderId=" + orderId + ", customerNane=" + customerName + ", foodItem=" + foodItem
				+ ", deliveryPartner=" + deliveryPartner + "]";
	}
	
}
