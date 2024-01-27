import java.util.Scanner;
public class Quadratic {
    Scanner sc=new Scanner(System.in);
    double a,b,c;
    double d,r1,r2;
    void input()
    {
        System.out.println("Enter the values of a b and c");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
    }
    double discriminant()
    {
        d=(b*b)-4*a*c;
return d;
}
void calculate()
{
if(d==0)
{
System.out.println("The roots are real and equal");
r1=-b/(2*a);
System.out.println("The root="+r1);
}
if(d<0)
{
System.out.println("No real Solution");
}
if(d>0)
{System.out.println("The roots are real and distinct");
r1=(-b+Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("The Roots r1="+r1);
System.out.println("The Roots r2="+r2);
}
}
public static void main(String []args)
{
Quadratic qe= new Quadratic();
qe.input();
qe.discriminant();
qe.calculate();
}
}
