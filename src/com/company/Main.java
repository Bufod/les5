package com.company;

import java.util.Arrays;
import java.util.Scanner;

class Stack {
    int[] stck = new int[10];
    int tos;

    public Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен");
            return;
        }
        stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек пустой");
            return 0;
        }
        return stck[tos--];
    }

    @Override
    public String toString() {
        return Arrays.toString(stck);
    }
}

public class Main {

    public static void menuOut() {
        System.out.println("1) продолжить \n2) выйти");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack stack1 = new Stack();

        menuOut();
        while (in.hasNextInt()) {
            if (in.nextInt() == 2)
                break;

            System.out.println("Введите значение: ");
            stack1.push(in.nextInt());

            System.out.println("Cостояние стека: " + stack1);

            menuOut();

        }
    }
}
