import java.util.Scanner;

public class p1217
{
    public static void main(String[] args)
    {
        int t,i,kg;
        double dam=0, taha, ojon=0;
        String sen;
        Scanner sc = new Scanner(System.in);
        t= sc.nextInt();
        for(i=1;i<=t;i++)
        {
            taha=sc.nextDouble();
            sc.nextLine();
            sen = sc.nextLine();
            dam+=taha;
            kg=1;
            for(int j=1;j<sen.length();j++)
            {
                if(sen.charAt(j)==32)
                    kg++;
            }
            System.out.printf("day %d: %d kg\n",i,kg);
            ojon+=kg;
        }
        System.out.printf("%.2f kg by day\nR$ %.2f by day\n",ojon/t,dam/t);

    }
}
