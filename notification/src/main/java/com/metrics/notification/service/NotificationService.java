package com.metrics.notification.service;

import javax.validation.Valid;

import com.metrics.notification.model.Recipient;

public interface NotificationService {

	Object findByAccountName(String name);

	Object save(String name, @Valid Recipient recipient);

}
