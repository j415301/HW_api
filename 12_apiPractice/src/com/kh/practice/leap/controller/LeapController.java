package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	
	public boolean isLeapYear(int year) {
		Calendar c = Calendar.getInstance();
		if (c.get(Calendar.YEAR)%4==0 && (c.get(Calendar.YEAR)%100!=0 ||
				c.get(Calendar.YEAR)%400==0)) {
			return true;
		}
		return false;
	}
	
	public long leapDate(Calendar c) {
		Calendar today = c;
		long totalDay = 0;
		for (int i=0 ; i<=2021 ; i++) {
			if (i!=c.get(Calendar.YEAR)) {
				if (i%4==0 && (i%100!=0 || i%400==0)) {
					totalDay += 365;
				} else {
					totalDay += 366;
				}
			} else {
				totalDay += c.get(Calendar.DAY_OF_YEAR);
			}
		}
		return totalDay;
	}

}
