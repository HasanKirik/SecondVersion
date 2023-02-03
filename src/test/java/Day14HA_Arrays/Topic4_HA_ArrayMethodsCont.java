package Day14HA_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Topic4_HA_ArrayMethodsCont {
    public static void main(String[] args) {

        String [] Animals={"dog","cat","Horse","Lion","Bird","sineck","Donkey","Zebra",};
        System.out.println(Arrays.toString(Animals));
        Arrays.sort(Animals);
        System.out.println(Arrays.toString(Animals));

        /*
        Ascii table

        A=65  a=97
        B=66  b=98
         */

        int [] Array1={1,2,3,4};
        int [] Array2={1,2,3};
        int [] Array3={2,3,1,4};
        Arrays.sort(Array3);




        System.out.println(Arrays.equals(Array1, Array2));

        System.out.println(Arrays.equals(Array1, Array3));

        System.out.println(Arrays.toString(Array3));

    }
}
