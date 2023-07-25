package Stdu;

public class Facto {

	public static void main(String[] args) {
		int n=5;
		int fact=facto(n);
		System.out.println(fact);
	}
	public static int facto(int x) {
		if(x>1) {
			return x*facto(x-1);
		}
		else 
			return 1;
	}

}
