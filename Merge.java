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
  if (data.length <= 40) {
    insertionsort(data, lo, hi);
  }

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
    } else if (a >= mid) {
        temp[i] = data[b];
        b++;
      }
      else {
        temp[i] = data[a];
        a++;
      }
    }

    int i = lo;
    for (int x = 0; x < data.length; x++) {
      data[i] = temp[x];
      i++;
    }

  }


public static void insertionsort(int[] data, int lo, int hi)  {
  /*if (hi < lo) {
    return;
  }
  */
  for (int i = lo + 1; i <= hi; i++){
    int temp = data[i];
    int count = i;
    while (count > lo && data[count - 1] > temp) {
      data[count] = data[count - 1];
      count--;
    }
    data[count] = temp;
  }
}
/*
private static void printAry(int[] data){
  String result = "";
    for (int i = 0; i < data.length; i++){
      result += data[i] + ", ";
    }
    System.out.println(result);
  }

  public static void main(String[]args){
    System.out.println("Size\t\tMax Value\tquick/builtin ratio ");
    int[]MAX_LIST = {1000000000,500,10};
    for(int MAX : MAX_LIST){
      for(int size = 31250; size < 2000001; size*=2){
        long qtime=0;
        long btime=0;
        //average of 5 sorts.
        for(int trial = 0 ; trial <=5; trial++){
          int []data1 = new int[size];
          int []data2 = new int[size];
          for(int i = 0; i < data1.length; i++){
            data1[i] = (int)(Math.random()*MAX);
            data2[i] = data1[i];
          }
          long t1,t2;
          t1 = System.currentTimeMillis();
          Merge.mergesort(data2);
          t2 = System.currentTimeMillis();
          qtime += t2 - t1;
          t1 = System.currentTimeMillis();
          Arrays.sort(data1);
          t2 = System.currentTimeMillis();
          btime+= t2 - t1;
          if(!Arrays.equals(data1,data2)){
            System.out.println("FAIL TO SORT!");
            System.exit(0);
          }
        }
        System.out.println(size +"\t\t"+MAX+"\t"+1.0*qtime/btime);
      }
      System.out.println();
    }
  }
  */
//consulting the barron's book soon.
//barron's book has nothing on it.
}
