import java.util.Scanner;
public class UCLN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
            int a;
            a = sc.nextInt();
            int b;
            b = ac.nextInt();
        System.out.println(UC(a,b));   
    }
    public static int UC(int a,int b)
    {
        if(a>b)
        {
            return UC(a-b,b);
        }
        if(b>a)
        {
            return UC(a,b-a);
        }
        else
        {
            return a;
        }
    }
}