package BubbleSort;

public class Test_Bubble_Sort {
    
    public static void main (String[] args){
        int[] numbers = {3, 8, 2, 9, 4};

        Bubble_Sort.sort (numbers);

        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    
    }
}
