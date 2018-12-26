package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.model.Product;
import com.capgemini.model.ProductType;
import com.capgemini.model.User;
import com.capgemini.model.UserType;

public class BillDetailsImplTest {

	User user = new User();
	Product product1 = new Product();
	Product product2 = new Product();
	BillDetailsImpl billDetails = new BillDetailsImpl();

	@Test
	public void testBillDetails() {
		user.setName("Jeevan");
		user.setUserType(UserType.EMPLOYEE);
		product1.setProductName("A");
		product1.setProductPrice(500);
		product1.setProductType(ProductType.GROCERIES);

		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		double bill = billDetails.billDetails(user, list);
		Assert.assertNotNull(bill);

	}

	@Test
	public void testBillDetailsReturn() {
		
		user.setName("Jeevan");
		user.setUserType(UserType.EMPLOYEE);

		product1.setProductName("A");
		product1.setProductPrice(500);
		product1.setProductType(ProductType.GROCERIES);

		product2.setProductName("B");
		product2.setProductPrice(400);
		product2.setProductType(ProductType.NONGROCERIES);

		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		double bill = billDetails.billDetails(user, list);
		Assert.assertNotNull(bill);
		
	}
	
	@Test
	public void testBillDetailsReturn1() {
		
		user.setName("Jeevan");
		user.setUserType(UserType.AFFILIATE);

		product1.setProductName("A");
		product1.setProductPrice(500);
		product1.setProductType(ProductType.GROCERIES);

		product2.setProductName("B");
		product2.setProductPrice(400);
		product2.setProductType(ProductType.NONGROCERIES);

		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		double bill = billDetails.billDetails(user, list);
		Assert.assertNotNull(bill);
		
	}
	
	@Test
	public void testBillDetailsReturn2() {
		
		user.setName("Jeevan");
		user.setUserType(UserType.LATESTUSER);

		product1.setProductName("A");
		product1.setProductPrice(500);
		product1.setProductType(ProductType.GROCERIES);

		product2.setProductName("B");
		product2.setProductPrice(400);
		product2.setProductType(ProductType.NONGROCERIES);

		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		double bill = billDetails.billDetails(user, list);
		Assert.assertNotNull(bill);
		
	}
	@Test
	public void testBillDetailsReturn3() {
		
		user.setName("Jeevan");
		user.setUserType(UserType.OLDUSER);

		product1.setProductName("A");
		product1.setProductPrice(500);
		product1.setProductType(ProductType.GROCERIES);

		product2.setProductName("B");
		product2.setProductPrice(400);
		product2.setProductType(ProductType.NONGROCERIES);

		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		double bill = billDetails.billDetails(user, list);
		Assert.assertNotNull(bill);
		
	}
}
