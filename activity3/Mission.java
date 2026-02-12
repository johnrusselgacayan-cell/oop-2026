import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mission {

    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty;

    public Mission() {

        String[] targets = {
            "Retrieve stolen data",
            "Infiltrate enemy base",
            "Rescue hostage",
            "Disable security system",
            "Protect VIP"
        };

        int index = (int)(Math.random() * targets.length);
        missionTarget = targets[index];

        difficulty = (int)(Math.random() * 10) + 1;

        int daysToAdd = (int)(Math.random() * 24) + 7;
        missionDeadline = LocalDate.now().plusDays(daysToAdd);
    }

    public String getMissionTarget() {
        return missionTarget;
    }

    public LocalDate getMissionDeadline() {
        return missionDeadline;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void displayMissionBriefing() {
        DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("MMMM dd, yyyy");

        System.out.println("*** MISSION BRIEFING ***");
        System.out.println("Target: " + missionTarget);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Deadline: " + missionDeadline.format(formatter));
    }
}
