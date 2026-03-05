package com.svk.example.basic;

/*
Q. Write a function to find out duplicate words in a
given string?
Approach
1. Define a string. inputString
2. Convert the string into lowercase to make the comparison insensitive.
3. Split the string into words.
4. Two loops will be used to find duplicate words. Outer loop will select a word and
Initialize variable count to 1. Inner loop will compare the word selected by outer
loop with rest of the words.
5. If a match found, then increment the count by 1 and set the duplicates of word to
'0' to avoid counting it again.
6. After the inner loop, if count of a word is greater than 1 which signifies that the
word has duplicates in the string.
 */

import java.util.Arrays;

public class DuplicateWord {
    public static void main(String[] args) {
        System.out.println("The stirng to find duplicate words is:");
        String inputString = "Big black bug bit a big black dog on his big black nose. bit";
        IO.println(inputString);

        int count;

        //Convert the inputString into lowercase
        inputString = inputString.toLowerCase();
        IO.println("\n inputString to Lower Case - \n" + inputString);

        String[] words = inputString.split(" ");
        IO.println( "Array of inputString  \n" + Arrays.toString(words));

        System.out.println("Duplicate words in given inputString are : - \n");

        for(int i=0; i<words.length;i++){
            count = 1;
            for(int j=i+1;j<words.length;j++){
                System.out.println("value of i - " + i + " and Word is - " +words[i]);
                System.out.println("value of j - " + j + " and Word is - " +words[j]);

                if(words[i].equals(words[j]))
                {
                    System.out.println("Duplicate word found Entering i  - " + i  + " and j - " + j);

                    System.out.println("value of i - " + i + " and Word is - " +words[i]);
                    System.out.println("value of j - " + j + " and Word is - " +words[j]);
                    count++;

                    //Set words[j] to 0 to avoid printing visited word
                    words[j]="0";
                }
            }   // End of inner loop

            //Displays the duplicate word if count is greater than 1
            if(count>1 && !words[i].equals("0")){
                System.out.println(words[i]);
            }
        }   //End of outer loop
    }
}
