package com.Stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,45,4,5,6,7));
        list.stream().sorted().map(i->i+i).forEach(System.out::println);
    }
}
