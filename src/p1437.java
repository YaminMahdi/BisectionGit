import java.util.Scanner;

public class p1437
{
    public static void main(String[] args)
    {
        int i,j,l;
        String x;
        char ans[] ={'L','S','O','N','L','S','O'};
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            l=sc.nextInt();
            if(l==0)
                break;
            sc.nextLine();
            x=sc.nextLine();
            for(i=0,j=0;j<l;j++)
            {
                if(x.charAt(j)=='D')
                    i++;
                else
                    i--;
                if(i>=4)
                    i-=4;
                else if(i<=-4)
                    i+=4;
                //System.out.println(ans[3+i]);
            }
            System.out.println(ans[3+i]);
        }

    }
}
