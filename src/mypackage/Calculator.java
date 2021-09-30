package mypackage;

public class Calculator {
	public static void main(String[] args) {
	int x = sum(3,2,1);
	avg(x);
	}
public static int sum(int a , int b ,int c) {
	int d = a+b+c;
	System.out.println(d);
	return d;
}
public void sub(int a , int b , int c) {
	int d = c-b-a;
	System.out.println(d);
}
public static void avg(int sum) {
	int avg = sum/2;
	System.out.println(avg);
}
}
