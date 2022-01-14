package CollectionFrameWork;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {//FIFO
	public static void main(String[] args) {
		Queue q=new LinkedList();
		
		q.add(1);
		q.add("java");
		q.add('a');
		q.add(2);
		q.offer(5);
		q.offer('b');
		System.out.println(q);
		System.out.println(q.offer(8));
		System.out.println(q);
		System.out.println(q.offer(5));
		System.out.println(q);
		System.out.println(q.peek());//show but not remove element
		System.out.println(q);
		System.out.println(q.poll());//it remove elements from queue
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.remove());
		System.out.println(q);
		
		Queue q1 = new PriorityQueue<>();
		//accept only type of element which insert first 
		
		q1.add('a');
		q1.add('1');
		q1.add('b');
		System.out.println(q1);
		System.out.println(q1.offer('a'));
		
		Integer i = new Integer(6);
		q.add(i);
		System.out.println(q);
		
		Character c = new Character('a');
		
		q1.add(c);
		System.out.println(q1);
		
		Character v = (Character) q1.peek();
		System.out.println(v);

	}
	

}
