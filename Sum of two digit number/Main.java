import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b,c,t;
      b = a % 10 ;
      c = a / 10 ;
      t = b+ c;
      System.out.println(t);
	}
}