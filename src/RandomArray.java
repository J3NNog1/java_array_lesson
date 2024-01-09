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

        //below we are going to use binary search
        String[] sArray = {"Sarah, John, Jacob, Rebecca, Jane"};
        //you ALWAYS have to make sure the array is sorted
        //in binary search!
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Rebecca on the list");
        }
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5,0};

        if (Arrays.equals(s1,s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }



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
