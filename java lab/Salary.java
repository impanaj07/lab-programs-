import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int id;
            float basicsal;
            System.out.println("Enter the name of the employee");
            String name=sc.nextLine();
            System.out.println("enter id");
            id=sc.nextInt();
            System.out.println("Enter the basic salary of the employee");
            basicsal=sc.nextFloat();
            float DA=(float)0.40*basicsal;
            float HRA=(float)0.20*basicsal;
            float CCA=250;
            float PF=(float)0.10*basicsal;
            float PT=100;
            float GrossIncome=basicsal+DA+HRA+CCA;
            float IncomeTax= (float) (0.10*GrossIncome);
            float deductions=(PF+PT+IncomeTax);
            float netSal=GrossIncome-deductions;
            System.out.println("NAME="+name);
            System.out.println("Employee ID="+id);
            System.out.println("Gross Income="+GrossIncome);
            System.out.println("Net Income="+netSal);
        }
    }
}