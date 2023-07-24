package Stdu;
import java.util.*;
public class Pairsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,j,k,cnt=0;
		n=sc.nextInt();
		k=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
		for(i=0;i<n;i++) {
			for(j=i;j<n;j++) {
				if(a[i]+a[j]==k) {
					cnt++;
				}
			}
			if(a[i]==k) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
