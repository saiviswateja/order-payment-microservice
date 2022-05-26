import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        String[] names = new String[]{"william", "jones", "aaron", "seppe", "frank", "gilliam"};
        int tot = Arrays.stream(names).filter(str -> {
            if(str.length()>5) {
                return true;
            }
            return false;
        }).mapToInt(String::length).sum();
        System.out.println(tot);
    }
}
