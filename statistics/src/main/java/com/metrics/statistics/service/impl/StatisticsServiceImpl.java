package com.metrics.statistics.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.metrics.statistics.model.Account;
import com.metrics.statistics.model.DataPoint;
import com.metrics.statistics.service.StatisticsService;

@Service
public class StatisticsServiceImpl implements StatisticsService {

	@Override
	public List<DataPoint> findByAccountName(String name) {
		return null;
	}

	@Override
	public void save(String accountName, @Valid Account account) {

	}

}
