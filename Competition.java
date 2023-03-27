import java.util.ArrayList;
import java.util.List;

public class Competition {
    List<Swimmer> swimmers = new ArrayList<>();
    private int noSwimmers;

    public Competition(int noSwimmers){
        this.noSwimmers = noSwimmers;
        

    }

    
    @Override
    public String toString() {
        return "Competition [swimmers=" + swimmers + ", noSwimmers=" + noSwimmers + "]";
    }


    public List<Swimmer> getSwimmers() {
        return swimmers;
    }
    public void setSwimmers(List<Swimmer> swimmers) {
        this.swimmers = swimmers;
    }
    public void joinSwimmers(){
        for(int id = 1 ; id <= this.noSwimmers ; id++){
            Swimmer s= new Swimmer("Swimmer" + id, id );
            getSwimmers().add(s);
        }
    }
    
}
