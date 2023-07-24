package Stdu;
import java.util.*;
public class Fact {

	static int fact(int n) 
	{
		int prod = 1;
		for(int i=1;i<n;i++) {
		prod= prod*i;
		}
	return prod;
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		int d=0,sum=0;
		int t=n;
		while(t>0) {
			d++;
			t=t/10;
		}
		if(d%2==0) {
			t=n;
			while(t>0) {
				int rem=t%10;
				sum=sum+fact(rem);
				t=t/100;
			}
		}
		else
		{
			t=n;
			while(t>0) {
				t=t/10;
				int rem=t%10;
				sum=sum+fact(rem);
				t=t/10;
			}
			sum=sum-1;
		}
		System.out.println(sum);
	}
}
