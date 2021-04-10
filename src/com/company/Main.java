package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String enter;
        int i = 0;
        while (i < 5) {
            System.out.println("Введите элемент для первого списка ");
            enter = scanner.nextLine();
            listA.add(enter);
            i++;
        }
        System.out.println("Первый список: ");
        print(listA);
        int a = 0;
        while (a < 5) {
            System.out.println("Введите элемент для второго списка ");
            enter = scanner.nextLine();
            listB.add(enter);
            a++;
        }
        System.out.println("Второй список: ");
        print(listB);
        Collections.reverse(listB);

        int c = 0;
        while (listC.size() <= 9) {
            listC.add(listA.get(c));
            listC.add(listB.get(c));
            c++;

        }
        System.out.println("Третий список: ");
        print(listC);
        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("Отсортированный список: ");
        print(listC);
    }

    public static void print(ArrayList<String> list) {
        Iterator<?>iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
