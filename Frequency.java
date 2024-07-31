import java.util.Scanner;
public class Frequency 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=2233;
        int n,l=0,count=1,i;
        String s = Integer.toString(a);
        char c[]=s.toCharArray();
        System.out.println("Index of the number which you want to check:");
        n=in.nextInt();
        l=s.length();
        for(i=0;i<=l;i++);
        {
            if(c[i]==c[n])
            {
                count++;
            }
        }
        System.out.println("Frequency of the given index:"+count);
    }    
}
