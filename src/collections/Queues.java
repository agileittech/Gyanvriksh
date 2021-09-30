package collections;

import java.util.PriorityQueue;

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
pq.add(1);
pq.add(4);
pq.add(5);
pq.add(10);
System.out.println(pq);
System.out.println(pq.peek());
System.out.println(pq.poll()); //pulled the 1st value deletes
System.out.println(pq.peek());
System.out.println(pq);
	}

}
