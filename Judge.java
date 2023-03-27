public class Judge{
    private String name ;
    private int id ; 
    private static int numberOfJudges = 0;
    
    public Judge(String name , int id){
        numberOfJudges ++;
        this.name = name;
        this.id = numberOfJudges ;
    }
    public void blow(){
        String blow = "Judge " + this.id + "blew the whistle.";
        System.out.println(blow);
    }
    public void checkScoreBoard(){
        String score = "Judge " + this.id + " checked the score board.";
        System.out.println(score);
    }

}