package collection;

import java.util.Iterator;

public class Queue<T> implements Iterable<T>{
	
	private class Node{
		T item;
		Node next;
	}
	
	private Node first;
	private Node last;
	private int N;
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public int size(){
		return N;
	}
	
	public void enqueue(T item){
		//向表尾添加元素
		Node oldlast = last;
		last = new Node();
		last.item = item;
		if(isEmpty()){
			first = last;
		}else{
			oldlast.next = last;
		}
		N++;
	}
	
	public T dequeue(){
		//从表头删除元素
		Node oldfirst = first;
		first = first.next;
		oldfirst.next = null;
		N--;
		if(isEmpty()){
			last = null;
		}
		return oldfirst.item;
	}

	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<T>{
		private Node current = first;
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current != null;
		}

		public T next() {
			// TODO Auto-generated method stub
			T item = current.item;
			current = current.next;
			return item;
		}

		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	} 
}
