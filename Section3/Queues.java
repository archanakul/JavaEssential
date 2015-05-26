package Section3;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {
	public static void main(String[] args){
		/* head <- 000000000000 <- Trail FIFO structure */ 
		
		//////////////////  Throws Exceptions  //////////////////  
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3); //Creates a queue with the given (fixed) capacity & default access policy.
		q1.add(10);
		q1.add(20);
		q1.add(30);
		System.out.println("Head of ArrayBlockingQueue: " + q1.element()); // retrieves but does not remove
		try{
			q1.add(40);
		} catch(IllegalStateException e){
			System.out.println("ArrayBlockingQueue can not have elements more than its capacity");
		}
		
		System.out.println("Removed the element at the head: " + q1.remove()); // remove the head of the queue
		System.out.println("Removed the element at the head: " + q1.remove());
		System.out.println("Removed the element at the head: " + q1.remove());
		try{
			System.out.println("Removed the element at the head: " + q1.remove());
		}catch (NoSuchElementException e){
			System.out.println("ArrayBlockingQueue is already empty");
		}
		try{
			System.out.println("Head of ArrayBlockingQueue: " + q1.element()); // retrieves but does not remove
		}catch(NoSuchElementException e){
			System.out.println("ArrayBlockingQueue is empty");
		}
		
		////////////////// Returns Special Values //////////////////  
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		q2.offer(10);
		q2.offer(20);
		System.out.println("Head of ArrayBlockingQueue: " + q2.peek()); // retrieves but does not remove
		
		if (q2.offer(10) == false){
			System.out.println("Offer failed to add more that the initial capacity of the ArrayBlockingQueue");
		}
		for(Integer item: q2){
			System.out.println("Queue 2 item: " + item);	
		}
		
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		if (q2.poll() == null){
			System.out.println("ArrayBlockingQueue is already empty");
		}
		
		if (q2.peek() == null){
			System.out.println("ArrayBlockingQueue is already empty");
		}
		
	}
}
