import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b,t;
      t = a;
      a = a % 10;
      t = t/100;
      b= a + t;
      System.out.println(b);
	}
}