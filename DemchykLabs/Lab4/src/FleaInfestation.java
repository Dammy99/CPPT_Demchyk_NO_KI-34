public class FleaInfestation {
    private boolean isFlea;
    private int percentageOfFlea;

    FleaInfestation() {
        isFlea = false;
        percentageOfFlea = 50;
    }

    public void printFlea() {
        System.out.println("Has flea ? : " + isFlea);
        System.out.println("Possibility to get flea : " + percentageOfFlea);
    }

    public boolean getFlea() {
        return isFlea;
    }

    public int getPercentage() {
        return percentageOfFlea;
    }

    public void setFlea(boolean fle) {
        isFlea = fle;
    }

    public void setPercentageOfFlea(int percentage) {
        percentageOfFlea = percentage;
    }
}
