package Stdu;

public class Str {

	public static void main(String[] args) {
		StringBuffer s3=new StringBuffer();
		System.out.println(s3.length());
		System.out.println(s3.capacity());
		s3.append("abcdefghijklmnopq");
		StringBuffer s2=new StringBuffer("hello");
		System.out.println(s3.length());
		System.out.println(s3.capacity());
	}

}
  