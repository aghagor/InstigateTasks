
public class Sort {
    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void quickSort(int[] array, int low, int high) {
        if (low < high ) {
            int p = partition(array, low, high);
            quickSort(array, low, p - 1);
            quickSort(array, p + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int border = low-1;
        for(int j = low;j<high;j++){
            if (array[j]<=pivot){
                border++;
                swap(array,border,j);
            }
        }
        swap(array,border+1,high);
        return border+1;
    }

    public void mergeSort(int[] array, int low, int high) {
        if (low == high) {
            return;
        } else {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }

    }

    private void merge(int[] array, int low, int middle, int high) {
        int[] leftArray = new int[middle - low + 2];
        int[] rightArray = new int[high - middle + 1];
        for (int i = low; i <= middle; i++) {
            leftArray[i - low] = array[i];
        }
        leftArray[middle - low + 1] = Integer.MAX_VALUE;
        for (int i = middle + 1; i <= high; i++) {
            rightArray[i - middle - 1] = array[i];
        }
        rightArray[high - middle] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        for (int k = low; k <= high; k++) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
        }
    }

    public int[] insertionSort(int[] array) {
        int i = 0;
        int j = 0;
        int key = 0;
        int temp = 0;
        for (i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && key < array[j]) {
                swap(array, j, j + 1);
                j--;
            }
        }
        return array;
    }

    public int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        return array;
    }

    public int[] selectionSort(int[] array) {
        int i, j, minValue, minIndex, temp = 0;
        for (i = 0; i < array.length; i++) {
            minValue = array[i];
            minIndex = i;
            for (j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            if (minValue < array[i]) {
                swap(array, i, minIndex);
            }
        }
        return array;
    }
}
