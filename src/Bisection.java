import java.util.Scanner;
import java.lang.Math;

public class Bisection
{
    public double a,b,c;
    public static int p,q,r,s;

    public static void main(String[] args)
    {

        System.out.println("Let,\n" +
                "    The equation is f(x)=(P*x^Q)+(R*x)+S=0.\n" +
                "    Now ENTER the value of P,Q,R,S to continue.");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER the value of P: ");
        p=sc.nextInt();
        System.out.print("ENTER the value of Q: ");
        q=sc.nextInt();
        System.out.print("ENTER the value of R: ");
        r=sc.nextInt();
        System.out.print("ENTER the value of S: ");
        s=sc.nextInt();
        System.out.print("So, the equation is f(x)=(");
        if(p>1)
            System.out.print(p);
        System.out.printf("x^%d)+(%dx)+(%d)\n",q,r,s);

        Bisection x= abCal();

        System.out.format("+-------------------------------------------------------------------------+\n");
        System.out.format("| Steps | a        | b        | f(a)     | f(b)     | c=a+b/2  | f(c)     |\n");
        System.out.format("+-------+----------+----------+----------+----------+----------+----------+\n");

        mainCal(1, x);

    }
    public static Bisection abCal()
    {
        double n=equCal(0), x=-1;
        System.out.println("Let,");
        while(n<0)
        {
            x++;
            n=equCal(x);
            System.out.printf("    x= %.0f; f(%.0f)= %.0f ", x,x,n);
            if(n<0)
                System.out.println("(-ve)");
            else
                System.out.println("(+ve)");
            //System.out.println(n);
        }
        System.out.printf("Hence the root lies in between %.0f and %.0f.\n", x-1,x);
        System.out.printf("So Assume, a=%.0f and b=%.0f.\n", x-1,x);
        //System.out.println(n+" "+x);
        Bisection obj = new Bisection();
        obj.a=x-1;
        obj.b=x;
        return obj;
    }
    public static double equCal(double x)
    {
        double ans, a,b,c=s,x1 = x;
        x1=Math.pow(x,q);
        a=p*x1;
        b=r*x;
        ans=a+b+c;
        //System.out.println(a+" "+b+" "+c+" "+ans);
        ans= Math.round(ans*100000)/100000.0d;
        return ans;
    }
    public static Bisection mainCal(int i, Bisection obj)
    {
        double fa,fb,fc, tmpC;
        fa=Math.round(equCal(obj.a)*100000)/100000.0d;
        fb=Math.round(equCal(obj.b)*100000)/100000.0d;
        tmpC = obj.c;
        obj.c=(obj.a+obj.b)/2;
        obj.c=Math.round(obj.c*100000)/100000.0d;
        fc=Math.round(equCal(obj.c)*100000)/100000.0d;

        String leftAlignFormat = "| %-5s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s |\n";
        System.out.format(leftAlignFormat, i,  obj.a, obj.b, fa, fb, obj.c, fc);
        System.out.format("+-------+----------+----------+----------+----------+----------+----------+\n");
        i++;
        if(fc>0)
            obj.b= obj.c;
        else
            obj.a= obj.c;
        if(tmpC!= obj.c)
            return mainCal(i, obj);
        System.out.printf("Since step %d and %d show the same value, Hence the real root is ", i-2, i-1);
        System.out.println(tmpC+".");
        return obj;
    }
}
