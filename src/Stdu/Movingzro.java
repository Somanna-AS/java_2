package Stdu;
import java.util.Arrays;

public class Movingzro {

	public static void main(String[] args) {
	    int[] n = {5, 2, 0, 1, 5, 0}; // Replace this with your array of numbers
	    int i,c=n.length,cnt = 0,x=0;
	    int[] res = {};

        System.out.println("Original array: ");
        for(i=0;i<n.length;i++) {
        	System.out.print(n[i]+" ");
        }
        System.out.println();
        
        System.out.println("new array: ");
        for(i=0;i<n.length;i++) {
        	if(n[i]!=0) {
        		System.out.print(n[i]+" ");
        	}

        }
        for(i=0;i<n.length;i++) {
        	if(n[i]==0) {
        		System.out.print(n[i]+" ");
        	}

        }
        
    }


	}


