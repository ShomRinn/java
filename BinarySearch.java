package com.epam.trainings;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {5, 7, 12, 35, 45, 64, 78, 90, 91};
        int key = 90;
        int position = binarySearch(sortedArray, key);
        System.out.println(key + " position: " + position);
    }

    static int binarySearch(int[] array, int key){
        int position = 0;
        int left = 0;
        int right = array.length-1;


        while(left <= right){
            int middle = (left + right)/2;
            if(array[middle] == key){
                return middle;
            }

            if(array[middle] < key){
                left = middle + 1;
            }

            if(array[middle] > key){
                right = middle - 1;
            }
        }

        return -1;
    }
}
