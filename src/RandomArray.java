import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int [] firstArray = getRandomArray(10);

        //we can now do something with the generated array if needed
        for ( int num : firstArray) {
            System.out.println(num + " ");
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
