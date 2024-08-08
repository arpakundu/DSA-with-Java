public class ReverseArrayElements {

    public static void  printArray(int[] arr){  //To print array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] numbers, int start, int end) {  //To reverse array
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] arr = {2,4,6,8,10};
        printArray(arr);
        reverseArray(arr, 0, arr.length-1);
        printArray(arr);
    }
}
