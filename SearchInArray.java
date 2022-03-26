package com.epam.trainings;

public class SearchInArray {
    public static void main(String[] args) {
        int[] array = {5, 7, 12, 35, 45, 64, 78, 90, 91};
        printMaximumElement(array);

    }

    static void printMaximumElement(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        int comparisons = 0;
        int replacements = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
                maxIndex = i;
                replacements++;
            }
            comparisons++;
        }

        System.out.println("Max: " + max);
        System.out.println("Max ind: " + maxIndex);
        System.out.println("Comp: " + comparisons);
        System.out.println("Repl: " + replacements);
    }
}
