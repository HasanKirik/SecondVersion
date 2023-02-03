package Feb02StudyHall;

public class Question2 {
    public static void main(String[] args) {

        String myResume="hello my name is Cihan.       i am 23 years old.  i live in San Francisco.   I have been" +
                " in IT industry for about 6 years.\n" +
                " I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. I have experience in EducatION," +
                " energy,finance and some manY Other AREAs.\n" +
                "  i HAve scrum master and Oracle java Programmer certificates.   i love JaVA." +
                "   I designed and DEVELoped many automation test cases using BDD FRamework.";
        String [] array=myResume.split("[.]");
        System.out.println(myResume);
        String myNewResume="";
        System.out.println("-------------------------------------------------------------------------------");
        for(int i=0;i<array.length;i++){
            // i am 23 years old-->i am 23 years old
            //array[i]=array[i].strip();
            int length=array[i].length();
            array[i]=array[i].substring(0,1).toUpperCase()+array[i].substring(1).toLowerCase();
            System.out.println(array[i]+" ---> Length of the line : " +length);
            myNewResume+=array[i]+". ";
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(myNewResume);
    }
    }
