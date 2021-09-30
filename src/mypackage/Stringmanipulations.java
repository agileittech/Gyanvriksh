package mypackage;

public class Stringmanipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = " Hellooooo world";
String s2 = "HELLO WORLD";
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.length());
String s [] = s1.split(" ",2);
System.out.println(s[1]);
System.out.println(s1.indexOf("d"));
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
System.out.println(s1.trim());
System.out.println(s1.replace("o", "@"));
System.out.println(s1.concat(s2));
	}

}
