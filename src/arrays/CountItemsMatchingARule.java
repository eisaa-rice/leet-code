package arrays;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        // Create the main list of lists
        List<List<String>> items = new ArrayList<>();

        // Create individual lists and add them to the main list
        List<String> item1 = new ArrayList<>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");
        items.add(item1);

        List<String> item2 = new ArrayList<>();
        item2.add("computer");
        item2.add("silver");
        item2.add("lenovo");
        items.add(item2);

        List<String> item3 = new ArrayList<>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");
        items.add(item3);

        String ruleKey = "color", ruleValue = "silver";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    } // main

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;

        // type == 1, color == 2, name == 3
        int type = -1;
        if (Objects.equals(ruleKey, "type")) {
            type = 0;
        }
        else if (Objects.equals(ruleKey, "color")) {
            type = 1;
        }
        else {
            type = 2;
        }

        for (List<String> item : items) {
            System.out.println(ruleValue);
            System.out.println(item.get(type));
            System.out.println();

            if (Objects.equals(item.get(type), ruleValue)) {
                matches++;
            }
        } // for

        return matches;
    } // countMatches
}
