package code.day01_introduction;

import java.sql.SQLOutput;

public class Topic3_HA_ArrayCont {

    // DataType[] VariableNAme =[My Values will be here}

    public static void main(String[] args) {

        int [] Numbers={4,45,2,23,1,12,7,78,-89};
        System.out.println("The first nunber="+Numbers[0]);

        Numbers[0]=523;
        System.out.println("After I change the first nunber="+Numbers[0]);

        Numbers[5]=1;


        // DataType[] VariableNAme =[My Values will be here]

        System.out.println("****************************");

        String [] Cars={"BWM","Tesla","Ford","Lamborghini"};

        Cars[1]="Renualt";
        Cars[2]="Fiat";


        for (int i = 0; i <Cars.length ; i++) {

            System.out.println(Cars[i]);

        }






    }






}
