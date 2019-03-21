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
  mergesortH(data, lo, (lo + hi) / 2);
  mergesortH(data, (lo + hi) / 2 + 1, hi);
  merge(data, lo, hi);
}

private static void merge(int[] data, int lo, int hi) {
  int mid = (lo + hi) / 2 + 1;
  int[] temp = new int[hi - lo + 1];
  int a = lo;
  int b = mid;
  for (int i = 0; i < data.length; i++) {
    if (a < mid && b <= hi){
      if (data[a] <= data[b]) {
        temp[i] = data[a];
        a++;
      }
      else {
        temp[i] = data[b];
        b++;
      }
      else if (a >= mid) {
        temp[i] = data[b];
        b++;
      }
    }
  }


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
