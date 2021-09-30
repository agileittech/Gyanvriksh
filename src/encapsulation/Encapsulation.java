package encapsulation;

public class Encapsulation {
private int empid;
private String empname;

public int getempid() {    //getter method
	return empid;
}
public String getempname() {  //getter method
	return empname;
}
public void setempid(int newempid) {  //setter method
	this.empid = newempid;
}
public void setempname(String newempname) { //settermethod
	this.empname = newempname;
}
}
