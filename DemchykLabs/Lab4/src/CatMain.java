public class CatMain {
    public static void main(String[] args) throws Exception {
        ExperimentalCat Simba = new ExperimentalCat(5.5f, "Scottish", "Simba", 4, "Grey");

        Simba.doing();
        Simba.makeSound();
        Simba.sleeping(2);

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
