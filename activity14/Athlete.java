import java.util.ArrayList;

public class Athlete implements Competitor,
        Comparable<Athlete>,
        Cloneable {

    private String name;
    private int score;
    private ArrayList<String> trophies;

    public Athlete(String name, int score) {
        this.name = name;
        this.score = score;
        trophies = new ArrayList<>();
    }

    public void addTrophy(String trophy) {
        trophies.add(trophy);
    }

    @Override
    public void playMatch() {
        System.out.println(name + " is playing a match...");
    }

    @Override
    public int compareTo(Athlete other) {

        if (this.score != other.score) {
            return other.score - this.score;
        }

        return this.name.compareTo(other.name);
    }

    // Deep copy clone
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Athlete copy = (Athlete) super.clone();

        copy.trophies = new ArrayList<>(trophies);

        return copy;
    }

    @Override
    public String toString() {
        return name +
                " (" + score + ")" +
                " Trophies: " + trophies;
    }
}