class Recursions {
    public static void main(String[] args) {
        int a[] = { 87, 34, 12, 90 };
        int i = a.length - 1;
        ro(a, i);
    }

    public static void ro(int a[], int i) {
        if (i == 0) {
            System.out.print(a[i] + " ");
            return;
        }
        System.out.print(a[i] + " ");
        ro(a, i - 1);
    }
}
