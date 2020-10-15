package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Container <Integer> a = new Container<Integer>();
        //Container a = new Container();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int number = scan.nextInt(), tmp;
        for (int i = 0; i < number; i++) {
            tmp = scan.nextInt();
            a.Add(tmp);
        }
        a.Show();
        a.Show(2);
        a.Remove(2);
        a.Show();
    }
}
