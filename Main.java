import java.util.Arrays; // Import the Arrays class

public class Main{
  public static void changeIndex(int[] a, int i, int j){
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

//Oppgave 1
  static int partition(int[] arr, int low, int high){
    int pivot = arr[high];//Choose the pivot
    int i = low-1;
    for(int j = low; j <= high-1; j++){
      //Notice i is set to low -1, so it is "one step behind" the loop
      //The loop checks if current index is smaller then the pivot, if not then next, checks again and if so the previous element must be higher then the current so swap
      if(arr[j]<pivot){
        i++;
        changeIndex(arr, i, j);
      }
    }
    //Finally we know which elements are higher then pivot, and swap places by putting it in the middle.
    changeIndex(arr, i+1, high);
    return i+1;
  }
  static void quickSort(int[] arr, int low, int high){
    if(low < high){
      int pi = partition(arr, low, high);
      
      //Notice the -1 and +1 are there since the pivot is sorted and doesnt need to change place ever, so we skip one down to sort the bottom half, and one up for the upper
      quickSort(arr, low, pi-1);// sort left side (elements < pivot)
      quickSort(arr, pi+1, high);// sort right side (elements >= pivot)
    }
  }

//Oppgave 2  
  public static int antallUlikeSortert(int[] a){
    return a;
  } 
  public static void main(String[] args){
    int[] numbers = {1, 3, 9, 2, 5};
    int n = numbers.length;

    quickSort(numbers, 0, n - 1);

    System.out.println(Arrays.toString(numbers));
  }
}