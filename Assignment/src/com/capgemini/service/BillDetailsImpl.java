package com.capgemini.service;

import java.util.List;
import com.capgemini.model.Product;
import com.capgemini.model.ProductType;
import com.capgemini.model.User;
import com.capgemini.model.UserType;

public class BillDetailsImpl implements BillDetails {

	private double groceriesAmount = 0.0;
	private double nongroceriesAmount = 0.0;
	private double disAmount = 0.0;
	private UserType userType = null;

	@Override
	public double billDetails(User user, List<Product> product) {
		// calculate the groceries amount
		for (Product pdt : product) {
			if (pdt.getProductType() == ProductType.GROCERIES) {
				groceriesAmount = groceriesAmount + pdt.getProductPrice();
			} else {
				nongroceriesAmount = nongroceriesAmount + pdt.getProductPrice();
			}
		}
		// calculate discount based upon the user

		userType = user.getUserType();
		if (userType == UserType.EMPLOYEE) {
			disAmount = ((nongroceriesAmount * 30) / 100);
		} else if (userType == UserType.AFFILIATE) {
			disAmount = ((nongroceriesAmount * 10) / 100);
		} else if (userType == UserType.OLDUSER) {
			disAmount = ((nongroceriesAmount * 5) / 100);
		} else if (userType == UserType.LATESTUSER) {
			int amount = (int) (nongroceriesAmount / 100);
			disAmount = nongroceriesAmount - (amount * 5);
		}
		return groceriesAmount + (nongroceriesAmount - disAmount);
	}
}
