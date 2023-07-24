package Stdu;
import java.util.*;
public class Arrvalfnd {

	public static void main(String[] args) {
		int[] a= {10,2,31,4,5};
		int i,n,k;
		n=a.length;
		k=3;
		Arrays.sort(a);
		for(i=0;i<n;i++) {
			if(i==k-1) {
				System.out.println(a[i]);
			}
		}
	}

}
