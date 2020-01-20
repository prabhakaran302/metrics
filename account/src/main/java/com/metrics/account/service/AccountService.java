package com.metrics.account.service;

import javax.validation.Valid;

import com.metrics.account.model.Account;
import com.metrics.account.model.User;

public interface AccountService {

	Account findByName(String name);

	void saveChanges(String name, @Valid Account account);

	Account create(@Valid User user);

}
