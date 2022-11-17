import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        //Task1
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Task2
        int max = 0;
        int min = 200000;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
        //второй способ
        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей. Максимальная сумма трат за день составила " + arr[arr.length - 1] + " рублей");

        //Task3
        double average = sum / (arr.length);
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Task4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int mid = reverseFullName.length / 2;
        for (int i = 0; i < mid; i++) {
            char temp = reverseFullName[i];
            int last = reverseFullName.length - 1;
            reverseFullName[i] = reverseFullName[last - i];
            reverseFullName[last - i] = temp;
        } //если колличество элементов нечетное, средний элемент не будет задействован в цикле
        for (char element : reverseFullName) {
            System.out.print(element);
        }
    }
}