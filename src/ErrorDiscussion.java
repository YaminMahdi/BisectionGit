import java.util.Scanner;

public class ErrorDiscussion
{
    public static int n;
    public static double x, ea, er, ep;

    public static void main(String[] args)
    {
        System.out.println("Enter 'X' and 'N' to calculate Absolute, Relative and Percentage Error.");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER the value of X: ");
        x=sc.nextDouble();
        System.out.print("ENTER the value of N: ");
        n=sc.nextInt();

        System.out.println("We know, \n\t\tAbsolute Error, \n\t\tEa= 1/2 * 10^N");
        System.out.printf("\t\t  = 1/2 * 10^%d\n",n);
        System.out.printf("\t\t  = 0.5 * %d/10\n",n);
        ea=0.5 * n/10;
        System.out.printf("\t\t  = %.3f\n",ea);

        System.out.println("We know, \n\t\tRelative Error, \n\t\tEr= Ea/X");
        System.out.printf("\t\t  = %.3f/%.3f\n",ea,x);
        er=ea/x;
        System.out.printf("\t\t  = %.3f\n",er);

        System.out.println("We know, \n\t\tPercentage Error, \n\t\tEp= Er*100%");
        ep=er*100;
        System.out.printf("\t\t  = %.3f%%\n",ep);
    }
}
