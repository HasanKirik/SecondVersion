package code.day01_introduction;

public class Topic2_HAArrays {
    public static void main(String[] args) {

        int [] MyIntArray={5,3,2,56};

        System.out.println("second value in the array:"+MyIntArray[0]);

        System.out.println("second value in the array:"+MyIntArray[1]);


        System.out.printf("The first number is %d and The Second is %d ", MyIntArray[0],MyIntArray[1] );

        System.out.println("***************************");

        String [] Names={"Tesla","Canan","Lib","Ege","Ayse","Melis","Gulsen","Sultan"};
        System.out.println("The first name in the list:"+Names[0]);
        System.out.println("The 5th. name is: "+Names[4]);
        System.out.println("The lenght of the name is: "+Names.length);
        System.out.println("The last name is;  "+Names[Names.length-1]);

        int[] MyNumber={5,6,7,8,9,235,0};
        System.out.println(MyNumber[MyNumber.length-1]);
        System.out.println(MyNumber[MyNumber.length-2]);

        System.out.println("+++++++++++++++++++++++++++++");

        for (int i = 0; i <= MyNumber.length-1 ; i++) { // insteead of 3 what can I write--> the lenght of MyNumber

            // i=0

            System.out.println(MyNumber[i]);

        }

        for (int i = 0; i < Names.length ; i++) {

            System.out.println("the neme  is :"+Names[i]);

        }



    }
}
