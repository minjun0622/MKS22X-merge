import java.util.* ;
import java.io.* ;

public class Merge {

  int[] temp;

/*sort the array from least to greatest value. This is a wrapper function*/
public static void mergesort(int[] data){
  //copying array.
  /*
  this for making it faster, learn to get it working first.
  for (int i = 0; i < data.length; i++){
    temp[i] = data[i];
  }
  */
  merge(data, 0, data.length);
}

private static void merge(int[] data, int lo, int hi) {
  if (lo >= hi) {
    return;
  }

  int round;
  if ( (data.length % 2) = 0) {
    round = data.length / 2;
  }
  else {
    round = (data.length / 2) + 1;
  }

  for (int i  = 0; i < data.length; i++) {
    //swapping if the one in the front is greater than the one in the back.
    if (data[lo] > data[lo + i]) {
      int count = data[lo];
      data[lo] = data[lo + i];
      data[lo + i] = count;
    }
    else {
      /* there's a method called copyOfRange and this gets the copy of an array.
      cut data[] in half using "round" instance variable.
      yes
      */

    }
  }
//when there's two of the same element, just use the left one due to it being more stable.
  merge(data[hi - round], lo, hi - 1);
  merge(data[lo + round], lo + 1, hi);

  /*
  insertionsort(data[hi - round], lo, hi - 1);
  insertionsort(data[lo + round], lo + 1, hi);
  */

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
