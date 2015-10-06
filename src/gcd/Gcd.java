package gcd;

public class Gcd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(gcd(-2,9));
		System.out.println(gcd(2,2));
		System.out.println(gcd(3,4));
		System.out.println(gcd(4,2));
	}
	
	/**
	 * 欧几里德算法,求两个非负整数的最大公约数
	 * @param p
	 * @param q
	 * @return 两个非负整数的最大公约数
	 */
	public static int gcd(int p,int q){
		if(p < 0 || q < 0){
			return -1;
		}
		
		if(q == 0){
			return p;
		}
		return gcd(q,p%q);
	}

}
