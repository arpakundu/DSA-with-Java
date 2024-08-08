public class RemoveOddInteger { // In another meaning it is printing the even array elements // 
    public static void  printArray(int[] arr){   //Funtion to print array//
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
        
    public static int[] removeOdd(int[] arr){   //Funtion to remove odd integers from array//
        int evenCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] %2 == 0){
                evenCount++;
            }
        }
        int[] result = new int[evenCount];
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr);
        int[] result = removeOdd(arr);
        printArray(result);
    }
}
