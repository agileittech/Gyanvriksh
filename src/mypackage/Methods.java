package mypackage;

public class Methods {
static int p; //static instance variable
int q; //non static instance/global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methods m = new Methods();
print();    //FIFO
sum(10,10);
int str = m.print("return print");
System.out.println("This is the method from return"+str);
	}
private static void print() {
	System.out.println("This is a method for print");
}
public static void sum(int a , int b) {
	int c = a+b;
	System.out.println(c);
}
public int print(String str) {//overloaded method
	System.out.println(str);
	return 1;
	
}
}
