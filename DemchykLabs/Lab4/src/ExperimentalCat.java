import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExperimentalCat extends Cat implements Experiments {
    private PrintWriter fout;

    public ExperimentalCat(float weight, String breed, String name, int age) throws FileNotFoundException {
        super(weight, breed, name, age);
        fout = new PrintWriter(new File("CatLog.txt"));
        setFout(fout);
    }

    public ExperimentalCat(float weight, String breed, String name, int age, String color)
            throws FileNotFoundException {
        super(weight, breed, name, age, color);
        fout = new PrintWriter(new File("CatLog.txt"));
        setFout(fout);
    }

    public void doing() {
        System.out.println("Doing");
    }

    public void onExperiment() {
        System.out.println("On experiment");
    }

    @Override
    public void printAllCharacteristics() {
        super.printAllCharacteristics();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter max speed of this cat on training :");
        float speed = scan.nextFloat();
        System.out.println("After using potion max speed: " + catMaxSpeed(speed * potion));
        fout.println("After using potion max speed: " + catMaxSpeed(speed * potion));

        System.out.println("After using potion new weight: " + changingWeght());
        fout.println("After using potion new weight: " + changingWeght());
        scan.close();
    }

    @Override
    public double catMaxSpeed(float speed) {
        return speed;
    }

    @Override
    public float changingWeght() {
        setWeight(getWeight() * potion);
        return getWeight();
    }
}

interface Experiments {
    void onExperiment();

    double catMaxSpeed(float speed);

    float changingWeght();

    float potion = 1.1f; // уявна константа
}