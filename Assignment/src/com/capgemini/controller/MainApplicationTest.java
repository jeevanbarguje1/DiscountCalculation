package com.capgemini.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.capgemini.model.Product;
import com.capgemini.model.ProductType;
import com.capgemini.model.User;
import com.capgemini.model.UserType;
import com.capgemini.service.BillDetailsImpl;

class MainApplicationTest {

	@Test
	void testMain() {
		User user = new User();
		user.setName("Jeevan");
		user.setUserType(UserType.EMPLOYEE);

		Product product1 = new Product();
		Product product2 = new Product();

		product1.setProductName("A");
		product1.setProductPrice(500);
		product1.setProductType(ProductType.GROCERIES);

		product2.setProductName("B");
		product2.setProductPrice(400);
		product2.setProductType(ProductType.NONGROCERIES);
		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		BillDetailsImpl billDetails = new BillDetailsImpl();
		double bill = billDetails.billDetails(user, list);
		Assert.assertNotNull(bill);

	}

}
