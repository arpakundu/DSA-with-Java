public class ResizeArray {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.err.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ResizeArray obj = new ResizeArray();
        obj.printArray(arr);
        arr = obj.resize(arr, 10);
        System.out.println(arr.length);
    }
}
