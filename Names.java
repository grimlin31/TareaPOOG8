import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Names {

    File maleNames;
    File femaleName;
    String[] names;
    int numMan;
    int numWoman;

    Names(String man, String woman, int numName) {
        this.femaleName = new File(woman);
        this.maleNames = new File(man);
        names = new String[numName];
        this.getNames(numName);
    }

    void getNames(int numName) {
        try {
            Scanner lineMan = new Scanner(this.maleNames);
            Scanner lineWoman = new Scanner(this.femaleName);
            int arrayPosition = 0;
            while ((lineMan.hasNextLine() || lineWoman.hasNextLine()) && arrayPosition < numName) {
                System.out.println(arrayPosition);
                double choiceFile = Math.random();
                if (choiceFile < 0.25 || (choiceFile > 0.5 && choiceFile < 0.75)){ // Man File
                    String[] line = lineMan.nextLine().split(",");
                    if (!(line[0].equals("nombre"))){
                        this.names[arrayPosition] = line[0];
                        arrayPosition = arrayPosition + 1;
                        this.numMan = this.numMan + 1;
                    }
                } else { // Woman File
                    String[] line = lineWoman.nextLine().split(",");
                    if (!(line[0].equals("nombre"))){
                        this.names[arrayPosition] = line[0];
                        arrayPosition = arrayPosition + 1;
                        this.numWoman = this.numWoman + 1;
                    }
                }
            }
            lineMan.close();
            lineWoman.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}