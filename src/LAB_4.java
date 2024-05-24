public class LAB_4 {
    public static void main(String[] args) {

        int[] evenArray = new int[50];
        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = 2 * i;
        }


        int[] oddArray = new int[50];
        for (int i = 0; i < oddArray.length; i++) {
            oddArray[i] = 2 * i + 1;
        }


        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();


        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();


        i = 0;
        System.out.print("Елементи з непарними індексами: ");
        while (i < numbers.length) {
            if (i % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
            i++;
        }
        System.out.println();


        System.out.print("Елементи з парним індексом: ");
        for (int j = 0; j < numbers.length; j++) {
            if (j % 2 == 0) {
                System.out.print(numbers[j] + " ");
            }
        }
        System.out.println();


        System.out.print("Обернений масив: ");
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();


        double[] realNumbers = {1.2, 2.3, 3.4, 4.5, 5.6};
        double sum = 0;
        for (int j = 0; j < realNumbers.length; j++) {
            sum += realNumbers[j];
        }
        System.out.println("Сума дійсних чисел: " + sum);


        int[] integers = {-2, -17, 13, -6, 22, -31, 45, -66, 100, 18};
        for (int j = 0; j < integers.length; j++) {
            if (integers[j] % 2 != 0) {
                integers[j] = -integers[j];
            }
        }
        System.out.print("Цілі числа зі зміненими знаками: ");
        for (int j = 0; j < integers.length; j++) {
            System.out.print(integers[j] + " ");
        }
        System.out.println();
    }
}