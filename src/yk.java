import java.util.Scanner;

public class yk
{
    public static void main(String[] args)
    {
        int c,i,data;
        double dis=0;
        String nm;
        Scanner sc = new Scanner(System.in);

        for(i=1;;i++)
        {
            try
            {
                //System.out.print("Nm ");
                nm=sc.nextLine();
                //System.out.print("Data ");
                data=sc.nextInt();
                sc.nextLine();
                dis+=data;
                if(i==3)
                    break;
            }
            catch (Exception r)
            {
                break;
            }
        }
        System.out.printf("%.1f\n",dis/i);
    }



}
