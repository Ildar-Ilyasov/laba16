import java.util.Arrays;
import java.util.Scanner;

public class Main{
    interface lambda {
        boolean sravnenie(int x, int y);
    }

    private static void bubbleSort(int [] array, lambda uslov) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (uslov.sravnenie(array[i], array[j])) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Отсортированный по убыванию: ");
        bubbleSort(array, ((x, y) -> x < y));
        System.out.println(Arrays.toString(array));
        System.out.println("Отсортированный по возрастанию: ");
        bubbleSort(array, ((x, y) -> x > y));
        System.out.println(Arrays.toString(array));
    }
}