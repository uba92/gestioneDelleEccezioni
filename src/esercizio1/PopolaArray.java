package esercizio1;

import java.util.Random;

public class PopolaArray {

    public static void main (String[] args) {
        int[] myArray = new int[5];
        Random myRandom = new Random();

        for (int i=0; i<myArray.length; i++) {
            myArray[i] = myRandom.nextInt(10) +1;
        }

        System.out.println("Array Iniziale: ");
        for (int i=0; i<myArray.length; i++){
            System.out.println("Elemento " + myArray[i]);
        }
    }




}
