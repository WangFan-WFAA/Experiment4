package package1;

import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		final double n1 = 0.03;
		final double n2 = 0.1;
		final int s1 = 0,s2 = 2520;
		double t;
		int i = 1;
		
		while(i<=2) {
			System.out.println("第"+i+"位");
			Scanner console =new Scanner(System.in);
			try {
				System.out.println("请输入您的姓名：");
				String name1 = console.nextLine();
				System.out.println("请输入您的性别：");
				String sex1 = console.nextLine();
				System.out.println("请输入您的年龄：");
				int age1 = console.nextInt();
				System.out.println("请输入您的学费：");
				double pay1 = console.nextDouble();
				System.out.println("请输入您的月工资：");
				double fee1 = console.nextDouble();
				Doctor d = new Doctor(name1,sex1,age1,pay1,fee1);
				System.out.println("请稍后");
				System.out.println("您的学费为："+d.getFee());
				System.out.println("您的年收入为："+d.getFee()*12);
				
				if((d.getPay()*12-d.getFee())<=36000) {
					t = ((d.getPay()*12-d.getFee()))*n1-s1;
							System.out.println(d+"年应纳税额为："+t);
				}
				if((d.getPay()*12-d.getFee())>=36000&&(d.getPay()*12-d.getFee())<=14400) {
					t = ((d.getPay()*12-d.getFee()))*n2-s2;
							System.out.println(d+"年应纳税额为："+t);
				}
			}catch(Exception e) {
				System.out.println("数据有误请重试！");
			}
			i++;
		}
	}
}
	