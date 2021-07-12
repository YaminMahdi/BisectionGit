import java.util.Scanner;

public class p1140
{
    public static void main(String[] args)
    {
        String sen;
        char x, c;
        Scanner sc= new Scanner(System.in);
        //System.out.println("Hi ");
        while (true)
        {
            //System.out.println("Sen ");
            sen =sc.nextLine();
            c=sen.charAt(0);
            if(c=='*')
                break;
            //sc.nextLine();
            //System.out.println(c);
            if(c>='A'&&c<='Z')
                c+=32;
            //System.out.println(c);
            x='Y';
            for(int i=1;i<sen.length();i++)
            {
                if(sen.charAt(i)==' ')
                {
                    if(sen.charAt(i+1)==c||sen.charAt(i+1)==c-32)
                        x='Y';
                    else
                    {
                        x='N';
                        break;
                    }
                }
                else x='Y';
            }
            System.out.println(x);
        }
    }
}
