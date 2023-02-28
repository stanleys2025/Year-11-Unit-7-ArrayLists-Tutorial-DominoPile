public class Domino {
    private int top;
    private int bottom;

    public Domino(){
        this.top = 0;
        this.bottom = 0;
    }

    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public String toString(){
        return(top + "/" + bottom);
    }

    public void flip(){
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public void settle(){
        if(top > bottom){
            flip();
        }
    }

    public int compareTo(Domino other){
        if(other.getTop() > other.getBottom()){ // makes sure that the other domino always has the smaller one on top
            int temp = other.getTop();
            other.setTop(other.getBottom());
            other.setBottom(temp);
        }
        if(this.top < other.getTop()){
            return -1;
        }
        if(this.top ==  other.getTop()){
            return 0;
        }
        return 1;
    }

    public int compareToWeight(Domino other){
        int sumThis = this.top + this.bottom;
        int sumOther = other.getTop() + other.getBottom();
        if(sumThis < sumOther){
            return -1;
        }
        if(sumThis == sumOther){
            return 0;
        }
        return 1;
    }

    public boolean canConnect(Domino other){
        if(this.top == other.getTop() || this.top == other.getBottom() || this.bottom == other.getTop() || this.bottom == other.getBottom()){
            return true;
        }
        return false;
    }

}
