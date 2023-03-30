import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    System.out.print("Enter number of swimmers: ");
    int noSwimmers = scan.nextInt();
    System.out.print("Enter number of spectators: ");
    int noSpectators = scan.nextInt();
    System.out.print("Enter number of judgers: ");
    int noJudgers = scan.nextInt();
    System.out.print("Enter number of supporting staff members: ");
    int noSupportingStaffMembers = scan.nextInt();
    
    Competition competition = new Competition(noSwimmers, noSpectators, 
    noJudgers,noSupportingStaffMembers );
    competition.joinSwimmers();// collect data of swimmwers
    competition.joinSpectators();// collect data of spectators
    competition.joinJudges();// collect data of judgers
    competition.joinStaffMembers();// collect data of staff members
    
    // Examples get swimmer name and id
    System.out.println("Name is " + competition.getSwimmers().get(0).getName());
    System.out.println("Id is " + competition.getSwimmers().get(0).getId());
    // call swimmer behaviors
    competition.getSwimmers().get(0).checkScoreBoard();
    competition.getSwimmers().get(0).swim();
    // call spectator behaviors
    competition.getSpectators().get(0).checkScoreBoard();
    // call judger behaviors
    competition.getJudgers().get(0).blow();
    competition.getJudgers().get(0).checkScoreBoard();
    // call supportingStaffMember behaviors
    competition.getSupportingStaffMembers().get(0).checkScoreBoard();

    }
}
