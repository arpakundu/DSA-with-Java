public class FindMissingNo {
    public static int findMissingNo(int[] arr){
        int n = arr.length+1;
        int sum = n * (n + 1) / 2;
        for(int num : arr){
            sum = sum - num;
        }
        return sum;
    }

    public void arraydDemo(){
        int[] arr = {1, 3, 4, 8, 9, 7, 2, 6, 10};
        System.out.println(findMissingNo(arr));
    }

    public static void main(String[] args) {
        FindMissingNo obj = new FindMissingNo();
        obj.arraydDemo();
    }
}
