package Homeworks.StringRepeatElement;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "hello my friend Vaghinak";
        Map<Character,Integer> myMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (myMap.containsKey(str.charAt(i))) {
                myMap.replace(str.charAt(i), myMap.get(str.charAt(i)) + 1);

            } else {
                myMap.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            int temp = 0;
            if (myMap.get(str.charAt(i)) > 1) {
                System.out.println(str.charAt(i));
                temp++;
            }
            if (temp != 0) {
                break;
            }
        }


    }
}
