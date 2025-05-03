class Duplicate_Value {
    private int arr[];
    private int n;

    Duplicate_Value(int arr[], int n) {
        this.arr = arr;
        this.n = n;
    }

    public void getDuplicateElement() {
        boolean visited[] = new boolean[n]; // to keep track of visited elements

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue; // skip already counted elements

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Element " + arr[i] + " appears " + count + " times.");
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 1};
        int n = arr.length;
        Duplicate_Value DV = new Duplicate_Value(arr, n);
        DV.getDuplicateElement();
    }
}
