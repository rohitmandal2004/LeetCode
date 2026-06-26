import java.util.*;

class Main {
    public static int reverseArray(int arr[], int i1, int i2){
        int start = i1, end = i2;
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        return -1;
    }
    
    public static void rotateArray(int arr[], int start, int end, int d){
        int n = arr.length;
        d = d % n;
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, arr.length-1);
          reverseArray(arr, 0, arr.length-1);
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int d = 11;
        rotateArray(arr, 0, arr.length-1, d);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
