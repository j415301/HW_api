package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
		// TODO Auto-generated constructor stub
		
		LeapController lc = new LeapController();
		Calendar c = Calendar.getInstance();
		if (lc.isLeapYear(0)) {
			System.out.println(c.get(Calendar.YEAR)+"���� �����Դϴ�.");
		} else {
			System.out.println(c.get(Calendar.YEAR)+"���� ����Դϴ�.");
		}
		System.out.println("�� ��¥ �� : "+lc.leapDate(c.getInstance()));
		
	}

}
