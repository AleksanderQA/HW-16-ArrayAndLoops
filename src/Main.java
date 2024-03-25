import java.util.Random;

public class Main {
    private static final int ARRAY_LENGTH = 10;
    public static void main(String[] args) {


        // Task 1
        int[] array = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of all array values = " + sum);

        double avg = (double) sum / array.length;
        System.out.println("Average array value = " + avg);
        System.out.println();


        //Task 2
        int[] arrayValues = {1, 4, 6, 7, 8, 9, 12, 444, 55, 344};
        int maxValue = arrayValues[0];

        for (int i = 0; i < arrayValues.length; i++) {
            if (arrayValues[i] > maxValue)
                maxValue = arrayValues[i];
        }
        System.out.println("Maximum array value = " + maxValue);
        System.out.println();


        // Task 3
        int[] numbers = {1, 2, 3, 7, 5, 7};
        boolean repeatableValues = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    repeatableValues = true;
                    System.out.println("Repeatable value = " + numbers[i]);
                    break;
                }
            }
        }
        if (repeatableValues) {
            System.out.println("Array contains repeatable values");
        } else {
            System.out.println("Array do not contain any repeatable value");
        }
        System.out.println();


        // Task 4
        int[] values = {2, 4, 2, 3, 1};
        int sumOfValues = 0;

        for (int i = 0; i < values.length; i++) {
            sumOfValues += values[i];
        }
        System.out.println("Sum of array values = " + sumOfValues);

        System.out.println();


        // Task 5
        int a = 0;

        for (int i = 10; i > a; i--) {
            System.out.println("Decremented value = " + i);

        }
        System.out.println();

        // Task 6A

        String string = "Hello, World!";
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Counted amount of characters = " + count);




        //Task 6B

        String str = "All of the Times";
        int value = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                value++;
            }
        }
        System.out.println("Counted amount of spaces = " + value);

        System.out.println();


        //Task 7
        int[] sumOfAllValues = {2, 4, 6, 8, 10};
        int maxSumValue = 0;

        int i = 0;

        while (i < sumOfAllValues.length) {
            maxSumValue += sumOfAllValues[i];
            i++;

        }
        System.out.println("Sum of all array values using loop while = " + maxSumValue);
        System.out.println();


        //Task 6
        Random random = new Random();

        int [] randomArray =  new int [ARRAY_LENGTH];

        for (int e =0;e< randomArray.length;e++){
            randomArray[e] = random.nextInt();
        }


        for (int e = 0;e< randomArray.length;e++){
            System.out.println("array [" + e + "]  random value = " + randomArray[e]);
        }
    }
}

