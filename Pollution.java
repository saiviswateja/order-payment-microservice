import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

import static org.testng.reporters.jq.BasePanel.S;

public class Pollution {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        String S = "zyzyzyz";
        ArrayList<String> substrings = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        int n = S.length();
        for(int i=0;i<n;i++) {
            for(int j = i+1;j<=n;j++) {
                    String temp = S.substring(i, j);
                    if(hm.containsKey(temp)) {
                        hm.put(temp, hm.get(temp) + 1);
                    } else {
                        hm.put(temp, 1);
                    }

            }
        }

        int ans = Integer.MAX_VALUE;
        for(String s: hm.keySet()) {
            if(hm.get(s)==1) {
                System.out.println(s);
                if (ans > s.length()) {
                    ans = s.length();
                }
            }
        }
        System.out.println(ans);
            return 9;
    }

    public static void main(String[] args) {
        solution(new int[]{5,19,8,1});
    }
}
