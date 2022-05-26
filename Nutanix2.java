public class Nutanix2 {
    public static void main(String[] args) {
        String s = "0" ;
        int m = 2;
        int n = 4;
        /*
        1->10 , 0 -> 01
        i=0 -> 100110
        i=1 -> 100101101001
         */
        String resultAfterIterations = s;
        for(int i=0;i<m;i++) {
            String temp = "";
            int slength = s.length();
            for(int j=0;j<slength;j++) {
                if(s.charAt(j)=='1') {
                    temp += "10";
                } else {
                    temp += "01";
                }
            }
            s = temp;
            resultAfterIterations = temp;
        }

        System.out.println(resultAfterIterations);
        if (resultAfterIterations.length()<n) {
            return;
        }
        System.out.println(resultAfterIterations.charAt(n-1));
    }
}
