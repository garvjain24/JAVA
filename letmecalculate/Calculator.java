package letmecalculate;

public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int fact(int n){
        int fact = 1;
        if(n!=0){
            for(int i=1;i<=n;i++){
                fact=fact*i;
            }
            return fact;
        }
        return 1;
    }
}

