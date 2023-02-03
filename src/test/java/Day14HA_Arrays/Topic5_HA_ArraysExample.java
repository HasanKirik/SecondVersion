package Day14HA_Arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Topic5_HA_ArraysExample {
    public static void main(String[] args) {

        int [] Array1={1,8,9};
        int [] Array2={55,21,97,-9};


        //  int [] Array3= Array1+Array2; We cant use this.
        int TotalLenght=Array1.length+Array2.length;
        int[] Array3=new int[TotalLenght];

        //Array3=Array1+Array2;
        for (int i = 0; i <Array1.length ; i++) {

            Array3[i]=Array1[i];

        }

        for (int k = 0; k <Array2.length ; k++) {

            Array3[k+3]=Array2[k];

        }


        System.out.println(Arrays.toString(Array3));


    }
}
