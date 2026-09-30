package demo2;

import java.util.Scanner;

public class Scannerdemo1 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		Scanner sc2 = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int i1 = sc1.nextInt();
		System.out.println("请再输入一个整数");
		int i2 = sc2.nextInt();
		System.out.println("两数和为" + (i1 + i2));
		sc1.close();
		sc2.close();
		// TODO Auto-generated method stub

	}

}
