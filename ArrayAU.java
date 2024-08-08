class ArrayAU {
    public void printArray(int[] arr){   //Array printing//
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void arrayDemo(){       // Array initialization//
    int[] myArray = new int[5];  
    myArray[0] = 5;
    myArray[1] = 1;
    myArray[2] = 8;
    myArray[3] = 2;
    myArray[4] = 10;
    myArray[2] = 9;
    printArray(myArray);
    System.out.println(myArray.length);
    System.out.println(myArray[myArray.length-1]); //Printing the last element//
    // Different ways to initialize and print array//
    int[] arr = {1,2,3,4};
    printArray(arr);
    printArray(new int[] {5,10,20,30});
}
    public static void main(String[] args) {
        ArrayAU obj = new ArrayAU();
        obj.arrayDemo();
    }
}
