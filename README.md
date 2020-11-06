# 实验四 接口及异常处理实验
## Experiment4 计191 王帆 2019310198
##
## 一、实验目的
#### 1、掌握Java中抽象类和抽象方法的定义； 
#### 2、掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；
#### 3、了解异常的使用方法，并在程序中根据输入情况做异常处理。
## 
## 二、实验内容
#### 某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
####  （1）、设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
####  （2）、设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。
####  （3）、编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。
## 
## 三、实验要求
#### 1、在博士研究生类中实现各个接口定义的抽象方法;
#### 2、对年学费和年收入进行统计，用收入减去学费，求得纳税额；
#### 3、国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
#### 4、实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
#### 5、根据输入情况，要在程序中做异常处理。
## 
## 四、操作过程
## 1、首先在首先在Eclipse中创建放置此次代码的project，pack，再分别创建Doctor、Student|Teacher和Test4个类，分别在每个类里写入代码；
## 2、根据实验要求

## 五、核心代码
#### while(i<=2) {
#### System.out.println("第"+i+"位");
#### 			Scanner console =new Scanner(System.in);
#### 				System.out.println("请输入您的姓名：");
#### 				String name1 = console.nextLine();
#### 				System.out.println("请输入您的性别：");
#### 				String sex1 = console.nextLine();
#### 				System.out.println("请输入您的年龄：");
#### 				int age1 = console.nextInt();
#### 				System.out.println("请输入您的学费：");
#### 				double pay1 = console.nextDouble();
#### 				System.out.println("请输入您的月工资：");
#### 				double fee1 = console.nextDouble();
#### 				Doctor d = new Doctor(name1,sex1,age1,pay1,fee1);
#### 				System.out.println("请稍后");
#### 				System.out.println("您的学费为："+d.getFee());
#### 				System.out.println("您的年收入为："+d.getFee()*12);
#### 				
#### 				try {
#### 				if((d.getPay()*12-d.getFee())<=36000) {
#### 					t = ((d.getPay()*12-d.getFee()))*n1-s1;
#### 							System.out.println(d+"年应纳税额为："+t);
#### 				}
#### 				if((d.getPay()*12-d.getFee())>=36000&&(d.getPay()*12-d.getFee())<=14400) {
#### 					t = ((d.getPay()*12-d.getFee()))*n2-s2;
#### 							System.out.println(d+"年应纳税额为："+t);
#### 				}
#### 			}catch(Exception e) {
#### 				System.out.println("数据有误请重试！");
#### 			}
      
## 六、运行结果
![i](https://github.com/WangFan-WFAA/Experiment4/blob/main/%E5%AE%9E%E9%AA%8C%E5%9B%9B%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png)
## 七、实验感想
#### 此次实验主要关于接口和异常处理的应用。
