import java.util.*;

public class ConveyorWork {
    public static void main(String[] args) {
        Conveyor<? super BaggageTransporting> simpeExample = new Conveyor<BaggageTransporting>();
        simpeExample.AddData(new RibbonConveyor(23000, "Kapelou", 2500));
        simpeExample.AddData(new RibbonConveyor(25000, "Konsort", 1700));
        simpeExample.AddData(new VibrationalConveyor(14000, "Konveer", 1800, 12));
        simpeExample.AddData(new VibrationalConveyor(17000, "Konsort", 2000, 10));
        simpeExample.AddData(new RibbonConveyor(19000, "Kapelou", 3000));

        BaggageTransporting res = simpeExample.findMin();
        System.out.print("The lowest baggage amount is in this conveyor: \n");
        res.transport();
        res.print();
    }
}

class Conveyor<T extends BaggageTransporting> {
    private ArrayList<T> arr;

    public Conveyor() {
        arr = new ArrayList<T>();
    }

    public T findMin() {
        if (!arr.isEmpty()) {
            T min = arr.get(0);
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i).compareTo(min) < 0)
                    min = arr.get(i);
            }
            return min;
        }
        return null;
    }

    public void AddData(T data) {
        arr.add(data);
        System.out.print("Element turned on: ");
        data.print();
    }

    public void DeleteData(int i) {
        arr.remove(i);
    }
}

interface BaggageTransporting extends Comparable<BaggageTransporting> {
    public int getAmountOfElements();

    public void transport();

    public void print();
}

class RibbonConveyor implements BaggageTransporting {
    private int elementsPerDay;
    private String producerName;
    private int length;

    RibbonConveyor(int baggage, String name, int length) {
        elementsPerDay = baggage;
        producerName = name;
        this.length = length;
    }

    public int getAmountOfElements() {
        return elementsPerDay;
    }

    public String getName() {
        return producerName;
    }

    public int getLength() {
        return length;
    }

    public void transport() {
        System.out.println("***** Start to update this one ... *****");
    }

    public void print() {
        System.out.print(": " + producerName + ", Length of conveyor: " + length +
                ", Elements per day: " + elementsPerDay + ";\n");
    }

    public int compareTo(BaggageTransporting p) {
        Integer s = elementsPerDay;
        return s.compareTo(p.getAmountOfElements());
    }
}

class VibrationalConveyor implements BaggageTransporting {
    private int elementsPerDay;
    private String producerName;
    private int length;
    private int angle;

    VibrationalConveyor(int baggage, String name, int length, int angle) {
        elementsPerDay = baggage;
        producerName = name;
        this.length = length;
        this.angle = angle;
    }

    public int getAmountOfElements() {
        return elementsPerDay;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public void transport() {
        System.out.println("***** Start to update this one ... *****");
    }

    public void print() {
        System.out.print(": " + producerName + ", Length of conveyor: " + length +
                ", Elements per day: " + elementsPerDay + ", Angle: " + angle + ";\n");
    }

    public int compareTo(BaggageTransporting p) {
        Integer s = elementsPerDay;
        return s.compareTo(p.getAmountOfElements());
    }
}
