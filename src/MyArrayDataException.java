public class MyArrayDataException extends Exception {
     int i, j;

    public MyArrayDataException(String message, int i, int j) {
        super(message);
        this.i = i;
        this.j = j;
    }

     public int getI() {
        return i;
    }

     public int getJ() {
        return j;
    }
}
