import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int [] firstArray = getRandomArray(10);

        //we can now do something with the generated array if needed
        for ( int num : firstArray) {
            System.out.println(num + " ");
        }
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int [] secondArray = new int [10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray =  Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

            }
    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] newInt = new int[length];
        for(int i = 0; i < length; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
