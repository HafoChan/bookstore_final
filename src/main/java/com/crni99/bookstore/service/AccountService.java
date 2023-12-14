package com.crni99.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crni99.bookstore.model.Account;
import com.crni99.bookstore.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	private AccountRepository account;

	public AccountService(AccountRepository account) {
		this.account = account;
	}

	public Optional<Account> findByusername(String username) {
		return account.findByusername(username);
	}

}