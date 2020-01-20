package com.metrics.account.service.impl;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.metrics.account.model.Account;
import com.metrics.account.model.User;
import com.metrics.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public Account findByName(String name) {
		return null;
	}

	@Override
	public void saveChanges(String name, @Valid Account account) {

	}

	@Override
	public Account create(@Valid User user) {

		return null;
	}

}
