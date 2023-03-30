class SupportingStaffMember {
   private String name ;
   private String id ;
   private static int countStaffMembers = 0 ; 


   public SupportingStaffMember(String name){
   countStaffMembers ++;
   this.name = name;
   this.id = "SS" + countStaffMembers ;
   }
   // behaviors of supporting staff member
   public void checkScoreBoard(){
   String score = this.name + " checked the score board.";
   System.out.println(score);
   }
   // getter of name
   public String getName() {
   return name;
   }
   //setter of name
   public void setName(String name) {
   this.name = name;
   }
   //getter of id
   public String getId() {
   return id;
   }
   //setter of id
   public void setId(String id) {
   this.id = id;
 }
}
