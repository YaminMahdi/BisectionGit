import java.util.Scanner;

public class p1196
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int i,j;
        String st;
        int ar2[];
        ar2= new int[100];
        int arr[]={'`','1','2','3','4','5','6','7','8','9','0','-','=','Q','W','E','R','T','Y','U','I','O','P','[',']',92,'A','S','D','F','G','H','J','K','L',';',39,'Z','X','C','V','B','N','M',',','.','/',};
        for(i=1;i<arr.length;i++)
        {
            ar2[arr[i]]=arr[i-1];
        }
        while (true)
        {
            try
            {
                st=sc.nextLine();
                String x="";
                //StringBuilder x = new StringBuilder(st);
                for(i=0;i<st.length();i++)
                {
                    if(st.charAt(i)!=' ')
                    {
                        x+=(char)ar2[st.charAt(i)];
                        //x.setCharAt(i,(char)ar2[st.charAt(i)]);
                    }
                    else
                        //x.setCharAt(i,' ');
                        x+=' ';
                }
                System.out.println(x);

            }
            catch (Exception x)
            {
                break;
            }

        }
    }
}
