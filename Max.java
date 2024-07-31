import java.util.Scanner;
public class Max
{
    public static void large(int n, int n1, int n2)
    {
        int l=0;
        if(n1>n2&&n1>n)
        {
            l=n1;
        }
        else if(n2>n)
        {
            l=n2;
        }
        else
        {
            l=n;
        }
        System.out.println("Maximum of three:");
        System.out.println(l);
    }
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the three numbers:");
    int n=in.nextInt();
    int n1=in.nextInt();
    int n2=in.nextInt();
    large(n,n1,n2);
    }
}