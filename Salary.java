import java.util.*;

public class Salary{
    public static void SalaryCal(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String name=sc1.nextLine();
        System.out.println("Enter Employee Number");
        int Emp_No=sc1.nextInt();
        System.out.println("Enter Base Salary");
        double BaseSal=sc1.nextDouble();

        System.err.println(name);
        System.err.println(Emp_No);
        double DA,HRA,PF,Gross;
        int CCA=240, PT=100;
        DA=(0.7*BaseSal);
        HRA=(0.35*BaseSal);
        PF=(0.1*BaseSal);
        Gross=DA+HRA+BaseSal;
        System.out.println("the gross Salary is"+Gross);
        System.out.println("The DA is : " + DA);
        System.out.println("The HRA is : " + HRA);
        System.out.println("The CCA is : " + CCA);
        System.out.println("The PF is : " + PF);
        System.out.println("The PT is : " + PT);
        sc1.close();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=0;
        do {
            
            System.out.println("1.Calculate salary");
            System.out.println("2.Exit");
            System.out.println("Enter Choice");
            String input=sc.next();
            try{
            choice =Integer.parseInt(input);
            switch (choice) {
            case 1:
                SalaryCal();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Enter Choice");
                break;
            }
        }catch(NumberFormatException e){
            System.out.println("invalid Number");
            choice=-1;
        }
        
        } while (choice!=0);
        sc.close();
    }
}

