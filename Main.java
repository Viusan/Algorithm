import java.util.Arrays; // Import the Arrays class

public class Main{
  public static void main(String[] args){
    int[] numbers = {1, 3, 9, 2, 5}; // Creates an array with these values
    changeOrder(numbers);
    System.out.println(Arrays.toString(numbers));
  }
  
  public static void changeIndex(int[] a, int i, int j){
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

  public static int [] changeOrder(int[] a){
  for(int i = 0; i < a.length-1; i++){
    if(a[i] > a[i+1]){
      changeIndex(a, i, i+1);
    }
  }
  return a;
  }
}