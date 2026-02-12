import java.time.LocalDateTime;

public class SecretAgent {
    private String agentId = "";
    private String codename;
    private int clearanceLevel;
    private boolean onMission;
    private LocalDateTime lastMissionCompletionTime;

    public SecretAgent(){}

    public SecretAgent(String agentId, String codename, int clearanceLevel){
        this.agentId = agentId;
        this.codename = codename;
    
        onMission = false;
        lastMissionCompletionTime = null;
    }

    public String getAgentId(String agentID){
        return agentId;
    }

    public String getCodename(String codename){
        return codename;
    }

    public int getClearanceLevel(int clearanceLevel){
        return clearanceLevel;
    }

    public boolean isOnMission(){
        return true;
    }

    public LocalDateTime getLastMissionCompletionTime(){
        return lastMissionCompletionTime;
    }

    public void setCodename(String newCodename){
        this.codename = newCodename;
    }

    public void setClearanceLevel(int level){
        this.clearanceLevel = level;
        if (level >= 1 && level <= 5) {
        } else {
            System.out.println("Invalid clearance level.");
        }

    }

    public void startMission() {
        onMission = true;
    }

    public void completeMission() {
        onMission = false;
        lastMissionCompletionTime = LocalDateTime.now();
    }

    
}
