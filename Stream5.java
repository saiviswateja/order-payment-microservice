import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Stream5 {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(1,10,20,30,15);
        double avg = list.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().orElseThrow(Exception::new);
    }
}
