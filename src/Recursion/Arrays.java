package Recursion;

public class Arrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //System.out.println(sorted(arr,0));
        boolean res=search(arr,1,0);
        System.out.println(res);
    }

    /*
    static boolean sorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index+1] && sorted(arr, index+1);
    }
    */
    static boolean search(int[] arr, int target,int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr,target,index+1);
    }
}
