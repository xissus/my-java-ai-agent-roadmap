package demo2;

import java.util.Scanner;

public class temperature1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个华氏度:");
		double f = sc.nextDouble();
		double t = (f - 32) * 5.0 / 9.0;
		System.out.println("摄氏度为:" + t);
		sc.close();// TODO Auto-generated method stub

	}

}
