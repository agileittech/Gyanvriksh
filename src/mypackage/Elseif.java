package mypackage;

public class Elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 10,b = 5,c = 20,d=1;
if(a>b && a>c && a>d) {
	System.out.println("a is greater than b  c d");
}else if (b>a && b>c && b>d) {
	System.out.println("b is greater than a c d");
}else if (c>a && c>b && c>d) {
	System.out.println("c is greater than a b d");
}else {
	System.out.println("d is greater than a b c");
}
	}

}
