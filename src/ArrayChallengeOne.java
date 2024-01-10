//THE ARRAY CHALLENGE

//create a program using arrays, that sort a list of integers,
//in descending order. descending order means from
//highest value to lowest
//in other words, if the array has the values 50, 25, 80, 5, 15
//your program should return.
//First, create an array of randomly generated integers
//print the array before you sort it
//and print the array after you sort it
//you can choose to create a new sorted array
//or just sort the current array


import java.util.Arrays;
import java.util.Random;

public class ArrayChallengeOne {
    public static void main(String[] args){
        int [] unsortedArray = getArrayChallengeOne(5);
//        for (int num: unsortedArray) {
//            //print random array
//            System.out.println(num + ", ");
//        }
//        Arrays.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[] {7, 54, 89});
        System.out.println(Arrays.toString(sortedArray));
    }
    private static int[] getArrayChallengeOne(int length){
        //create functionality for new array
        Random random = new Random();
        int [] newRandomArray= new int[length];
        for (int i = 0; i < length; i++){
            newRandomArray[i] = random.nextInt(10000);
        }
        return newRandomArray;
    }

    private static int[] sortIntegers(int [] array) {
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for ( int i = 0 ; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));

                }
            }
            System.out.println("--->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
