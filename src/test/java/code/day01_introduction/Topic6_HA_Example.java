package code.day01_introduction;

import org.checkerframework.checker.units.qual.A;

public class Topic6_HA_Example {

    public static void main(String[] args) {
        int[]Ages={35,40,52,53,65,12};


        double Total=0;
        for (int i = 0; i < Ages.length; i++) {

            Total=Total+ Ages[i];

            System.out.println("Total is :"+Total);

            double Avarge=Total/Ages.length;

            System.out.println("Avarge :: "+Avarge);



        }

    }
}
