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
        System.out.println(" ЗАДАЧА № 1");
        int[] arr = generateRandomArray();
        double summa = 0;
        for (int j : arr)
            summa += j;
        {
            System.out.printf(" Сумма трат за месяц " + summa + " рублей ");
        }
        System.out.println();
        System.out.println();
        System.out.println(" ЗАДАЧА № 2 ");
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println(" минимальные траты в месяц  " + min);
        System.out.println(" максимальные траты в месяц  " + max);

        System.out.println();
        System.out.println("ЗАДАЧА № 3 ");

        double average = summa / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", average);

        System.out.println();
        System.out.println();
        System.out.println(" ЗАДАЧА № 4 ");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int c = reverseFullName.length - 1; c >= 0; c--) {
            System.out.print(reverseFullName[c] + "");

        }
    }
}