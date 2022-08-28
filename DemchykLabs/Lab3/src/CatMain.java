public class CatMain {
    public static void main(String[] args) throws Exception {
        Cat Simba = new Cat(5.5f, "Scottish", "Simba", 4, "Grey");

        // in main class Cat.java not in
        Simba.myMood("soo happy xD");
        Simba.makeSound();
        Simba.doNotSleepAt3AM();
        Simba.sleeping(2);
        Simba.watchInTheWindow();
        Simba.eat("Fish");

        // in 3 types of classes
        Simba.setFoodGram(34);
        Simba.setFlea(true);
        Simba.setFur("thick");
        Simba.setNature("calm");
        Simba.setFoodTime(2);
        // print from all classes
        Simba.printAllCharacteristics();
        Simba.dispose();

    }
}
