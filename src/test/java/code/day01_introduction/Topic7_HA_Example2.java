package code.day01_introduction;

public class Topic7_HA_Example2 {
    public static void main(String[] args) {

        //

        int [] number={5,99,63,-229,0,555};

        // Create a program that find maximum number in arry;

        int maximum=number[0];

        for (int i = 0; i < number.length ; i++) {

            if (maximum<number[i]) {
                maximum=number[i];

            }



        }System.out.println("maximum number"+maximum);
    }
}
