public class MoveZerosToEnd {
    public void moveZeros(int[] arr, int n){
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }
    public static void  printArray(int[] arr){   //Funtion to print array//
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4, 0, 7, 0, 0, 7, 9, 20};
        MoveZerosToEnd obj = new MoveZerosToEnd();
        obj.moveZeros(arr, arr.length);
        MoveZerosToEnd.printArray(arr);
    }
}
