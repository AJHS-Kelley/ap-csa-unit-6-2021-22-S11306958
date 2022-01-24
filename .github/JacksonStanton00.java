// APCSA, Randy Kaneer, Array Practice, v2.0, 01/24/2022

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
        */
        System.out.println(carArr[3]);
        //Once you create an array you cannot change the size
        //You can only change the data stored in the array
        carArr[0] = "Volkswagen Passat";

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


    }











}