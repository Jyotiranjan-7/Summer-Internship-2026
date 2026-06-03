public class ArrayProg16 {
    public static void main(String[] arg) {
        int[] arr = {1, 2, 1, 3, 5, 4, 3};

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            boolean visited = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    visited = true;
                    break;
                }
            }
            if (visited)
                continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " = " + count + " times");
        }
    }
}
