public class CatMain {
    public static void main(String[] args) throws Exception {
        Cat Simba = new Cat(5.5f, "Scottish", "Simba", 4, "Grey");

        Simba.myMood("soo happy xD");
        Simba.makeSound();
        Simba.doNotSleepAt3AM();
        Simba.sleeping(2);
        Simba.watchInTheWindow();
        Simba.eat("Fish");
        Simba.printAllCharacteristics();
        Simba.dispose();
    }
}
