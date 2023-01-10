package chap04;

public class Q7 {
	private int[] que;
	private int capacity;
	private int num;
	private int front;
	private int rear;
	
	public enum AorB {
		QueueA,
		QueueB
	};
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {
			
		}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {
			
		}
	}
	
	public Q7(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];
		}catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public int enqueFront(int x) throws OverflowIntQueueException{
		if(num >= capacity) {
			throw new OverflowIntQueueException();
		}
		num++;
		if(--front < 0) {
			front = capacity - 1;
		}
		que[front] = x;
		return x;
	}
	
	public int enqueRear(int x) throws OverflowIntQueueException{
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
	
}
