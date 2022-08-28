public class FoodAddiction {
    private int foodTimesPerDay;
    private double foodInGrams;

    FoodAddiction() {
        foodTimesPerDay = 3;
        foodInGrams = 40.0f;
    }

    public void setFoodTimes(int foodTime) {
        foodTimesPerDay = foodTime;
    }

    public void setFoodGrams(int foodGrams) {
        foodInGrams = foodGrams;
    }

    public int getFoodTimes() {
        return foodTimesPerDay;
    }

    public double getFoodGrams() {
        return foodInGrams;
    }

    public void printFood() {
        System.out.println("How many times needs to eat ? : " + foodTimesPerDay);
        System.out.println("Food in grams for cat for 1 bowl : " + foodInGrams);
    }
}
