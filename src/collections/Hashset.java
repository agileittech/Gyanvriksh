package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs = new HashSet<String>();
hs.add("Hello");
hs.add("Hi");
hs.add("Hello");
hs.add("A");
Iterator<String> i = hs.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
