package com.metrics.notification.service;

import com.metrics.notification.domain.NotificationType;
import com.metrics.notification.domain.Recipient;

import javax.mail.MessagingException;
import java.io.IOException;

public interface EmailService {

	void send(NotificationType type, Recipient recipient, String attachment) throws MessagingException, IOException;

}
