public class Nutanix {
    public static void main(String[] args) {
        /*
        [1,2,3,4,5,7,8,9,10]
        missing number
         */
        int[] arr = new int[]{1,3,4,6,7,8,10};
        int temp = 1;
        int i=0;
        while(i<arr.length) {
            if(arr[i]!=temp) {
                System.out.println("Missing number is " + temp);
                temp++;
                continue;
            }
            i++;
            temp++;
        }
//        for(int i=0;i<arr.length;i++) {
//            while(arr[i]!=temp) {
//                System.out.println("Missing number is " + arr[i]);
//            }
//            temp++;
//        }
    }
}
