package Stdu;

public class Cntlardig {

	public static void main(String[] args) {
		int a[]= {7,4,8,2,9,3,61};
		int cnt=0,flg=0;
		if(a[0]>0) {cnt=1;}
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]>a[j]) {
					flg=1;
				}
				else
				{
					flg=0;
					break;
				}
			}
			if(flg==1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
