package com.metrics.notification.service.impl;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.metrics.notification.model.Recipient;
import com.metrics.notification.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Override
	public Object findByAccountName(String name) {

		return null;
	}

	@Override
	public Object save(String name, @Valid Recipient recipient) {

		return null;
	}

}
