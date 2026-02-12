import java.time.format.DateTimeFormatter;

public class MissionControl {
    public static void main(String[] args) {
        
        SecretAgent agent = new SecretAgent("007", "James Bond", 5);

        System.out.println("*** AGENT STATUS (INITIAL) ***");
        System.out.println("Agent ID: " + agent.getAgentId("007"));
        System.out.println("Codename: " + agent.getCodename("James Bond"));
        System.out.println("Clearance Level: " + agent.getClearanceLevel(5));
        System.out.println("On Mission: " + agent.isOnMission());
        System.out.println();  
        
        Mission mission = new Mission();

        mission.displayMissionBriefing();

        if (agent.getClearanceLevel(5) >= mission.getDifficulty()) {
            agent.startMission();
            System.out.println("Agent " + agent.getAgentId("007") + " is cleared for mission.");
        } else {
            System.out.println("Agent " + agent.getAgentId("007") + "'s clearance is too low for this mission.");
            return;
        }

        System.out.println("\n*** AGENT STATUS (ON MISSION) ***");
        System.out.println("On Mission: " + agent.isOnMission());

        agent.completeMission();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm a");

        System.out.println("\n=== AGENT STATUS (FINAL) ===");
        System.out.println("On Mission: " + agent.isOnMission());
        System.out.println("Last Mission Completed: " +
        agent.getLastMissionCompletionTime().format(formatter));


    }

    
}
