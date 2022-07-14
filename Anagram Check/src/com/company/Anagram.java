package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Anagram {

    Scanner sc = new Scanner(System.in);
    public void anagramCheck(){
        System.out.println("Enter two Strings Separated By Space");
        String sentence =  sc.nextLine();
        String inputs[] = sentence.split(" ");
        if(inputs[0].length()==inputs[1].length()){
            char string1Array[] = inputs[0].toLowerCase().toCharArray();
            char string2Array[] = inputs[1].toLowerCase().toCharArray();


            sortCharacterArray(string1Array);
            sortCharacterArray(string2Array);

            String sortedString1 = String.valueOf(string1Array);
            String sortedString2 = String.valueOf(string2Array);
            if (sortedString1.equals(sortedString2)){
                System.out.println("Given Two Strings are Anagram");
            }
        }
        else{
            System.out.println("Given Two Strings are Not Anagram");
        }
    }

    public void sortCharacterArray(char characterArray[]){
        for(int i=0;i<characterArray.length-1;i++){
            for (int j=i+1;j<characterArray.length;j++){
                if (characterArray[i] > characterArray[j]){
                    char tempCharacter = characterArray[i];
                    characterArray[i] = characterArray[j];
                    characterArray[j] = tempCharacter;
                }
            }
        }

    }
    public static void main(String[] args) {
	// write your code here
        Anagram anagram = new Anagram();
        anagram.anagramCheck();
    }
}
