package exceptionexamplenext;

import java.util.Scanner;

public class NextExample {
    public static void main(String[] args) {
        String[] indexToPrint = new String[]{"1", "2", "3", "10", "jeden", "-1","dwa", "2", "10", "0", "q"};

        String[] strings = new String[]{"This", "is", "very", "useful", "course", "."};


        System.out.println("Enter the number of the word you want to see.");
        for (int i = 0; i < 100; i++) {
            String next = indexToPrint[i];
            System.out.println("You enter to number: " + next);

            if (next.equals("q")) {
                break;
            }

            try {
                int index = getIndex(strings, next);
                System.out.println("Word of the index: " + index + ", this is: " + strings[index]);
            } catch (IllegalArgumentException ex){
                System.out.println("Error " +ex.getMessage() );
            }
        }
    }
    public static int getIndex(String[] strings, String next) throws IllegalArgumentException{
        int index = 0;
        try {
            index = Integer.valueOf(next);
        }catch (NumberFormatException ex)
        {
            throw new IllegalArgumentException("Not enter the number.");
        }
        if (index<0){
            throw new IllegalArgumentException("Enter the number bigger than 0");
        }
        if (index>= strings.length){
            throw new IllegalArgumentException("The number enter must less than " + strings.length);
        }
        return index;
    }

}
