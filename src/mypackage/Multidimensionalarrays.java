package mypackage;

public class Multidimensionalarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [][] s = new String[3][2];
s[0][0] = "ABCD";
s[0][1] = "XYZ";
s[1][0] = "PQR";
s[1][1] = "UVW";
s[2][0] = "JKL";
s[2][1] = "CDE";
for(int i=0;i<s.length;i++) {
	for(int j=0;j<s[i].length;j++) {
    System.out.println(s[i][j]);
	}
}
System.out.println("The row size is"+s.length);
System.out.println("The col size is"+s[0].length);
	

}
}
