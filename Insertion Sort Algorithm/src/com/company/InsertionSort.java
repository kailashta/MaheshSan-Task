package com.company;

import java.util.Scanner;

public class InsertionSort {

    public void getElements(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("Enter Elements For Array");
        for (int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Before Swapping");
        display(numbers);
        System.out.println("After Swapping");
        insertionSort(numbers);
        display(numbers);
    }

    public void insertionSort(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int currentValue = numbers[i];
            int j = i-1;
            while(j >=0 && numbers[j] > currentValue){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = currentValue;
        }
    }

    public void display(int numbers[]){
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] +"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        sort.getElements();
    }

}
