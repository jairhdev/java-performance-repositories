package com.jairhdev.performancerepositories.model.entities;

import java.time.Duration;
import java.time.LocalTime;

public class Result {

	private int quantitySave;
	private long totalTimeMillis;
	private long totalTimeSeconds;

	public Result() {
	}

	public Result(int quantitySave, LocalTime timeStart, LocalTime timeEnd) {
		this.quantitySave = quantitySave;
		this.totalTimeMillis = Duration.between(timeStart, timeEnd).toMillis();
		this.totalTimeSeconds = Duration.between(timeStart, timeEnd).toSeconds();
	}

	public int getQuantitySave() {
		return quantitySave;
	}

	public long getTotalTimeMillis() {
		return totalTimeMillis;
	}

	public long getTotalTimeSeconds() {
		return totalTimeSeconds;
	}

}
