package Stdu;

public class Freq {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,4,3,4,4,4,4,45};
		int i,n,k=4,cnt=0;
		n=a.length;
		for(i=0;i<n;i++) {
			if(a[i]==k) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
