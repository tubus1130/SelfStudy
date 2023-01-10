package chap04;

import chap04.IntQueue.EmptyIntQueueException;
import chap04.IntQueue.OverflowIntQueueException;

public class Queue<E> {
	private E[] que;
	private int capacity;
	private int front;
	private int rear;
	private int num;
	
	public static class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {
			
		}
	}
	
	public static class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {
			
		}
	}
	
	public Queue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = (E[]) new Object[capacity];
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public E enque(E x) throws OverflowIntQueueException{
		if(num >= capacity) {
			throw new OverflowIntQueueException();
		}
		que[rear++] = x;
		num++;
		if(rear == capacity) {
			rear = 0;
		}
		return x;
	}
	
	public E deque() throws EmptyIntQueueException{
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		E x = que[front++];
		num--;
		if(front == capacity) {
			front = 0;
		}
		return x;
	}
	
	public E peek() throws EmptyIntQueueException{
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int indexOf(E x) {
		for(int i=0; i<num; i++) {
			int idx = (i + front) % capacity;
			if(que[idx].equals(x)) {
				return idx;
			}
		}
		return -1;
	}
	
	public int search(E x) {
		for(int i=0; i<num; i++) {
			if(que[(i + front) % capacity].equals(x)) {
				return i + 1;
			}
		}
		return 0;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= capacity;
	}
	
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어있습니다.");
		}else {
			for(int i=0; i<num; i++) {
				System.out.print(que[(i + front) % capacity] + " ");
			}
			System.out.println();
		}
	}
}
