import java.util.Scanner;
public class Number
{
  public static void Count(int n)
  {
    int s=0,c=0;
    while(n!=0)
    {
      s=n%10;
      c=c+1;
      n=n/10;
    }
      System.out.println("The number of digits present in the number is:");
      System.out.println(c);
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=in.nextInt();
    Count(n);
  }
}