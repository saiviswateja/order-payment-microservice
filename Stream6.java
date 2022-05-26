import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream6 {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(2, 222, 2, 34, 567, 890);
        System.out.println(al.stream().map(s->String.valueOf(s)).filter(s->s.startsWith("2")).collect(Collectors.toList()));
        al.stream().map(s->String.valueOf(s)).filter(s->s.startsWith("2")).forEach(System.out::println);
    }
}
