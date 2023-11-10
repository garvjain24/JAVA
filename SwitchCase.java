import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        SwitchCase ae = new SwitchCase();
        System.out.println("Choose THe Task");
        System.out.println("1. Odd Even");
        System.out.println("2. Factorial");
        System.out.println("3. Prime NUmber");
        System.out.println("4. Armstrong");
        System.out.println("5.Reverse Number");
        System.out.println("6. Swap number");
        System.out.println("7. Chech Palindrome");
        System.out.println("8. Print Star Triangle");
        System.out.println("9. FibonacciSeries");
        System.out.println("0. Ouit");
        System.out.println("Enter The Choice:");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                ae.OddEven();
                break;
            case 2:
                ae.Factorial();
                break;
            case 3:
                ae.PrimeNumber();
                break;
            case 4:
                ae.Arm();
                break;
            case 5:
                ae.Rev();
                break;
            case 6:
                ae.Swap();
                break;
            case 7:
                ae.Palindrome();
                break;
            case 8:
                ae.Pattern();
                break;
            case 9:
                ae.FibonacciSeries();
                break;
        }
        if (n == 0) {
            System.out.println("Exit");
        } else if (n > 9) {
            System.out.println("Invalid Choice");
        }
        sc.close();
    }

    public void Rev() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NO. for x : ");
        int num = sc.nextInt();
        int reve = 0;
        while (num > 0) {
            int rem = num % 10;
            reve = reve * 10 + rem;
            num = num / 10;
        }
        System.out.println("the reverse number is " + reve);
        sc.close();
    }

    public void Swap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NO. for x : ");
        int a4 = sc.nextInt();
        System.out.println("Enter the NO. for y : ");
        int a5 = sc.nextInt();
        System.out.println("The number for x before Swap:" + a4);
        System.out.println("The number for y before Swap:" + a5);
        int temp = a4;
        a4 = a5;
        a5 = temp;
        System.out.println("The number for x after Swap:" + a4);
        System.out.println("The number for y after Swap:" + a5 + "\n");
        sc.close();
    }

    public void Palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NO. ");
        int a6 = sc.nextInt();
        int m = a6;
        int num = 0;
        while (m > 0) {
            int n = m % 10;
            num = num * 10 + n;
            m = m / 10;
        }
        if (num == a6) {
            System.out.println(a6 + "is a pallindrome" + "\n");
        } else {
            System.out.println(a6 + "is not a pallindrome" + "\n");
        }
        sc.close();
    }

    public void Pattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NO. ");
        int a4 = sc.nextInt();
        for (int i = 0; i < a4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    public void Arm() {
        System.out.println("enter the Number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // armstrong number
        int i = a;
        int num = 0;
        while (a != 0) {
            int rem = a % 10;
            num = num + (rem * rem * rem);
            a = a / 10;
        }
        if (i == num) {
            System.out.println("Armstrong" + "\n");
        } else {
            System.out.println("Not a Armstrong" + "\n");
        }
        sc.close();
    }

public void PrimeNumber() {
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the NO. "); 
int a3 = sc.nextInt();
boolean flag = false;
for (int i = 2; i <= a3 / 2; ++i) {
// condition for nonprime number 
if (a3 % i == 0) {
flag = true;
break; 
}
}
if(!flag)
System.out.println(a3+" is a prime number.");
else 
System.out.println
(a3+" is not a prime number.");
sc.close();
}

public void Factorial() 
{ 
    System.out.println("enter the Number:"); 
    Scanner sc = new Scanner(System.in); 
    int a2 = sc.nextInt();
int fact = 1;
for (int i = 1; i <= a2; i++) 
{
fact = fact * i; 
}
System.out.print(fact + "is the factorial"+"\n");
sc.close(); 
}

public void OddEven()
{ 
    System.out.println("enter the Number:"); 
Scanner sc = new
Scanner(System.in); 
int a1 = sc.nextInt();
// Odd even
if (a1 % 2 == 0) {
System.out.println("Even"); 
} else {
System.out.println("Odd"); 
}
sc.close(); 
}

public void FibonacciSeries() {
System.out.println("enter the Number:");
Scanner sc = new Scanner(System.in);
int a8 = sc.nextInt();
int firstTerm = 0, secondTerm = 1; System.out.println("Fibonacci Series till " + a8 + " terms:");
for (int i = 1; i <= a8; ++i) { System.out.print(firstTerm + " ");
// compute the next term
int nextTerm = firstTerm + secondTerm; firstTerm = secondTerm;
secondTerm = nextTerm;
}
sc.close(); }
}