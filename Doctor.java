package package1;



public class Doctor implements Student,Teacher{
	String name;
	String sex;
	int age;
	double fee;
	double pay;
	
	// ʵ�ֽӿ��еĳ��󷽷�
	public void setPay(double p1) {
		pay = p1;
		System.out.println("���������Ϊ��" + p1);
	}
	
	// ʵ�ֽӿ��еĳ��󷽷�
	public double getPay() {
		return pay;
	}
	
	// ʵ�ֽӿ��еĳ��󷽷�
	public void setFee(double f1) {
		fee = f1;
		System.out.println("���ѧ��Ϊ��" + f1);
	}
	
	// ʵ�ֽӿ��еĳ��󷽷�
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
		return "����"+name+"�Ա�"+sex+"����"+age+"ѧ��"+fee+"mÿ�¹���"+pay;
	}
	}