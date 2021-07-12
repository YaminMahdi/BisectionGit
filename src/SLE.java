import java.util.Scanner;

public class SLE
{
    public static int p,q,r,s,t,u,aMod;
    public static void main(String[] args)
    {
        System.out.println("Let,\n" +
                "    The 1st equation is (P*x)+(Q*y)=R.\n" +
                "    The 2nd equation is (S*x)+(T*y)=U.\n" +
                "    Now ENTER the value of P,Q,R,S,T,U to continue.");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER the value of P: ");
        p=sc.nextInt();
        System.out.print("ENTER the value of Q: ");
        q=sc.nextInt();
        System.out.print("ENTER the value of R: ");
        r=sc.nextInt();
        System.out.print("ENTER the value of S: ");
        s=sc.nextInt();
        System.out.print("ENTER the value of T: ");
        t=sc.nextInt();
        System.out.print("ENTER the value of U: ");
        u=sc.nextInt();

        System.out.println("\nWe write the above equations in the matrix form as follows,");
        //System.out.format("_       _   _   _     _   _\n");//‾
        String leftAlignFormat = "|¯ %-2s   %-2s ¯| |¯ %-2s ¯|   |¯ %-2s ¯|\n";
        String leftAlignFormat1 = "|_ %-2s   %-2s _| |_ %-2s _|   |_ %-2s _|\n";
        System.out.format(leftAlignFormat,p,q,"x",r);
        System.out.println("|           | |      | = |      |");
        System.out.format(leftAlignFormat1,s,t,"y",u);
        aMod=((p*t)-(q*s));
        System.out.println("=>    A      *    X    =     B\n" +
                "=> (A^-1 * A) * X  =  A^-1 * B\n" +
                "=>     1      * X  =  A^-1 * B\n" +
                "∴ X  =  A^-1 * B\n" +
                "\nWe know,\n" +
                "          A^-1 = 1/|A| * Adj(A)   When |A|!=0\n" +
                "Now, |A|= ("+p*t+")-("+q*s+") = "+aMod+"");
        if(aMod==0)
            System.out.println("Here |A|=0. So, A^-1 dosn't exist.");
        else
            System.out.println("Here |A|!=0. So, A^-1 exist.");
        System.out.printf("So, Adj(a)=|¯ %d %d ¯|\n           |_ %d %d _|\n",t,-1*q,-1*s,p);
        System.out.printf("∴ X=(1/%d)|¯ %d %d ¯| * |¯ %d ¯|\n         |_ %d %d _|  |_ %d _|\n",aMod,t,-1*q,r,-1*s,p,u);
        int x=(t*r+(-1)*q*u)/aMod;
        int y=((-1)*s*r+p*u)/aMod;
        System.out.printf("X= |¯ %d ¯|\n   |_ %d _|\n",x,y);

        System.out.printf("So, here the value of x is %d and the value of y is %d.\n",x,y);

    }
}

