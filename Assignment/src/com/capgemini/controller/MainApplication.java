package com.capgemini.controller;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Product;
import com.capgemini.model.ProductType;
import com.capgemini.model.User;
import com.capgemini.model.UserType;

import com.capgemini.service.BillDetailsImpl;

public class MainApplication {

	public static void main(String[] args) {

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

		/*
		 * BillDetails bill = new BillDetailsImpl(); User user = new User();
		 * List<Product> product = new ArrayList<>();
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Please enter the User name: " + sc.nextLine()); String name
		 * = sc.nextLine();
		 * System.out.println("Enter the type of user: 1-> Employee Of the Store" +
		 * " 2-> affiliate User      " + " 3-> Old User user> 2 years" +
		 * " 4-> New User ");
		 * 
		 * int type = sc.nextInt(); user.setName(name); if (type == 1) {
		 * user.setUserType(UserType.EMPLOYEE); } else if (type == 2) {
		 * user.setUserType(UserType.AFFILIATE); } else if (type == 3) {
		 * user.setUserType(UserType.OLDUSER); }
		 * 
		 * 
		 * System.out.println("How many product details you want to enter :");
		 * 
		 * int productCount = sc.nextInt(); List<Product> list = new ArrayList<>();
		 * Product A[]=new Product[productCount];
		 * 
		 * for (int i = 0; i < productCount; i++) {
		 * System.out.println("enter the product name: "); String productName =
		 * sc.nextLine(); System.out.println("enter the product type 1-->GROCERIES" +
		 * "2-->NONGROCERIES"); int input = sc.nextInt(); ProductType productType =
		 * (input == 1) ? (ProductType) ProductType.GROCERIES :
		 * ProductType.NONGROCERIES; System.out.println("enter the product price: ");
		 * double productPrice = sc.nextDouble();
		 * 
		 * A[i].setProductName(productName); A[i].setProductPrice(productPrice);
		 * A[i].setProductType(productType); }
		 */

		List<Product> list = new ArrayList<Product>();
		list.add(product1);
		list.add(product2);
		BillDetailsImpl billDetails = new BillDetailsImpl();
		double bill = billDetails.billDetails(user, list);
		System.out.println(bill);
	}
}
