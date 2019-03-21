import java.util.* ;
import java.io.* ;

public class Merge {

  int[] temp;

/*sort the array from least to greatest value. This is a wrapper function*/
public static void mergesort(int[] data){
  if (data.length <= 1){
    return;
  }
  else {
    mergesortH(data, 0, data.length - 1);
    //copyOfRange gets the copy of array.
  }
}

private static void mergesortH(int[] data, int lo, int hi) {

}

private static void merge(int[] data, int[] temp, int[] result) {


public static void insertionsort(int[] data, int lo, int hi)  {
  if (hi < lo) {
    return;
  }

  for (int i = 0; i + lo < data.length; i++){
    //This swaps front and back.
    if (data[lo] > data[lo + 1]) {
      int temp = data[lo];
      data[lo] = data[lo + 1];
      data[lo + 1] = count;
    }

  }
}

private static void printAry(int[] data){
  String result = "";
    for (int i = 0; i < data.length; i++){
      result += data[i] + ", ";
    }
    System.out.println(result);
  }

public static void main(String[] args) {
  int[] monkey = {4, 5, 2, 1, 3};
  printAry(monkey);
}
//consulting the barron's book soon.
//barron's book has nothing on it.
}
