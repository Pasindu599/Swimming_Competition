import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of swimmers: ");
        int noSwimmers = scan.nextInt();

        Competition competition = new Competition(noSwimmers);
        competition.joinSwimmers();
        System.out.println(competition);

        
        
        competition.getSwimmers().get(0).checkScoreBoard();
        competition.getSwimmers().get(0).swim();
        


    }
}