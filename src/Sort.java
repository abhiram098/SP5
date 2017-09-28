import java.util.Random;

public class Sort {
    public  void quickSort(int[] A, int start, int end){
        int pIndex;
        if(start<end){
            pIndex = partition1(A,start,end);
            quickSort(A,start,pIndex-1);
            quickSort(A,pIndex+1,end);
        }
    }
    public int partition1(int[] A,int start,int end){
        int randomIndex = (start +new Random().nextInt((end - start)+1)); //selecting a random number that can be taken as a pivot
        swap(A,randomIndex,end); //swapping end with the element at the random index
        int pivot = A[end];
        int index = start-1;
        for (int i=start; i<end; i++){
            if(A[i]<=pivot){
                index++;
                swap(A,index,i);
            }
        }
        swap(A,index+1,end); //Bringing the Pivot back to the center
        return index+1; //Returning the Partition Index
    }
    public static final void swap(int A[], int a, int b){
       int temp = A[a];
       A[a]=A[b];
       A[b]=temp;
    }
    public void printArray(int[] A){
        for(int i:A) System.out.println(i);
    }
}

