package week01;

public class Ex16 {
    public static void main(String[] args) {

        int arr[] = new int[]{10, 20, 30};

        System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
