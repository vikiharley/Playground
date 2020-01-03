import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int first_digit,second_digit,third_digit;
    first_digit = a / 100 ;
    second_digit = ((a/10)%10);
    third_digit = a % 10;
   int reverse = (third_digit * 100) + (second_digit * 10) + (first_digit);
    System.out.println(reverse);
  }
}