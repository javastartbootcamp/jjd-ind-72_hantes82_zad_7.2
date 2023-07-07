package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {

        int n = inputArray.length;
        int compareCount = 0;

        do {
            boolean change = false;

            for (int i = 0; i < n - 1; i++) {
                compareCount++;
                if (inputArray[i] > inputArray[i + 1]) {
                    change = true;
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                }
            }

            if (!change) {
                break;
            }

            n--;
        } while (n > 1);

        return compareCount;
    }
}


