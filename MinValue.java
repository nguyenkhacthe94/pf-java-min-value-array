import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 20 || size < 1)
                System.out.println("Size does not exceed 20");
        } while (size > 20 || size < 1);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        int min = array[0];
        for (i =0; i<array.length; i++) {
            if (min>array[i]) min = array[i];
        }
        System.out.print("The minimum value in the array is: " +min);
    }
}
