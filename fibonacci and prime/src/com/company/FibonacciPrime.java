package com.company;

import java.util.Scanner;

public class FibonacciPrime {

    Scanner sc = new Scanner(System.in);
    public void fibonacciPrime(){
        System.out.println("Enter How Many Number You Wants To Print");
        int maxCount = sc.nextInt();
        int count =0;
        int n1 =0 , n2 =1, n3 =0;
        while(count < maxCount){
            for(int i=2;;i++){
                n3 = n1+n2;
                n1 = n2;
                n2 = n3;
                boolean flag = false;
                for(int j=2;j<n3/2;j++){
                    if (n3%j==0){
                        flag = true;
                        break;
                    }
                }
                if (!flag){
                    count++;
                    System.out.print(n3+"\t");

                }
                if (count == maxCount){
                    break;
                }

            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        FibonacciPrime fibonacciAndPrime = new FibonacciPrime();
        fibonacciAndPrime.fibonacciPrime();
    }
}
