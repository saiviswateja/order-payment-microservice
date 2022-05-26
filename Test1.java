import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        String st = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < st.length(); i++) {
            String temp = "";
            for (int j = i; j < st.length(); j++) {
                temp = temp + st.charAt(j);
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
        }
        String ans = "";
        int minCount = 0;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            if (((String) entry.getKey()).length() <= 3) {
                continue;
            }
            String tempString = (String) entry.getKey();
            int c = (Integer) entry.getValue();
//            System.out.println(tempString);
//            System.out.println(c);
            if (c > 3) {
                System.out.println(tempString);
                System.out.println(c);
            }
        }
    }
}
