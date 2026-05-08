import java.util.Collections;

public class Main {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        // Tournament
        Tournament<Athlete> tournament =
                new Tournament<>();

        // Athletes
        Athlete a1 = new Athlete("John", 90);
        Athlete a2 = new Athlete("Mark", 75);
        Athlete a3 = new Athlete("Alex", 90);

        // Add trophies
        a1.addTrophy("Gold Medal");
        a2.addTrophy("Silver Medal");

        // Add participants
        tournament.addParticipant(a1);
        tournament.addParticipant(a2);
        tournament.addParticipant(a3);

        // Before sorting
        System.out.println("=== Before Sorting ===");
        tournament.showAll();

        // Sort
        Collections.sort(tournament.getParticipants());

        // After sorting
        System.out.println("\n=== After Sorting ===");
        tournament.showAll();

        // Clone
        Athlete cloneAthlete = (Athlete) a1.clone();

        cloneAthlete.addTrophy("Champion Trophy");

        System.out.println("\n=== Original Athlete ===");
        System.out.println(a1);

        System.out.println("\n=== Cloned Athlete ===");
        System.out.println(cloneAthlete);

        // Default method
        System.out.println("\n=== Default Method ===");
        a1.reportStatus();

        // Static method
        System.out.println("\n=== Static Method ===");
        System.out.println("95 valid? "
                + Competitor.isValidScore(95));

        System.out.println("150 valid? "
                + Competitor.isValidScore(150));

        // playMatch
        System.out.println("\n=== playMatch ===");
        a1.playMatch();
    }
}