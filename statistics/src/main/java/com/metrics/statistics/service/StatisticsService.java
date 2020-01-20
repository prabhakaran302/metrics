package com.metrics.statistics.service;

import java.util.List;

import javax.validation.Valid;

import com.metrics.statistics.model.Account;
import com.metrics.statistics.model.DataPoint;

public interface StatisticsService {

	List<DataPoint> findByAccountName(String name);

	void save(String accountName, @Valid Account account);

}
