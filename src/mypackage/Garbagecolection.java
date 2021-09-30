package mypackage;

public class Garbagecolection {
int x = 40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Garbagecolection p = new Garbagecolection();
Garbagecolection q = new Garbagecolection();
Garbagecolection r = new Garbagecolection();
p.x = 10;
q.x = 20;
r.x = 30;

p = q;
q = r;
r = p;
System.out.println(p.x);
System.out.println(q.x);
System.out.println(r.x);
	}

}
