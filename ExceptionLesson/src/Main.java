import java.util.Random;

public class Main {


    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {


        String[][] testString = new String[4][4];


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Integer randNum = (int) (Math.random() * 10);
                String strForArray = randNum.toString();
                testString[i][j] = strForArray;
                }
        }

        //Testing MyArrayDataExcep
        //testString[2][1] = "5vd";

        ExceptionsExercise examle = new ExceptionsExercise();
        examle.doubleStringArray(testString);
    }
}
