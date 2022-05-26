public class Test {
//    [12:31] Nitish Dinesh Gavande
//    12,14,20,6,7,11,3 -> 20 11 3
//            ​[12:32] Nitish Dinesh Gavande
//    16, 17, 4, 3, 5, 2 -> 17, 5, 2

    public static void main(String[] args) {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        int[] temp = new int[n];
        temp[n-1] = arr[n-1];
        int maxElementFromLeft = temp[n-1];
        for(int i=arr.length-2;i>=0;i--) {
            if(maxElementFromLeft<arr[i]) {
                maxElementFromLeft = arr[i];
            }
            temp[i] = maxElementFromLeft;
        }
        System.out.println("The elements are");
        for(int i=0;i<n;i++) {
            if(temp[i]<=arr[i]) {
                System.out.println(arr[i]);
            }
        }
    }
}
