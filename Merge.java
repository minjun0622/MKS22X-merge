public class Merge {

/*sort the array from least to greatest value. This is a wrapper function*/
public static void mergesort(int[] data){
  int[] temp;
  //copying array.
  for (int i = 0; i < data.length; i++){
    data[i] = temp[i];
  }

}

private static void merge(int[] data, int lo, int hi) {
  if (lo >= hi) {
    return;
  }
  
  if (data.length = 1){
    return data[0];
  }

  int round;
  if ( (data.length % 2) = 0) {
    round = data.length / 2;
  }
  else {
    round = data.length / 2 + 1;
  }

  merge(data[round], int lo - round, int hi);
  merge(data[round], int lo, int hi - round);

}
public static void main(String[] args) {
  int[] monkey = new monkey;

}
//consulting the barron's book soon.
}
