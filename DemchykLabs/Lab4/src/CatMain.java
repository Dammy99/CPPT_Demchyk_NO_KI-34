public class CatMain {
    public static void main(String[] args) throws Exception {
        ExperimentalCat Simba = new ExperimentalCat(5.5f, "Scottish", "Simba", 4, "Grey");

        Simba.doing();
        Simba.printAllCharacteristics();
        // Simba.myMood("soo happy xD");
        // Simba.makeSound();
        // Simba.doNotSleepAt3AM();
        // Simba.sleeping(2);
        // Simba.watchInTheWindow();
        // Simba.eat("Fish");
        // Simba.printAllCharacteristics();
        Simba.dispose();
    }
}
