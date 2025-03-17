package week01;

public class Ex15 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};

        System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 돌면서 하나씩 뽑아서 값을 바로 넣어줌!!!
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
