package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
		// TODO Auto-generated constructor stub
		
		LeapController lc = new LeapController();
		Calendar c = Calendar.getInstance();
		if (lc.isLeapYear(0)) {
			System.out.println(c.get(Calendar.YEAR)+"년은 윤년입니다.");
		} else {
			System.out.println(c.get(Calendar.YEAR)+"년은 평년입니다.");
		}
		System.out.println("총 날짜 수 : "+lc.leapDate(c.getInstance()));
		
	}

}
