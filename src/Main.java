import java.util.ArrayList;
import java.util.Scanner;

/**
 * Create by hieuduong on 11/12/17
 *
 * CSC 201 - Assignment 13
 * Problem 13.3:
 *
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
 *  public static void sort(ArrayList<Number> list)
 */

public class Main {
    public static void main(String[] args){

        //Initialize scanner input
        Scanner keyboard = new Scanner(System.in);

        //Create an array list
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter 5 values.");

        //Create a loop that ask user to enter 5 values
        for(int i=1; i<6; i++){
            System.out.println("Enter value "+i+": ");
            int value = keyboard.nextInt();
            list.add(value);
        }

        //Sort array
        list = sortArray(list);

        //Display array
        System.out.println("Sorted array:");
        displayList(list);
    }

    /**
     * Sort array method
     * @param list
     * @return
     */
    private static ArrayList sortArray(ArrayList<Integer> list) {

        for(int index =0; index < list.size(); index++){
            int currentMinVal = list.get(index);
            int currentIndex = index;

            for(int nextIndex = index+1; nextIndex<list.size(); nextIndex ++){
                if(currentMinVal > list.get(nextIndex)){
                    currentMinVal = list.get(nextIndex);
                    currentIndex = nextIndex;
                }
            }

            if(currentIndex != index){
                list.set(currentIndex, list.get(index));
                list.set(index, currentMinVal);
            }
        }

        return list;
    }

    /**
     * Display array method
     * @param list
     */
    private static void displayList(ArrayList<Integer> list){
        for(int value:list){
            System.out.println(value);
        }
    }
}
