import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int arr=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr1=new int[arr];
        for (int i=0;i<arr;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int ele=sc.nextInt();
        int i=printArray(arr1,ele);
        if (i==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " +i);
        }
    }
    static int printArray(int[] arr,int element){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}


