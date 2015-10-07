package sort;

/**
 * 选择排序
 * @author diff
 *
 */
public class Selection {
	
	public static void sort(Comparable [] a){
		for(int i=0;i<a.length;i++){
			int min = i;
			for(int j=i+1;j<a.length;j++){
				if(less(a[j],a[min])){
					min = j;
				}
			}
			exch(a, i, min);
		}
	}
	
	private static boolean less(Comparable v,Comparable w){
		return v.compareTo(w) < 0;
	}
	
	private static void exch(Comparable[] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static void show(Comparable[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static boolean isSorted(Comparable[] a){
		for(int i=1;i<a.length;i++){
			if(less(a[i], a[i-1])){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable[] a = new Integer []{3,0,99,72,-8};
		System.out.println(isSorted(a));
		sort(a);
		show(a);
		System.out.println(isSorted(a));
		
	}

}
