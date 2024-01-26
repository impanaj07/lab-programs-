import java.util.Scanner;

public abstract class Solid {//can have both abstract and concrete class
double r ,h;
abstract void SurfaceArea();//abs method
abstract void Volume();//abs method
void readRadius()//concrete method
{
    try (Scanner sc = new Scanner (System.in)) {
        System.out.println("Enter the radius");
        r=sc.nextInt();
    }
}
void readHeight()
{
    try (Scanner sc = new Scanner (System.in)) {
        System.out.println("Enter the height");
        h=sc.nextInt();
    }
}
}
class Cone extends Solid{
    void SurfaceArea()
    {    double area=(3.14*r)*(r*Math.sqrt(r*r+h*h));
        System.out.println("surface area of cone ="+area);
    }
    void Volume()
    {
       double vol= 3.14*r*r*(h/3);
       System.out.println("volume of cone="+vol);
    }

}
class Cylinder extends Solid{
    void SurfaceArea()
    {    double area=(3.14*r*r*h);
        System.out.println("surface area of cylinder ="+area);
    }
    void Volume()
    {
       double vol= (2*3.14*r*h)+(2*3.14*r*r);
       System.out.println("volume of cylinder="+vol);
    }

}
class Sphere extends Solid{
    void SurfaceArea()
    {    double area=(4*3.14*r*r);
        System.out.println("surface area of sphere ="+area);
    }
    void Volume()
    {
       double vol= (4/3)*3.14*r*r*r;
       System.out.println("volume of sphere="+vol);
    }
}
class MySolid
{
    public static void main(String[] args) {
        Solid sc=new Cylinder();//cannot instantiate a abstract class
        sc.readHeight();
        sc.readRadius();
        sc.SurfaceArea();
        sc.Volume();
        sc=new Cone();
        sc.readHeight();
        sc.readRadius();
        sc.SurfaceArea();
        sc.Volume();
        sc=new Sphere();
        sc.readRadius();sc.readRadius();
        sc.SurfaceArea();
        sc.Volume();
       }
}

