import java.util.Arrays;
import java.util.Scanner;

class ArrayAddTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Choice = choice();
        int[] array = new int[10];
        int index = 0;
        int n;
        boolean exist = false;
        while (Choice != 4) {
            switch (Choice) {
            case 1:
            try {
                System.out.print("Enter numbers: ");
                    array[index] = input.nextInt();
                    ++index;
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You can only input 10 numbers");
            }
            break;
                
            case 2:
                try {
                System.out.print("Which Number? ");
                n = input.nextInt();
                for(int i=0; i<10; i++){
                    if(array[i]==n){
                        System.out.println(exist=true);
                        break;
                    } 
                    if(array[i] != n){
                        array[index]=n;
                        break;
                    }
                    }
                    ++index;
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("That number does not exist, however no more room in the Array");
            }
            break;
            case 3:
            try {
                System.out.print("which index? ");
                n = input.nextInt();
                System.out.println(array[n]);
                
            } catch (ArrayIndexOutOfBoundsException z) {
                System.out.println("Only index 1-9 are available");
            }
            break;
            case 0:
                    System.out.println(Arrays.toString(array));
                    break;
            case -1:

                    System.out.print("Which number do you want to delete? ");
                    System.out.println(Arrays.toString(array));
                    n = input.nextInt();
                    for(int i=0; i<array.length; i++){
                        if(array[i] == n){
                            array[i] = 0;
                        }
                        if(array[i] != n){
                            System.out.println("Number does not exist");
                            break;
                        }
                    }
            break;
            default:
                System.out.println("Try again or Quit!");
            }
            Choice = choice();
        }
    }

    public static int choice() {
        // System.out.print("Press 1 for array Size: ");
        System.out.println("Press -1 to Delete a number: ");
        System.out.println("Press o to see all the numbers: ");
        System.out.println("Press 1 to Enter array numbers: ");
        System.out.println("Press 2 to retrieve array number: ");
        System.out.println("Press 3 to retrieve array index: ");
        System.out.println("Press 4 to Quit: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}