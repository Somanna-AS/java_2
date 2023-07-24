package Stdu;
import java.util.*;
public class Subarrsum {
	static String subarr(int[] ar, int sm) {
		for(int i=0;i<ar.length;i++) {
			int arsm=0;
			for(int j=i;j<ar.length;j++) {
				arsm=arsm+ar[j];
				if(arsm==sm) {
					return i+" "+j;
				}
						
			}
		}
		return "-1";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ent the size");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("ent the sum");
		int s=sc.nextInt();
		System.out.println(subarr(a,s));
	}

}
