import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class Cat {
    private float weight;
    private String breed;
    private String name;
    private int age;
    private String color;
    private PrintWriter fout;

    public Cat(float weight, String breed, String name, int age) throws FileNotFoundException {
        this.weight = weight;
        this.breed = breed;
        this.name = name;
        this.age = age;

        fout = new PrintWriter(new File("CatLog.txt"));
    }

    public Cat(float weight, String breed, String name, int age, String color) throws FileNotFoundException {
        this(weight, breed, name, age);
        this.color = color;

    }

    public void setWeight(float newWeight) {
        this.weight = newWeight;
    }

    public float getWeight() {
        return weight;
    }

    public String getBreed() {
        return breed;
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

    public void printAllCharacteristics() {
        System.out.println("Full Properties START: -------------------");
        fout.println("Full Properties START: -------------------");
        System.out.println("Name: " + getName());
        fout.println("Name: " + getName());

        System.out.println("Age: " + getAge());
        fout.println("Age: " + getAge());

        System.out.println("Breed: " + getBreed());
        fout.println("Breed: " + getBreed());

        if (color != null) {
            System.out.println("Color: " + getColor());
            fout.println("Color: " + getColor());
        }

        System.out.println("Weight: " + getWeight());
        fout.println("Weight: " + getWeight());

        System.out.println("Am i ill - " + (isIll() ? "Yes" : "No"));
        fout.println("Am i ill - " + (isIll() ? "Yes" : "No"));
        System.out.println("Full Properties END: -------------------");
        fout.println("Full Properties END: -------------------");
        fout.flush();
    }

    public void dispose() {
        fout.close();
    }
}
