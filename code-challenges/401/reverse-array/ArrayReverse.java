public class ArrayReverse {
  public static void main(String[] args){
    int[] testArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] testArray2 = {67, 2, 4, 6, 18, 690, 62};
    reverseArray(testArray1);
    fancyReverse(testArray2);

    System.out.println("Test Array 1:");
    for(int i = 0; i < testArray1.length; i++){
      System.out.println(testArray1[i]);
    }

    System.out.println("\n\n\nTest Array 2:");
    for(int i = 0; i < testArray2.length; i++){
      System.out.println(testArray2[i]);
    }

  }

  public static int[] reverseArray(int[] arr){
    for(int i = 0; i < arr.length / 2; i++){
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
    return arr;
  }

  public static int[] fancyReverse(int[] arr){
    for(int i = 0; i < arr.length >>1; i++){
      arr[i] ^= arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] ^= arr[i];
      arr[i] ^= arr[arr.length - 1 - i];
    }
    return arr;
  }
}