package collections;

import java.util.concurrent.PriorityBlockingQueue;

public class Priorityblocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>();
	pbq.add(1);
	pbq.add(2);
	pbq.add(3);
	System.out.println(pbq);
	System.out.println(pbq.peek());
	System.out.println(pbq.poll());
	//System.out.println(pbq.drainTo(c));
	}

}
