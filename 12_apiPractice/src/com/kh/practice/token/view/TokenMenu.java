package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			int cho = sc.nextInt();
			switch (cho) {
				case 1: tokenMenu(); break;
				case 2: sc.nextLine(); inputMenu(); break;
				case 9: System.out.println("���α׷��� �����մϴ�."); return;
				default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m "; 
		System.out.println("��ū ó�� �� ���� : "+str);
		System.out.println("��ū ó�� �� ���� : "+str.length());
		
		String afterStr = tc.afterToken(str);
		System.out.println("��ū ó�� �� ���� : "+afterStr);
		System.out.println("��ū ó�� �� ���� : "+afterStr.length());
		System.out.println("��� �빮�ڷ� ��ȯ : "+afterStr.toUpperCase());
		return;
	}
	
	public void inputMenu() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String changeCap = tc.firstCap(sc.nextLine());
		System.out.println("ù ���� �빮�� : "+changeCap);
		System.out.print("ã�� ���� �ϳ��� �Է��ϼ��� : ");
		char letter = sc.next().charAt(0);
		int num = tc.findChar(changeCap, letter);
		System.out.println(letter+" ���ڰ� �� ���� : "+num);
		return;
	}

}
