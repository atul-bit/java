public class BinarySearch {
    public static void main (String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 7;
        int index = binarySearch(arr, target);
        System.out.println("The index is : " + index);
    }

    public static int binarySearch (int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
