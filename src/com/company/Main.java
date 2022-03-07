package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
        try {
            System.out.println("Before exception is generated");
            arr[7] = 10;
        }

        catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Index out-of-bounds!");

            }
            System.out.println("After catch statement is executed");
        }
    }


