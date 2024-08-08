public class SecondMaxFinder {

    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE; // Initialize max with the smallest possible integer value
        int secondMax = Integer.MIN_VALUE; // Initialize secondMax similarly

        for(int i = 0; i < arr.length; i++) { 
            if(arr[i] > max) { 
                secondMax = max; 
                max = arr[i]; 
            } 
            else if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i]; 
            }
        }
        return secondMax; 
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 9, 2, 7}; 
        int secondMax = findSecondMax(arr);
        System.out.println("The second maximum element is: " + secondMax);
    }
}

