package com.company;

import java.util.Arrays;

public class Container <Type extends Number> {

    private Type[] array; //тип обжект
    //private int[] array;
    private int length;
    private int last_element_index;

    private double New_Size = 1.5;
    private int Main_Size = 4;

    //конструктор
    Container() {
        this.length = Main_Size;
        this.array = new Type[length];
        this.last_element_index = 0;
    }

    public void Add (Type number) {
        if (this.last_element_index == this.length - 1) {
            this.length *= New_Size;
            this.array = Arrays.copyOf(this.array, this.length);

        }
        this.array[this.last_element_index] = number;
        this.last_element_index++;
    }

    public void Show(int index){
        System.out.println(this.array[index-1]);
    }

    public void Show(){
        for (int i = 0; i < this.last_element_index; i++) {
            System.out.print(this.array[i]+" ");
        }
        System.out.println();
    }

    public void Remove(int index) {
        Type[] tmp = new Type[this.last_element_index - 1];
        int j = 0;
        for (int i = 0; i < this.last_element_index; i++) {
            if (i != index-1) {
                tmp[j] = this.array[i];
                j++;
            }
        }
        this.array = tmp;
        --this.last_element_index;
    }
}