package ru.stepup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Введите четное число: ");
            int num = s.nextInt();

            if (num % 2 == 0) {
                for (int i = 1; i <= num; i++) {
                    l.add(i);
                }

                int temp = 0;

                for (int i = 0; i < l.size(); i++) {
                    temp = l.get(i);

                    l.set(i,l.get(++i));
                    l.set(i,temp);
                }
            } else {
                throw new IllegalArgumentException("Число должно быть четным");
            }
            System.out.println(l);
        }
    }
}