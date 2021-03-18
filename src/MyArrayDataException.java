public class MyArrayDataException extends NumberFormatException{

    private int i, j;

    public MyArrayDataException(String s, int i, int j) {
        super(s);
        this.i = i;
        this.j = j;
    }

    public String getIndex(){
        return "[" + i + ", " + j + "]";
    }
}
