public class FindMinValue {
    
    public int minvalue(int[] arr){
        //edge case
        if(arr == null || arr.length == 00){
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {40, 45, 0, 55, 15, -4, 5, 10};
        FindMinValue obj = new FindMinValue();
        System.out.println(obj.minvalue(arr));
    }
}
