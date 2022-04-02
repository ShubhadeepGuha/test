import java.util.*;
class matching
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m1=in.nextInt();
        int p1=in.nextInt();
        int m2=in.nextInt();
        int p2=in.nextInt();
        int min=Integer.MAX_VALUE;
        for(int i=0;m1*i<=n;i++)
        {
            int rem=n-i*m1; 
            if(rem%m2==0)
            {
                int cost=p1*i+p2*(rem/2);
                min=(cost<min || min==-1)?cost:min;

            }
        }
        if(min!=-1)
        System.out.println(min);
    }
}