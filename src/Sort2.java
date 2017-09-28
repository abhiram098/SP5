import java.util.Random;

public class Sort2 {
    public  void quickSort(int[] A, int start, int end){
        int pIndex;
        if(start<end){
            pIndex = partition2(A,start,end);
            quickSort(A,start,pIndex-1);
            quickSort(A,pIndex,end);
        }
    }
    public int partition2(int[] A, int start, int end){
        int randomIndex = (start +new Random().nextInt((end - start)+1)); //selecting a random number that can be taken as a pivot
        int pivot = A[randomIndex];
        int front = start-1;
        int back = end+1;
        while(true){
            do {
                front++;
            }while(A[front]<pivot);
            do {
                back--;
            }while (A[back]>pivot);
            if (front>=back) return back;
            Sort.swap(A,A[front],A[back]);
            front++;
            back--;
        }
    }
}
