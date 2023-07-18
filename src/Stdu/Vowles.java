package Stdu;

public class Vowles {
    static void rephrase(char b[]) {
        int i, j, k = 0, l;
        char vo[] = new char[b.length]; 
        l = b.length;
        for (i = l - 1, j = 0; i >= 0; i--, j++) {
            if (j == l)
                break;
            else {
                if (b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u') {
                    vo[j] = b[i];
                    System.out.print(vo[j]+" ");
                }
            }
        }
        char co[] = new char[b.length]; 
        for(i=0;i<l;i++) {
            if (b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u') {
        		
        	}
            else
            	System.out.print(" "+b[i]);
        }


    }

    public static void main(String[] args) {
        char ar[] = { 'b', 'b', 'a', 'x', 'e', 'z', 'l', 'i', 'o', 'a', 'q', 'u', 'i' };
        rephrase(ar);
    }
}
