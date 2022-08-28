import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class Cat {
    private float weight;
    private String name;
    private int age;
    private String color;
    private PrintWriter fout;
    private Breed classBreed;
    private FoodAddiction addiction;
    private FleaInfestation flea;

    public Cat(float weight, String breed, String name, int age) throws FileNotFoundException {
        this.weight = weight;
        this.name = name;
        this.age = age;
        classBreed = new Breed(breed);
        addiction = new FoodAddiction();
        flea = new FleaInfestation();
    }

    public Cat(float weight, String breed, String name, int age, String color) throws FileNotFoundException {
        this(weight, breed, name, age);
        this.color = color;
    }

    protected void setFout(PrintWriter x) {
        fout = x;
    }

    public void setWeight(float newWeight) {
        this.weight = newWeight;
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void myMood(String mood) {
        System.out.println("I am: " + mood + ". And this is me ");
        fout.println("I am: " + mood + ". And this is me ");
        fout.flush();
    }

    public void makeSound() {
        System.out.println("Meow");
        fout.println("Meow");
        fout.flush();
    }

    public void doNotSleepAt3AM() {
        System.out.println("I'm scraping the door");
        fout.println("I'm scraping the door");
        fout.flush();
    }

    public void sleeping(int time) {
        System.out.println("Sleeping for " + time + "hours");
        fout.println("Sleeping for " + time + "hours");
        fout.flush();
    }

    public void eat(String food) {
        System.out.println("I'm eating " + food);
        fout.println("I'm eating " + food);
        fout.flush();
    }

    public void watchInTheWindow() {
        System.out.println("Oh wow, there is a bird!!");
        fout.println("Oh wow, there is a bird!!");
        fout.flush();
    }

    public boolean isIll() {
        if (age < 8) {
            return false;
        } else {
            return true;
        }
    }
    // 3 classes methods

    public void setFur(String fur) {
        classBreed.setFur(fur);
    }

    public void setNature(String nature) {
        classBreed.setNature(nature);
    }

    public void setFoodTime(int foodTime) {
        addiction.setFoodTimes(foodTime);
    }

    public void setFoodGram(int foodGram) {
        addiction.setFoodGrams(foodGram);
    }

    public void setFlea(boolean yes) {
        flea.setFlea(yes);
    }

    public void setPercentage(int per) {
        flea.setPercentageOfFlea(per);
    }

    public void printAllCharacteristics() {
        System.out.println("Full Properties START: -------------------");
        fout.println("Full Properties START: -------------------");

        // this class
        System.out.println("Name: " + getName());
        fout.println("Name: " + getName());

        System.out.println("Age: " + getAge());
        fout.println("Age: " + getAge());

        if (color != null) {
            System.out.println("Color: " + getColor());
            fout.println("Color: " + getColor());
        }

        System.out.println("Weight: " + getWeight());
        fout.println("Weight: " + getWeight());

        System.out.println("Am i ill - " + (isIll() ? "Yes" : "No"));
        fout.println("Am i ill - " + (isIll() ? "Yes" : "No"));

        // 3 classes
        classBreed.printBreed();
        fout.println("Breed is : " + classBreed.getBreed());
        fout.println("Fur is : " + classBreed.getFur());
        fout.println("Nature is : " + classBreed.getNature());

        flea.printFlea();
        fout.println("Has flea ? : " + flea.getFlea());
        fout.println("Possibility to get flea : " + flea.getFlea());

        addiction.printFood();
        fout.println("How many times needs to eat ? : " + addiction.getFoodTimes());
        fout.println("Food in grams for cat for 1 bowl: " + addiction.getFoodGrams());

        System.out.println("Full Properties END: -------------------");
        fout.println("Full Properties END: -------------------");
        fout.flush();
    }

    public void dispose() {
        fout.close();
    }
}
