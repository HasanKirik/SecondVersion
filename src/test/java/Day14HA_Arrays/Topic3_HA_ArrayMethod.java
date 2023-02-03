package Day14HA_Arrays;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;

import java.util.Arrays;

public class Topic3_HA_ArrayMethod {


    public static void main(String[] args) {
        int[]Numbers={99,35,86,-9,11};

        // {-9,11,35,86,99
        System.out.println(Numbers);
        System.out.println(Arrays.toString(Numbers));
        String [] Cties={"Toronto","Istanbul","London","Kitchener"};
        System.out.println(Arrays.toString(Cties));

        for (int i = 0; i <Cties.length ; i++) {
            System.out.println(Cties[i]);

        }
        int [] Values={99,35,86,-9,11};

        System.out.println(Arrays.toString(Values));
        Arrays.sort(Values);
        System.out.println(Arrays.toString(Values));

        Arrays.sort(Cties);
        System.out.println(Arrays.toString(Cties));



    }
}
