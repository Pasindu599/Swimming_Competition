public class Swimmer{
     private String name;
     private String id ;
     private static int countSwimmers = 0 ; // get count of swimmers
     public Swimmer(String name){
         countSwimmers ++;
         this.name = name ;
         this.id = "SW" + countSwimmers ;
     }
     // behaviors of swimmer
     public void swim(){
         String str = this.name + " is swimming.";
         System.out.println(str);
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
