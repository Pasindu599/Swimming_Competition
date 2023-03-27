public class Swimmer{
    private String name;
    private int id ;
    
    public Swimmer(String name , int id){
        this.name = name ;
        this.id = id;
    }
    
    

    public void swim(){
        String str = "Swimmer " + this.id + " is swimming.";
        System.out.println(str);
    }

    public void checkScoreBoard(){
        String score = "Swimmer " + this.id + " checked the score board.";
        System.out.println(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Swimmer [name=" + name + ", id=" + id + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}