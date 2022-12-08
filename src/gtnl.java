public class gtnl {
    public static void main(String[] args) {
    int[] array1 = {1,3,63,56,4,3,5};
    int index = minvalue(array1);
        System.out.println("gia tri nho nhat la : "+array1[index]);
    }
    public static int minvalue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
