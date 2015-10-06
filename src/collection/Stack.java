package collection;

public class Stack<T>{
	
	/**
	 * 链表结点
	 * @author diff
	 *
	 */
	private class Node{
		T item;
		Node next;
	}
	
	//栈顶
	private Node first;
	private int N;
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int size(){
		return N;
	}
	
	public void push(T item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
		
	}
	
	public T pop(){
		T item = first.item;
		Node next = first.next;
		first.next = null;
		first = next;
		return item;
	}
}
