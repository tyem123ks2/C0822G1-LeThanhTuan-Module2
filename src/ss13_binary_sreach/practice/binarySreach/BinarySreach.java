package ss13_binary_sreach.practice.binarySreach;

public class BinarySreach {
    public static void main(String[] args) {
        int[] arr = {-20, 1, 3, 5, 8, 9};
        System.out.println(binarySreach(arr, 5, 0, arr.length - 1));
    }

    private static int binarySreach(int[] arr, int k, int left, int right) {
        if (right >= left) {
            int mid = (right + left) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (k > arr[mid]) {
                return binarySreach(arr, k, mid + 1, right);
            }
            return binarySreach(arr, k, left, mid - 1);
        }
        return -1;
    }
}
