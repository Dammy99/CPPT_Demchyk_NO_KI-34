//package KI34.Demchyk.lab5;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

public class EquationsApp {
    public static void main(String[] args) {
        try {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try {
                try {
                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));
                } finally {
                    in.close();
                    fout.flush();
                    fout.close();
                }
            } catch (CalcException ex) {
                out.print(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}

class CalcException extends ArithmeticException {
    public CalcException() {
    }

    public CalcException(String cause) {
        super(cause);
    }
}

class Equations {
    public double calculate(int x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            y = Math.cos(rad) / Math.sin(rad);
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY ||
                    y == Double.POSITIVE_INFINITY || x == 180 || x == -180 || x == 360 || x == -360 || x == 0)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
            if (rad == Math.PI || rad == -Math.PI || rad == 0 || rad == Math.PI * 2 || rad == -Math.PI * 2)
                throw new CalcException("Exception reason: Illegal value of X for cotangent (cos/sin) calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }
}