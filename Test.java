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
			System.out.println("��"+i+"λ");
			Scanner console =new Scanner(System.in);
			try {
				System.out.println("����������������");
				String name1 = console.nextLine();
				System.out.println("�����������Ա�");
				String sex1 = console.nextLine();
				System.out.println("�������������䣺");
				int age1 = console.nextInt();
				System.out.println("����������ѧ�ѣ�");
				double pay1 = console.nextDouble();
				System.out.println("�����������¹��ʣ�");
				double fee1 = console.nextDouble();
				Doctor d = new Doctor(name1,sex1,age1,pay1,fee1);
				System.out.println("���Ժ�");
				System.out.println("����ѧ��Ϊ��"+d.getFee());
				System.out.println("����������Ϊ��"+d.getFee()*12);
				
				if((d.getPay()*12-d.getFee())<=36000) {
					t = ((d.getPay()*12-d.getFee()))*n1-s1;
							System.out.println(d+"��Ӧ��˰��Ϊ��"+t);
				}
				if((d.getPay()*12-d.getFee())>=36000&&(d.getPay()*12-d.getFee())<=14400) {
					t = ((d.getPay()*12-d.getFee()))*n2-s2;
							System.out.println(d+"��Ӧ��˰��Ϊ��"+t);
				}
			}catch(Exception e) {
				System.out.println("�������������ԣ�");
			}
			i++;
		}
	}
}
	