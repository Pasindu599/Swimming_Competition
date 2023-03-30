public class Judger{
     private String name ;
    private String id ; 
    private static int countJudges = 0 ; 
    public Judger(String name){
        countJudges ++;
        this.name = name;
        this.id = "JD" + countJudges ;
    }
    // behaviors of judger
    public void blow(){
        String blow = this.name + " is blowing the whistle.";
        System.out.println(blow);
    }
    public void checkScoreBoard(){
        String score = this.name + " checked the score board.";
        System.out.println(score);
    }
    // getter of name
    public String getName() {
        return name;
    }
    // setter of name
    public void setName(String name) {
        this.name = name;
    }
    // getter of id
    public String getId() {
        return id;
    }
    // setter of id
    public void setId(String id) {
        this.id = id;
    }

}
