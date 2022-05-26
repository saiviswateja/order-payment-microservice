public class MaxIndexProductRotations {
    public static void main(String[] args) {
        int arr[] = {8, 3, 1, 2};
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        //Brute Force Solution
//        for(int i=0;i<n;i++) {
//            int sum = 0;
//            for(int j=0;j<n;j++) {
//                System.out.println(" for " + arr[j] + " * " + (i+j)%n + " = " + (arr[j] * ((i+j)%n)));
//                sum += (arr[j] * ((i+j)%n));
//            }
//            System.out.println(sum);
//            res = Math.max(res, sum);
//        }
//        System.out.println(res);

        int curr_sum = 0;
        for (int j : arr) {
            curr_sum += j;
        }

        int curr_val = 0;
        for(int i=0;i<n;i++) {
            curr_val += (i*arr[i]);
        }

        for(int i=1;i<n;i++) {
            int nextVal = curr_val - (curr_sum - arr[i-1]) + arr[i-1] * (n-1);
            curr_val = nextVal;
            res = Math.max(res, nextVal);
        }
        System.out.println(res);
    }
}