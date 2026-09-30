
package demo2;

import java.util.Scanner;

public class MyInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("请输入姓名：");
	        String name = sc.nextLine();

	        System.out.print("请输入学号：");
	        String studentId = sc.nextLine();

	        System.out.print("请输入性别：");
	        String gender = sc.nextLine();

	        System.out.print("请输入年龄：");
	        int age = sc.nextInt();
	        sc.nextLine();
	        System.out.print("请输入一句自我激励的话：");
	        String motto = sc.nextLine();

	        System.out.println();
	       
	        System.out.println("姓名：" + name);
	        System.out.println("学号：" + studentId);
	        System.out.println("性别：" + gender);
	        System.out.println("年龄：" + age);
	       
	        System.out.println("自我激励：" + motto);

	        sc.close();
	    }
	// TODO Auto-generated method stub

	}


