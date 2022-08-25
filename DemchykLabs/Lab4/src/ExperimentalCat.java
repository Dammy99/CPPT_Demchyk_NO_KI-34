import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExperimentalCat extends Cat implements Experiments {
    public ExperimentalCat(float weight, String breed, String name, int age) throws FileNotFoundException {
        super(weight, breed, name, age);
    }

    public ExperimentalCat(float weight, String breed, String name, int age, String color)
            throws FileNotFoundException {
        super(weight, breed, name, age, color);
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
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter max speed of this cat in training :");
            float speed = scan.nextFloat();
            System.out.println("Max speed: " + catMaxSpeed(speed * potion));
        }
        System.out.println("New weight " + changingWeght());
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