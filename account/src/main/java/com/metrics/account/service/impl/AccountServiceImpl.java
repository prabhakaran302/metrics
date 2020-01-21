package com.metrics.account.service.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metrics.account.model.Account;
import com.metrics.account.model.User;
import com.metrics.account.repository.AccountRepository;
import com.metrics.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account findByName(String name) {
		return null;
	}

	@Override
	public void saveChanges(String name, @Valid Account account) {
		accountRepository.save(account);
	}

	@Override
	public Account create(@Valid User user) {

		return null;
	}

}
