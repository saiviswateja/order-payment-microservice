import java.util.HashSet;
import java.util.Locale;

public class Nutanix3 {
    public static void main(String[] args) {
        String st = "The quick brown fox jumps over the lazy dog";
        HashSet<Character> hashSet = new HashSet<>();
        for(int i=0;i<st.length();i++) {
            char c  = st.substring(i, i+1).toLowerCase(Locale.ROOT).charAt(0);
            if(c==' ') {
                continue;
            }
            hashSet.add(c);
        }
        if(hashSet.size()==26) {
            System.out.println("its a panagram");
        } else {
            System.out.println("its not a panagram");
        }
    }
}
