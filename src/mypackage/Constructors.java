package mypackage;

public class Constructors {
String username;
String password;
String email;
int mnumber;
public Constructors(String username,String password,String email,int mnumber){
	this.username = username;
	this.password = password;
	this.email =email;
	this.mnumber = mnumber;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Constructors c = new Constructors("abcd","123245","pqr@gmail.com",987677);
	}

}
