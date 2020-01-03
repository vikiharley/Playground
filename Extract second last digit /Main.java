import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b,c;
      b = a%100;
      c = b/10;
      System.out.println(c);
	}
}