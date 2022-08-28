public class Breed {
    private String breed;
    private String fur;
    private String nature;

    Breed(String breed) {
        this.breed = breed;
        this.fur = "normal";
        this.nature = "normal";
    }

    public void printBreed() {
        System.out.println("Breed is : " + breed);
        System.out.println("Fur is : " + fur);
        System.out.println("Nature is : " + nature);

    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getBreed() {
        return breed;
    }

    public String getFur() {
        return fur;
    }

    public String getNature() {
        return nature;
    }
}
