package Feb02StudyHall;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {


        // Write a code where user is being asked to enter a word,
        // find home many 3 character palindrome substrings are in the given Word and print each one of them
        // ( example : Word :  "BIBOBOBPIPDUD" : BIB , BOB, OBO, BOB, PIP, DUD" there are 6 Palindrome three Char substring)

        // BIBOBOBPIPDUD



            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a word");
            String word=scanner.nextLine();
            int count=0;
            char [] array =word.toCharArray();
            for (int i=0;i< array.length-2;i++){
                if (array[i]==array[i+2]) {
                    System.out.print(word.substring(i,i+3)+" ");//B I B
                    count++;
                }
            }
            System.out.println("\nThere are "+count+" palindrome in this word");
        }
    }

