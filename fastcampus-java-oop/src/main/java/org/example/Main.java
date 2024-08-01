package org.example;

import logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();



        System.out.println("sort.sort() => " + sort.sort(Arrays.asList(args)));
    }
}