package code.day01_introduction;

public class Topic5_HA_ArraysCont {
    public static void main(String[] args) {


        // Create an empty int array and the lenght is 4
        // DataType [] VariableName=new DataType[lenght]

        int [] Numbers = new int[4];//{0,0,0,0}

        Numbers[0]=4;
        Numbers[1]=44;
        Numbers[2]=52;
        Numbers[3]=20;

        for (int i = 0; i < Numbers.length ; i++) {

            System.out.println(Numbers[i]);

        }


        // Create an empty int array and the lenght is 10

        int[] Numbers2=new int[10];

        for (int i = 0; i < Numbers2.length ; i++) {

            Numbers2[i]=i+1;

            System.out.println("Hasan ;  "+Numbers2[i]);

        }




    }
}
