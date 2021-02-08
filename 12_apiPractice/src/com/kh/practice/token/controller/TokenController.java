package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		// TODO Auto-generated constructor stub
	}
	
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		String strr = "";
		while (st.hasMoreTokens()) {
			strr += st.nextToken();
		}
		return strr;
	}
	
	public String firstCap(String input) {
		String changeCap = input.replace(input.substring(0,1), (input.substring(0,1)).toUpperCase());
		return changeCap;
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		for (int i=0 ; i<input.length() ; i++) {
			if (input.charAt(i)==one) {
				count++;
			}
		}
		return count;
	}

}
