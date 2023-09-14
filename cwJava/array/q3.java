package cwJava.array;

public class q3 {
    public static void main(String[] args) {
        // second largest number
        int[] arr = {3,5,6,7,8,9,1,5,7,89,43,6865,245,5235346,254};
        System.out.println(secondLargestNumber(arr));

    }
    public static int secondLargestNumber(int[] arr){
        int larg = largest(arr);
        int ind = -1;
        for (int i = 0; i < arr.length; i++) {
            if(larg == arr[i]){
                ind = i;
            }
        }
        arr[ind] = -1;
        larg = largest(arr);
        return larg;
    }
    public static int largest(int[] arr){
        int larg = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            if(larg < arr[i]){
                larg = arr[i];
            }
        }
        return larg;
    }
}
