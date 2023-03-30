import java.util.ArrayList;
import java.util.List;

public class Competition {
     private int noSwimmers; //number of swimmers
    private int noSpectators;//number of spectators
    private int noJudgers;//number of judgers
    private int noSupportingStaffMembers;//number of staff members
    private List<Swimmer> swimmers = new ArrayList<>(); //list of swimmers
    private List<Spectator> spectators = new ArrayList<>();//list of spectators
    private List<Judger> judgers = new ArrayList<>();//list of judgers
    private List<SupportingStaffMember> supportingStaffMembers = new ArrayList<>();//list of staff members
    
    public Competition(int noSwimmers ,int noSpectators,int noJudgers,int noSupportingStaffMembers){
        this.noSwimmers = noSwimmers;
        this.noSpectators = noSpectators;
        this.noJudgers = noJudgers;
        this.noSupportingStaffMembers = noSupportingStaffMembers;
        
    
    
    }
    //==================== swimmer part =========================
    // gettter and setter 
    public List<Swimmer> getSwimmers() {
        return swimmers;
    }
    public void setSwimmers(List<Swimmer> swimmers) {
        this.swimmers = swimmers;
    }
    // create objects and add to the arraylist.
    public void joinSwimmers(){
        for(int indexSW = 1 ; indexSW <= this.noSwimmers ; indexSW++){
        Swimmer player= new Swimmer("Swimmer" + indexSW );
        getSwimmers().add(player);
    }
    }
    //================ judger part===================
    // gettter and setter 
    public List<Judger> getJudgers() {
        return judgers;
    }
    public void setJudgers(List<Judger> judges) {
        this.judgers = judges;
    }
    // create objects and add to the arraylist.
    public void joinJudges(){
        for(int indexJD = 1 ; indexJD <= this.noJudgers ; indexJD++){
        Judger judger = new Judger("Judge" + indexJD);
        getJudgers().add(judger);
    }
    }
    //=============== spectator part=================== 
    
    // gettter and setter 
    public List<Spectator> getSpectators() {
        return spectators;
    }
    public void setSpectators(List<Spectator> spectators) {
        this.spectators = spectators;
    }
    // create objects and add to the arraylist.
    public void joinSpectators(){
        for(int indexSP = 1 ; indexSP <= this.noSpectators ; indexSP++){
        Spectator spectator = new Spectator("Spectator" + indexSP); 
        getSpectators().add(spectator);
    }
    }
    //============== supporting staff part==============================
    // gettter and setter 
    public List<SupportingStaffMember> getSupportingStaffMembers() {
        return supportingStaffMembers;
    }
    public void setSupportingStaffMembers(List<SupportingStaffMember> supportingStaffMembers) {
        this.supportingStaffMembers = supportingStaffMembers;
    }
    // create objects and add to the arraylist.
    public void joinStaffMembers(){
        for(int indexSS = 1 ; indexSS <= this.noSupportingStaffMembers ; indexSS++){
        SupportingStaffMember member= new SupportingStaffMember("SuppotingStaffMember" + indexSS);
        getSupportingStaffMembers().add(member);
    }
    }
    
}
