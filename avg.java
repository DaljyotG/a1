import java.util.scanner;

class  Average
{
    public static void main(String[] args)
    {
        System.out.println("Enter 5 numbers:");
        Scanner input=new Scanner(System.in);                 
        //creating Scanner class object, for taking values from user.

        int a,b,c,d,e;

        float avg;

        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        avg=(float)(a+b+c+d+e)/5.0;
        System.out.println("Largest Number is: "+avg);
    }
}