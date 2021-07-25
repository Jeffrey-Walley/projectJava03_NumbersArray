import java.util.*;


public class projectJava03_NumbersArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();

        System.out.println("Please enter 5 integers :");
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            intList.add(num);
        }

        System.out.println(intList);

    // Find sum of all items in array
        long sum = 0;
        for (Integer num : intList) {
            sum += num;
        }
        System.out.println("The sum of all Integers is: " + sum);

    // Find product of all items in array
        long product = 1;
        for (Integer num : intList) {
            product *= num;
        }
        System.out.println("The product of all integers is: " + product);

/*    // Find Max of Array
       long temp = intList[0];
            for (int i = 0; i < intList.length; i++) {
                if (temp < intList[i]) temp = intList[i];
            }
            return temp;

        }
        System.out.println("The smallest value in the Array is: " + least);
        System.out.println("The largest value in the Array is :" + temp); */




    }
}



// Attempt 4 -- now i'm going to lift Aron Horton's Assignment from class and try to make it work

/* import java.util.*;

public class projectJava03_NumbersArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] number = new int[size];
        int sum = 0;

        for(int i = 0; i < size; i++) {
            int nextNum = input.nextInt();
            number[i] = nextNum;
            sum += number[i];
        }
        System.out.println(Arrays.toString("the Sum of the Numbers is: " +sum));
    }

} */

// ATTEMPT #3
/* import java.util.*;
public class projectJava03_NumbersArray {
     // creates array list of integers called numbers
    int length = 0, number = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will you enter into the Array? ");
        length = input.nextInt();

        String[] names = new String[length];

        for(int i = 0; i < length; i++);
            System.out.println(" Enter the of Number " +(i+1));
            number[i] = input.next();
}
    input.close();

        System.out.println("The Numbers are :");
            for(int i = 0; i < length; i++);
        System.out.println(number[i]);
*/






// ATTEMPT #2
/* import java.util.*;
  public class projectJava03_NumbersArray<sum, prod> {

    public static void main(String[] args){
        int sum = 0, prod = 0, small = 0, large = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = scan.nextInt();
        int [] array = new int[size];
        for (int i=0; i < size; i++) {
            System.out.println("Enter the Elements: ");
            array[i]=scan.nextInt();
        }
        scan.close();
        for(int i=0; i < size; i++){
            System.out.println(array[i]);
        }
    }
    sum += size[i];
    prod *= size[i];

        System.out.println("The sum of the numbers entered is : " + sum);
        System.out.println("The product of the numbers is :" + prod);
  }
  }  */







// ATTEMPT #1
/* import java.util.*;
public class projectJava03_NumbersArray {


    public static void main(String[] args);
    ArrayList<Integer> intArray = new ArrayList<>();

        {
        int i,number=0, sum=0; result=0; large=0; small=0;
        double avg;
        {

            System.out.println("Input 5 numbers : ");

        }
        for (int i=0; i <intArray.length; i++)
            if (intArray[i] < min) {
                min = intArray[i];
            }
        return min;
        {

            sum += number;
            result *= number;

        }
        avg = sum/intArray.length;
        System.out.println("The sum of the 5 no is : " + sum);
        System.out.println("The product of the numbers is :" + result);
        System.out.println("The largest number in the group is :" + m.max(intArray));
        System.out.println("The smallest number in the group is :" + m.min(intArray));
        System.out.println("The average of the numbers in the group is :" + avg);

    }
}  */
