package demo2;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num1 = sc.nextInt();
		System.out.println("请再输入一个整数");
		int num2 = sc.nextInt();
		System.out.println("两数之和为:" + (num1 + num2));
		System.out.println("两数之差为:" + (num1 - num2));
		System.out.println("两数之商为:" + (num1 / num2));
		System.out.println("两数之积为:" + (num1 * num2));
		sc.close();// TODO Auto-generated method stub

	}

}
