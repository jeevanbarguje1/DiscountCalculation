package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Product;
import com.capgemini.model.User;

public interface BillDetails {
	double billDetails(User user, List<Product> product);
}
