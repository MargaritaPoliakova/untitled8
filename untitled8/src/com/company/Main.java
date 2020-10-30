package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Tochka tochka1 = new Tochka();
        tochka1.setX(in.nextDouble());
        tochka1.setY(in.nextDouble());

        System.out.println(tochka1);

        Tochka tochka2 = new Tochka();
        tochka2.setX(in.nextDouble());
        tochka2.setY(in.nextDouble());

        System.out.println(tochka2);

        System.out.println(tochka1.slogenie(tochka2));
        System.out.println(tochka1.vichitanie(tochka2));

        }
    }
