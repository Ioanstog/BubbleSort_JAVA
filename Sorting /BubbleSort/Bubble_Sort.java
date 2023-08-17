package BubbleSort;

class Bubble_Sort {

    public static void sort (int[] numbers){
        int i, j, temp;
        boolean flag;
        for (i=1; i < numbers.length; i++ ){
            flag = true;
            for(j=0; j < numbers.length-i; j++){
                if(numbers[j] > numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    flag = false;
                }
            }
            if (flag) return;
        }//method sort
    }

}