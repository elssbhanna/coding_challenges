public class Challenge16 {
   public static void main(String[] args) {
       int[] arr1 = {1,3,5,7,9};
       int[] arr2 = {2,4,6,8,10};
       int[] zipped = zipArrays(arr1,arr2);
       System.out.println("Length: " + zipped.length);
       for(int i = 0;i < zipped.length;i++) {
           System.out.println(zipped[i]);
       }
   }
   
   public static int[] zipArrays(int[] array1,int[] array2) {
       int[] zippedArray = new int[array1.length + array2.length];
       // loop over the array1 with i but access the zippedArray
       // with j.
       for(int i = 0, j = 0;i < array1.length;i++, j = j + 2) {
           zippedArray[j] = array1[i];
       }
       // loop over the array2 with i but access the zippedArray
       // with j.
       for(int i = 0, j = 1;i < array2.length;i++, j = j + 2) {
           zippedArray[j] = array2[i];
        }
       return zippedArray;
   }
}
