import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Simulacion {
    public static void main(String[] args) {

        double T, N, I, I_time, width, height, d, NumVac, VacSize, VacTime;
        double Speed, deltaTime, deltaGrade, M, pNoMask, p0, p1, p2;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el path del archivo .csv: ");
        //String path = input.nextLine();
        String path = "Data/Datos.csv";
        System.out.println(path);
        File file = new File(path);

        if (file.exists()) {
            try {
                Scanner fileLine = new Scanner(file);
                while (fileLine.hasNextLine()) {
                    String line = fileLine.nextLine();
                    String[] data = line.split(",");
                    if (data.length == 17) {
                        // if line has all value
                        T = Double.parseDouble(data[0]);
                        N = Double.parseDouble(data[1]);
                        I = Double.parseDouble(data[2]);
                        I_time = Double.parseDouble(data[3]);
                        width = Double.parseDouble(data[4]);
                        height = Double.parseDouble(data[5]);
                        Speed = Double.parseDouble(data[6]);
                        deltaTime = Double.parseDouble(data[7]);
                        deltaGrade = Double.parseDouble(data[8]);
                        d = Double.parseDouble(data[9]);
                        M = Double.parseDouble(data[10]);
                        p0 = Double.parseDouble(data[11]);
                        p1 = Double.parseDouble(data[12]);
                        p2 = Double.parseDouble(data[13]);
                        NumVac = Double.parseDouble(data[14]);
                        VacSize = Double.parseDouble(data[15]);
                        VacTime = Double.parseDouble(data[16]);

                        Comuna comuna = new Comuna(width, height);
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}