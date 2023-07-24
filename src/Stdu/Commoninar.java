package Stdu;

public class Commoninar {
	public static void main(String[] args) {
		int[] n1= {1,5,10,20,40,80},n2= {6,7,20,80,10},n3= {3,4,15,20,30,70,80,10};
		for(int i=0;i<n1.length;i++) {
			for(int j=0;j<n2.length;j++) {
				for(int k=0;k<n3.length;k++) {
					if(n1[i]==n2[j]&&n2[j]==n3[k]) {
						System.out.print(n1[i] +" ");
					}
				}
			}
		}
	}

}
