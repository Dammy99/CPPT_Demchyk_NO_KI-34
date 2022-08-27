import java.io.*;
import java.util.*;

/**
 * Клас Lab2DemchykKI34 реалізує приклад програми до лабораторної роботи №2
 *
 * @author Demchyk Nazar
 * @version 1.0
 * @since version 1.0
 *
 */
public class Lab2DemchykKI34 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * 
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyTriangle.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введiть розмiр квадратної матрицi: ");
        nRows = in.nextInt();
        in.nextLine();

        if (nRows % 2 == 0) {
            arr = new char[nRows / 2][];
            for (int i = 0; i < nRows / 2; i++) {
                arr[i] = new char[nRows / 2 + 1 + i];
            }
        } else {
            arr = new char[nRows / 2 + 1][];
            for (int i = 0; i < nRows / 2 + 1; i++) {
                arr[i] = new char[nRows / 2 + 1 + i];
            }
        }
        System.out.print("\nВведiть символ-заповнювач: ");
        filler = in.nextLine();

        exit: if (filler.length() == 0) {
            System.out.print("\nНе введено символ заповнювач");
            break exit;
        } else if (filler.length() > 1) {
            System.out.print("\nЗабагато символiв заповнювачiв");
            break exit;
        } else {

            for (int i = 0; i < (nRows % 2 == 0 ? nRows / 2 : nRows / 2 + 1); i++) {

                for (int j = 0; j < nRows / 2 + 1 + i; j++) {
                    arr[i][j] = filler.charAt(0);
                }
                for (int j = (nRows % 2 == 0 ? (nRows / 2 - 2) - i : (nRows / 2 - 1) - i); j > -1; j--) {
                    arr[i][j] = ' ';
                }
                for (int j = 0; j < nRows / 2 + 1 + i; j++) {
                    System.out.print(arr[i][j]);
                    fout.print(arr[i][j]);
                }
                System.out.println();
                fout.print("\n");
            }
            in.close();
            fout.flush();
            fout.close();
        }
    }
}
