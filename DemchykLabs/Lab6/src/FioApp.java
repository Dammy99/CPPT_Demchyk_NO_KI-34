//package KI34.Demchyk.lab6;

import java.io.*;
import java.util.*;

public class FioApp {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        CalcWFio obj = new CalcWFio();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble();
        obj.calculate(data);
        System.out.println("Result 'original' is: " + obj.getResult());
        obj.writeResTxt("textRes.txt");
        obj.writeResBin("BinRes.bin");

        obj.readResBin("BinRes.bin");
        System.out.println("Result 'BinRes.bin' is: " + obj.getResult());
        obj.readResTxt("textRes.txt");
        System.out.println("Result 'textRes.txt' is: " + obj.getResult());
        s.close();
    }
}

class CalcWFio {
    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ", result);
        f.close();
    }

    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            } else
                throw new FileNotFoundException("File " + fName + "not found");
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void writeResBin(String fName) throws FileNotFoundException, IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }

    public void readResBin(String fName) throws FileNotFoundException, IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    class CalcException extends ArithmeticException {
        public CalcException() {
        }

        public CalcException(String cause) {
            super(cause);
        }
    }

    public double calculate(Double x) throws CalcException {
        double rad;
        rad = x * Math.PI / 180.0;
        try {
            result = Math.cos(rad) / Math.sin(rad);
            if (result == Double.NaN || result == Double.NEGATIVE_INFINITY ||
                    result == Double.POSITIVE_INFINITY || x == 180 || x == -180 || x == 360 || x == -360 || x == 0)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
            if (rad == Math.PI || rad == -Math.PI || rad == 0 || rad == Math.PI * 2 || rad == -Math.PI * 2)
                throw new CalcException("Exception reason: Illegal value of X for cotangent (cos/sin) calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return result;
    }

    public double getResult() {
        return result;
    }

    private double result;
}