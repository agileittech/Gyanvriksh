package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> ts = new TreeSet<Integer>();
ts.add(34);
ts.add(75);
ts.add(10);
ts.add(25);
System.out.println("The first value is"+ts.first());
System.out.println("The lastvalue is"+ts.last());
Iterator<Integer> i = ts.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
