
/**
 * Created by Amandavilli on 9/28/2017.
 */
public class Driver {
    public static void main(String[] args) {
        int[] A ={3,4,8,1,7,5,6,2};
        Sort s = new Sort();
        s.quickSort(A,0,A.length-1);
        System.out.println("Array Sorted using Partition 1: ");
        s.printArray(A);
        Sort2 sort2 = new Sort2();
        sort2.quickSort(A,0,A.length-1);
        System.out.println("Array Sorted using Partition 2: ");
        s.printArray(A);
    }
}
