package Recursion;

public class TOH {
    public static void main(String[] args) {
        towerOfHanoi(3,'A','B','C');
    }


    public static void towerOfHanoi(int n,char src,char aux,char des){
        if(n == 1){
            System.out.println(src + " -> " + des);
            return;
        }

        towerOfHanoi(n-1,src,des,aux);
        towerOfHanoi(1,src,aux,des);
        towerOfHanoi(n-1,aux,src,des);
    }
}
