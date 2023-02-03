package Day18HA_Method;

public class Topic1_HA_Example {
    public static void main(String[] args) {

        /*
Write a code  with following instructions:
1) Ask user to enter a sentence
2) check each word in the sentence to see how many 'l', 'a' and 'b' characters in the each wordint

 */

        int[] MyNumber = {1, 2, 3, 4, 5};

        int[] MyNumber1={0,0,0};



        for (int i = 0; i < MyNumber.length; i++) {

            if (i == 0) {
                MyNumber1[0]=MyNumber[0];
                MyNumber[0] = MyNumber[4];
                MyNumber[4]=MyNumber1[0];







        }
            System.out.println(MyNumber[i]);

            int x=10;
            x+=x+5;
            System.out.println(x);

    }}}
