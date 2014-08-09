package by.nasgor.algorithms;

/**
 * Created with IntelliJ IDEA.
 * User: nasgor
 * Date: 8/6/14
 * Time: 2:47 PM
 */
public class Search {
    public static void main(String[] args){
        int[] arr = {43,12,3,3,3,3,3,3,45,3,23,32,65,5,4,7,21,34};
        int a = 43;

        System.out.println(search(a,arr));
    }

    public static int[] sortArray(int[] arr){      //this is variant of buble sort
        int temp;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int search(int value, int[] arr){     //simple binary search
        int mid, left = 0, right = arr.length-1;
        sortArray(arr);
        while(true){
            mid = left + (right - left)/2;
            if (left == right){
                System.out.println("element not found");
                break;
            }
            if(arr[mid] > value){
                right = mid;
            }else if (arr[mid] < value){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
