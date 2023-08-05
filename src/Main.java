import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int costs = 0;
        for (int index = 0; index < arr.length - 1; index++) {
            costs += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + costs + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();

        int mixWaste = 200_201;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mixWaste) {
                mixWaste = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + mixWaste + " рублей");

        int maxWaste = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxWaste) {
                maxWaste = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxWaste + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();

        int sum = 0;
        double months = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            months = sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + months + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
