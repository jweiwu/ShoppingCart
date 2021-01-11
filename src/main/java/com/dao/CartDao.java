package com.dao;

import java.io.IOException;

import com.model.Cart;

public interface CartDao {

	Cart getCartByCartId(Integer CartId);
	
	Cart validate(Integer cartId) throws IOException;
	
	void update(Cart cart);
}
