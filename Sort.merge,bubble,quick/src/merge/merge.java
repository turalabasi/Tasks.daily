package merge;

import static merge.MergeSort.mergeSort;
public  class merge {
    public static void main(String[] args) {

        int[] arr = ShuffledArray.shuffleArray();
        int n = arr.length;

        System.out.println("Original array:");
        for (int num : arr) {
        System.out.print(num + " ");
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("\nSorted array:");
        for (int num : arr){
        System.out.print(num+" ");
        }}}
