public class Challenge9 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int[] array3 = new int[2];
        array3[0] = array1[1];
        array3[1] = array2[1];
        System.out.println("Middle 1: " + array3[0] + "\n" +
                           "Middle 2: " + array3[1] + "\n");
    }
}
