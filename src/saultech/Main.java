package saultech;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(smallestMissingPositiveInteger(new int[]{1, 3, 6, 4, 1, 2}));
    }
    public static int smallestMissingPositiveInteger(int[] arr){
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        // return first smallest missing positive number from the set
        int index = 1;
        while (true)
        {
            if (!set.contains(index)) {
                return index;
            }
            index++;
        }
    }
}
