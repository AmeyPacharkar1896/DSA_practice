package BinarySearchAlgorithm.src;
// Find largest number in array which is equal to or smaller than to given number

public class Floor {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 8, 10, 12, 44, 55, 61 };
        int target = 6;
        int solution = floorOfNumber(array, target);
        System.out.println("The floor of '" + target + "' is at index " + solution);
        System.out.println("The floor value is : " + array[solution]);
    }

    // return the index
    // return -1 if it doesnt exit
    static int floorOfNumber(int[] array, int target) {
        if (target < array[0]) {
            return -1;
        }
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            // find middle element;
            int mid = start + (end - start) / 2;
            if (target < array[mid])
                end = mid - 1;
            else if (target > array[mid])
                start = mid + 1;
            else
                return mid;
        }

        return end;
    }

}
