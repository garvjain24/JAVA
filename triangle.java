import java.util.*;
public class triangle {
    public void Paskal(){
        int i,j ;int n;
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        for(i=0;i<n;i++){
            int number = 1;
            for(j=0;j<=i;j++){
                System.out.print(number+"");
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
    public void Right(){
        int i,j ;int n;
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        triangle tri=new triangle();
        System.out.println("Enter choice:");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                tri.Right();
                break;
            case 2:
                tri.Paskal();
            default:
                break;
        }
        sc.close();
    }
}
