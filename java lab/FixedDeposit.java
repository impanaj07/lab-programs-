import java.util.Scanner;

public interface FixedDeposit {//an interface contains a set of abstract methods that 
    //can be implemented by any class by the using the implements keyword.
    double getMAmount();

    void calculateInterest();

    void getDetails();
}

class CanaraBank implements FixedDeposit {

    Scanner s = new Scanner(System.in);
    String name;
    double principal;
    double period;
    double roi = 8.5;
    double interestAmt;

    public void getDetails() {
        System.out.println("Enter your name");
        name = s.nextLine();
        System.out.println("Enter the Principal amount");
        principal = s.nextDouble();
        System.out.println("Enter the period of deposit");
        period = s.nextDouble();
    }

    public void calculateInterest() {
        interestAmt = (principal * period * roi) / 100;
    }

    public double getMAmount() {
        double totalBalance;
        totalBalance = principal + interestAmt;
        return totalBalance;
    }
}

class SBI implements FixedDeposit {

    Scanner s = new Scanner(System.in);
    String name;
    double principal;
    double period;
    double roi = 8.75;
    double interestAmt;

    public void getDetails() {
        System.out.println("Enter your name");
        name = s.nextLine();
        System.out.println("Enter the Principal amount");
        principal = s.nextDouble();
        System.out.println("Enter the period of deposit");
        period = s.nextDouble();
    }

    public void calculateInterest() {
        interestAmt = (principal * period * roi) / 100;
    }

    public double getMAmount() {
        double totalBalance;
        totalBalance = principal + interestAmt;
        return totalBalance;
    }
}

class TestBank {

    public static void main(String[] args) {

        double mAmount;
        int ch;
        FixedDeposit b;// here var b is of type 
        //fixed deposit which is a interface to demonstrate polymorphism and abstraction
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Which bank do you want to choose? 1: Canara Bank 2: SBI");
            ch = s.nextInt();
        }

        if (ch == 1) {
            System.out.println("You have chosen Canara Bank");
            CanaraBank cb = new CanaraBank();
            b = cb;//here cb is an instance or canara bank and is assigned to b ,so
            //now it is treated as a instance of fixeddeposit
            b.getDetails();
            b.calculateInterest();
            mAmount = b.getMAmount();
            System.out.println("Dear " + cb.name + " your Maturity Amount in Canara Bank is " + mAmount);
        }
        if (ch == 2) {
            System.out.println("You have chosen SBI");
            SBI sb = new SBI();
            b = sb;
            b.getDetails();
            b.calculateInterest();
            mAmount = b.getMAmount();
            System.out.println("Dear " + sb.name + " your Maturity Amount in SBI is " + mAmount);
        }
    }
}
//weather its cb or sb" FixedDeposit b" abstracts away the specific implementation details of the banks.