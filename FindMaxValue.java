public class FindMaxValue {
    public int maxValue(int[] arr){
        //edge case
        if(arr == null || arr.length == 00){
            throw new IllegalArgumentException("Invalid Input");
        }
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {40, 45, 0, 55, 15, -4, 5, 10};
        FindMaxValue obj = new FindMaxValue();
        System.out.println(obj.maxValue(arr));
    }
}
