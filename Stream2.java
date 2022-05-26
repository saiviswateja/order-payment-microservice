import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
    public static <T> Stream<T> flattenStream(List<List<T> > lists)
    {

        // Create an empty list to collect the stream
        List<T> finalList = new ArrayList<>();

        // Using forEach loop
        // convert the list into stream
        // and add the stream into list
        for (List<T> list : lists) {
            list.stream()
                    .forEach(finalList::add);
        }

        // Convert the list into Stream and return it
        return finalList.stream();
    }

    public static void main(String[] args)
    {

        // Get the lists to be flattened.
        List<Character> a = Arrays.asList('G', 'e', 'e', 'k', 's');
        List<Character> b = Arrays.asList('F', 'o', 'r');
        List<Character> c = Arrays.asList('G', 'e', 'e', 'k', 's');

        List<List<Character> > arr = new ArrayList<List<Character> >();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        // Flatten the Stream
        List<Character> flatList = new ArrayList<Character>();
        flatList = flattenStream(arr)
                .collect(Collectors.toList());

        // Print the flattened list
        System.out.println(flatList);
    }
}
