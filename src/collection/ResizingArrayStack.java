package collection;

import java.util.Iterator;

public class ResizingArrayStack<T> implements Iterable<T>{
	private T[] a = (T[])new Object[1];
	private int N = 0;
	
	public boolean isEmpty(){
		return N == 0;
	}
	
	public int size(){
		return N;
	}
	
	public void push(T item){
		if(N == a.length){
			resize(2 * a.length);
		}
		a[N++] = item;
	}
	
	public T pop(){
		T item = a[--N];
		a[N] = null;
		if(N > 0 && N < a.length/4){
			resize(a.length/2);
		}
		return item;
	}
	
	private void resize(int max){
		T[] temp = (T[])new Object[max];
		for(int i=0;i<N;i++){
			temp[i] = a[i];
		}
		a = temp;
	}

	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator();
	}
	
	class ReverseArrayIterator implements Iterator<T>{
		private int i = N;
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i > 0;
		}

		public T next() {
			// TODO Auto-generated method stub
			return a[--i];
		}

		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
