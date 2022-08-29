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
        arr = new char[nRows][];
        for (int i = 0; i < nRows / 2; i++) {
            arr[i] = new char[0];
        }
        for (int i = nRows / 2; i < nRows; i++) {
            arr[i] = new char[i + 1];
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
            for (int i = 0; i < nRows / 2; i++) {
                System.out.println(arr[i]);
                fout.println();
            }
            for (int i = nRows / 2, b = 0; i < nRows; i++, b++) {
                for (int j = 0; j < i + 1; j++) {
                    arr[i][j] = filler.charAt(0);
                }
                for (int j = 0; nRows % 2 == 0 ? j <= ((nRows / 2) - 2) - b : j <= ((nRows / 2) - 1) - b; j++) {
                    arr[i][j] = ' ';
                }
                System.out.println(arr[i]);
                fout.print(arr[i]);
                fout.print("\n");
            }
            in.close();
            fout.flush();
            fout.close();
        }
    }
}
