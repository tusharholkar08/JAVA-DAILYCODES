import java.util.*;

class PriorityDemo{
	public static void main(String[]args){
		PriorityQueue pq = new PriorityQueue();
		pq.offer(10);
		System.out.println(pq);

		pq.offer(50);
		System.out.println(pq);

		pq.offer(30);
		System.out.println(pq);

		pq.offer(40);
		System.out.println(pq);

		pq.offer(20);
		System.out.println(pq);
	}
}
