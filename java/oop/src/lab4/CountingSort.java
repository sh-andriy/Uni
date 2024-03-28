package lab4;

public class CountingSort {
    void sort(int[] arr) {
        int n = arr.length;

        int[] output = new int[n];

        // масив підрахунку для зберігання кількості кожного елементу
        int max = getMax(arr, n);
        int[] count = new int[max + 1];

        // зберігаю кількість кожного елемента
        for (int i = 0; i < n; ++i) {
            count[arr[i]]++;
        }

        // змінюю масив підрахунку так, щоб тепер він 0_o містив
        // фактичну позицію цього елемента у вихідному масиві
        for (int i = 1; i <= max; ++i) {
            count[i] += count[i - 1];
        }

        // побудова вихідного масиву
        // для стабільності проходжу 0_o вхідний масив з кінця до початку
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // копіюю вихідний масив у вхідний, так що тепер
        // вхідний 0_o масив містить відсортовані числа
        for (int i = 0; i < n; ++i) {
            arr[i] = output[i];
        }
    }

    // функція для отримання максимального значення у масиві
    int getMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 0_o o_0 простий прінт))
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        CountingSort ob = new CountingSort();
        int[] arr = {10, 7, 12, 4, 9, 13};
        System.out.println("Початковий масив:");
        ob.printArray(arr);

        ob.sort(arr);

        System.out.println("Відсортований масив:");
        ob.printArray(arr);
    }
}
