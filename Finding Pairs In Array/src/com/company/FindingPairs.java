package com.company;

import java.util.Scanner;

public class FindingPairs {

    Scanner sc = new Scanner(System.in);
    public void findingPairsInArray(){
        System.out.println("Enter Size For Array");
        int arraySize = sc.nextInt();
        int numbers[] = new int[arraySize];
        getElements(numbers);
        System.out.println("Enter Number To be Found");
        int keyNumber = sc.nextInt();
        findingKeyPairs(numbers , keyNumber);
    }

    public void getElements(int numbers[]){
        System.out.println("Enter Elements for an Array");
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
    }

    public void findingKeyPairs(int numbers[] , int keyNumber){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if (  ( (numbers[i]+numbers[j] )% keyNumber ) == 0){
                    System.out.print("( "+(i+1)+" , "+(j+1)+" ) \t");
                }
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        FindingPairs pairs = new FindingPairs();
        pairs.findingPairsInArray();
    }
}
