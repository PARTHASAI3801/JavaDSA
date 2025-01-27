package Recursion;

public class Numbers {
    public static void main(String[] args) {
        //fibo(5);
        System.out.println(fact(5));
    }

//    static void fibo(int n){
//        int n1 = 0;
//        int n2=1;
//        int n3=n1+n2;
//        System.out.print(n1+" "+n2+" ");
//        while(n3<=n){
//            n3 = n1 + n2;
//            System.out.print(n3+" ");
//            n1=n2;
//            n2=n3;
//        }
//    }


    static int fact(int n) {
        int factor;
        if (n == 1){
            return 1;
        }
        factor= n * fact(n-1);
        return factor;
    }




}
