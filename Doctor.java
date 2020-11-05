package package1;



public class Doctor implements Student,Teacher{
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	
	// 实现接口中的抽象方法
	public void setPay(double p1) {
		pay = p1;
		System.out.println("你的年收入为：" + p1);
	}
	
	// 实现接口中的抽象方法
	public double getPay() {
		return pay;
	}
	
	// 实现接口中的抽象方法
	public void setFee(double f1) {
		fee = f1;
		System.out.println("你的学费为：" + f1);
	}
	
	// 实现接口中的抽象方法
	@Override
	public double getFee() {
		return fee;
	}
	Doctor(String n,String s,int a,double f,double p){
		this.name=n;
		this.sex=s;
		this.age=a;
		this.fee=f;
		this.pay=p;
	}
	public String toString() {
		return "姓名"+name+"性别"+sex+"年龄"+age+"学费"+fee+"m每月工资"+pay;
	}
	}