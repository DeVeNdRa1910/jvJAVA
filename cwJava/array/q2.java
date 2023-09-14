package cwJava.array;

public class q2 {
    public static void main(String[] args) {
        // find unique numner in a given aaray where all the elements are being repeated twice with one value being unique
        int[] arr = {1,2,3,4,2,1,3};
        System.out.println("Uique number is = " + uniqueNumber(arr));
    }
    public static int uniqueNumber(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] >  0){
                return arr[i];
            }
        }
        return -1;
    }

}
