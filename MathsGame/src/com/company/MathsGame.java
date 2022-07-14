package com.company;

import java.util.*;

public class MathsGame {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    public void mathsGame(){
        while(true){
            int question = random.nextInt(100)+1;
            ArrayList<Integer> randomNumbers = new ArrayList<>();
            int requiredNumbersCount = 4;
            int currentNumbersCount = 0;
            System.out.println(question);
            while(currentNumbersCount < requiredNumbersCount){
                int randomNum = random.nextInt(9)+1;
                if( !(randomNumbers.contains(randomNum)) ){
                    randomNumbers.add(randomNum);
                    currentNumbersCount++;
                }
            }
            displayNumbers(randomNumbers  );
            displayCharacters();
            break;
        }
    }

    public void displayNumbers(ArrayList<Integer> randomNumbers){
        for (int i=0;i<randomNumbers.size();i++){
            if (i%2==0){
                System.out.println();
                System.out.print(randomNumbers.get(i)+"\t");
            }
            else{
                System.out.print(randomNumbers.get(i)+"\t");
            }
        }
        System.out.println("\n");
        for(int j=0;j<randomNumbers.size();j++){
            System.out.println("press "+ (j+1) +" for "+randomNumbers.get(j));
        }
        System.out.println("press 5 to Mix Numbers ");
        System.out.println("Enter Your Choice");
        int userNumberChoice = sc.nextInt();

    }
    public void displayCharacters(){
        char character[] = {'(','+','-','*','%',')'};
        System.out.println();
        System.out.print("[\t");
        for (int i=0;i<character.length;i++){
            System.out.print(character[i]+" , "+"\t");
        }
        System.out.println(" ] ");
    }


    public static void main(String[] args) {
	// write your code here
        MathsGame game = new MathsGame();
        game.mathsGame();
    }
}
