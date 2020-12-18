package leverX.homework.homework1;

public class Aviary {
    private int number;
    private boolean isClean;

    public Aviary(){
        //aviary number is four-digit
        number = (int) (Math.random() * 8999 + 1000);
        //possibility of clean aviary ~50%
        isClean = Math.random() < 0.5;
    };

    public int getNumber() {
        return number;
    }
    public boolean isClean() {
        return isClean;
    }
    public void setClean(boolean clean) {
        isClean = clean;
    }

}
