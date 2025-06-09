//package Placement;
//TASK 1:[ CHECK FOR LEAP YEAR USING METHOD]
//public class task1 {
//	static void Leap(int year) {
//		if(year%4==0 && year%100!=0 && year%400==0) {
//			System.out.println("leap year");
//		}
//		else {
//			System.out.println("not leap year");
//		}
//	}
//		public static void main(String[] args) {
//			int year=2025;
//			task1.Leap(year);
//		}
//}
	



//TASK 1:[print all even numbers till 100]
//public class task1{
//	public static void main(String[] args) {
//			int a=100;
//		for(int i=1;i<=a;i++) {
//			if(a%2==0) {
//				i=i+1;
//				System.out.println(i);
//			}
//		}
//	}
//}
			
			
//TASK 1:[simple interest calculate using if]
//	public class task1{
//	public static void main(String[] args) {
//			int p=1000;
//			int r=5;
//			int t=2;
//			if(p>0 && r>0 && t>0) {
//				int si=(p*r*t/100);
//				System.out.println("simple interest = "+si);
//			}
//			}
//}



//TASK1:MENU DRIVEN CALCULATOR USING SWITCH AND METHODS (ADD,SUB,MUL,DIV):
//public class task1{
//	
//	static void calculator(int operator) {
//		int a=1;
//		int b=4;
//		switch(operator) {
//		case 1:
//			System.out.println(a+b);
//			break;
//		case 2:
//			System.out.println(a-b);
//			break;
//		case 3:
//			System.out.println(a*b);
//			break;
//		case 4:
//			System.out.println(a/b);
//			break;
//		default:
//			System.out.println("no operators");
//		}
//	}
//	public static void main(String[] args) {
//		task1.calculator(1);
//	}
//}


//TASK 1:STUDENT MARK AND RESULT USING GRADING LOGIC AND FUNCTIONS
//public class task1{
//	static void studentmark(int mark) {
//		if(mark>=90 && mark<100) {
//			System.out.println("grade A");
//		}
//		else if(mark<90 && mark>=80) {
//			System.out.println("grade B");
//		}
//		else if(mark<80 && mark>=70) {
//			System.out.println("grade C");
//		}
//		else if(mark<70 && mark>=60) {
//			System.out.println("grade D");
//		}
//		else if(mark<60 && mark>=50) {
//			System.out.println("grade E");
//		}
//		else if(mark<50 && mark>=40) {
//			System.out.println("grade F");
//		}
//		else {
//			System.out.println("fail");
//		}
//	}
//	public static void main(String[] args) {
//		int mark=30;
//		task1.studentmark(mark);
//	}
//}