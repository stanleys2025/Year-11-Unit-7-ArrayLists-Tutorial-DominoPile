import java.util.ArrayList;
import java.util.Collections;

public class DominoPile {
    ArrayList<Domino> pile = new ArrayList<>();

    public DominoPile(){
        pile = new ArrayList<>();
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void setPile(ArrayList<Domino> pile) {
        this.pile = pile;
    }

    public void newStack6(){
        for(int i = 0; i < 7; i++){
            for(int j = i; j < 7; j++){
                pile.add(new Domino(i,j));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(pile);
    }


}
