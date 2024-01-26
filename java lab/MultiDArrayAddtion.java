import java.util.Scanner;
public class MultiDArrayAddtion {
    int m,n,p,q,i,j;
    Scanner sc=new Scanner(System.in);
    int A[][]=new int[10][10];
    int B[][]=new int[10][10];
    int res[][]=new int[10][10];
   void input()
   {
    System.out.println("enter the order of matrix A");
    m=sc.nextInt();
    n=sc.nextInt();
    System.out.println("Enter the values of matrix A");
    for(i=0;i<m;i++)
    {
    for(j=0;j<n;j++)
    A[i][j]=sc.nextInt();
    }
   System.out.println("Enter the order of matrix b");
   p=sc.nextInt();
   q=sc.nextInt();
   if(m!=q||n!=p)
   {
    System.out.println("Matrix addition not possible");
    System.exit(0);
   }
System.out.println("enter the elements of 2nd matrix");
for(i=0;i<p;i++)
{
    for(j=0;j<q;j++)

B[i][j]=sc.nextInt();
}
   }

void add()
{
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        res[i][j]=A[i][j]+B[i][j];
    }
}
void display()
{
    System.out.println("Resultant:\n");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        System.out.println(res[i][j]+" ");
        System.out.println();
        }
}
}
class Main
{
public static void main(String[] args) {
    MultiDArrayAddtion mm = new MultiDArrayAddtion();
    mm.input();
    mm.add();
    mm.display();
}
}
