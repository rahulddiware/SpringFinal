package com.nt.beans;

public class FirstFlight implements Courier {

	public String deliver(int orderId) {

		return orderId + "  order is delived::: Firstflight";
	}

}
