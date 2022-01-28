// APCSA, Randy Kaneer, Array Practice, v4.0, 01/26/2022

public class JacksonStanton00 {
    public static void main(String[] args) {
        String[] carArr = {"BMW M5", "Ferrari 250 GTO", "Porsche 911", "Ford f150 Lightning", "Buick Skylark"};
        int[] myGrades = {100, 25, 15, -3, 0, 75, 35};
        double[] myBankAccount = {0.0, -1.25, 3.75, 456.99, 25.25, 12.123456, 3.14};

        /*
        for (current_element = 0; current_element < carArr.length(); current_element++) {
            //Code to execute
            //Statement1 is executed once before the loop
            //Statement2 is the conditional for the loop
            //Statement3 is executed each time the loop runs

        }
        for (int i = 0; i < carArr.length; i++) {
            //System.out.println(i);
            System.out.println(carArr[i]);
        }
        System.out.println(carArr[3]);
        //Once you create an array you cannot change the size
        //You can only change the data stored in the array
        carArr[0] = "Volkswagen Passat";

        //Enhanced For loop, only works on arrays
        for (String i : carArr ) {
            //Code to execute
            System.out.println(i);
        }
        for (int i : myGrades ) {
            //Code to execute
            System.out.println(i);
        }
        for (double i : myBankAccount ) {
            //Code to execute
            System.out.println(i);
        }
        
        for (int i = 0; i < carArr.length; i++){
            if (carArr[i].length() % 2 == 0) {
                System.out.println(carArr[i]);
                System.out.println("this string has an even length.");
            } else {
                System.out.println(carArr[i]);
                System.out.println("this string has an odd length.");
            }
        }
        */

        //2D Arrays
        int[][] twoDIntArr = {{7,8,-9,2},{8,5,6,-7}};

        //System.out.println(twoDIntArr[0][3]);
        //System.out.println(twoDIntArr[1][3]);

        // Nested for loop
        for (int i = 0; i < twoDIntArr.length; ++i ) {
            for (int j = 0; j < twoDIntArr[i].length; ++j ) {
                System.out.println(twoDIntArr[i][j]);
            }
        }
        



    }
}