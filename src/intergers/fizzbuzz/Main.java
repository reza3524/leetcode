package intergers.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(16));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int index = 1;
        while (index <= n) {
            if (index % 3 == 0 && index % 5 == 0) {
                list.add("FizzBuzz");
            } else if (index % 3 == 0) {
                list.add("Fizz");
            } else if (index % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(index));
            }
            index += 1;
        }
        return list;
    }
}
