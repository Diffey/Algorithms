package collection;

public class FixedCapacityStack<T> {

	private T [] a;
	private int N;
	
	public FixedCapacityStack(int cap){
		a = (T[])new Object [cap];
	}
	
	/**
	 * 栈是否为空
	 * @return
	 */
	public boolean isEmpty(){
		return N == 0;
	}
	
	/**
	 * 栈的大小
	 * @return
	 */
	public int size(){
		return N;
	}
	
	/**
	 * 将元素压入栈中
	 * @param item
	 */
	public void push(T item){
		if(N == a.length){
			resize(2 * a.length);
		}
		a[N++] = item;
	}
	
	/**
	 * 将元素弹出栈
	 * @return
	 */
	public T pop(){
		T item = a[--N];
		if(N > 0 && N == a.length/4){
			resize(a.length/2);
		}
		return item;
	}
	
	private void resize(int max){
		T [] temp = (T[]) new Object[max];
		for(int i=0;i<N;i++){
			temp[i] = a[i];
		}
		a = temp;
	}

}
