package com.PROJECT_lucky_ten;

import java.util.*;

public class Main {
    static final int MAX_VALUE = 60;
    static final int TIMES_X = 1000000;

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Set<Integer> luckySet = new HashSet<>();

        fillMap(map);
        transferMap(map, list);
        luckyTen(luckySet, list);
        System.out.println("Map size: " + map.size());
        System.out.println("List size: " + list.size());

    }

    private static void luckyTen(Set<Integer> luckySet, List<Integer> list) {
        Collections.shuffle(list);
        while (luckySet.size() <= 10 /*<11*/) {
            int random = (int) (Math.random() * MAX_VALUE);
            luckySet.add(list.get(random));
        }
    }

    private static void transferMap(Map<Integer, Integer> map, List<Integer> list) {
        for (Map.Entry<Integer, Integer> r : map.entrySet()) {
            int keyValue = r.getKey(); //ex. 13
            int value = r.getValue(); //ex. 20  . Number 13, generated 20 times.

            for (int i = 0; i < value; i++)
                list.add(keyValue);
        }
    }

    private static void fillMap(Map<Integer, Integer> map) {
        for (int i = 0; i < TIMES_X; i++) {
            int random = generate();
            if (map.containsKey(random)) {
                int value = map.get(random);
                map.put(random, ++value);
            } else map.put(random, 1);
        }
    }

    private static int generate() {
        return (int) (Math.random() * MAX_VALUE + 1);
    }

}
