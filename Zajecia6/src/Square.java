
public class Square extends Shape{
    int sciana;


    public Square(int x, int y , int sciana) {
        super(x, y);
        this.sciana=sciana;
    }

    @Override
    public int pole() {
        return 0;
    }
    @Override
    public int jakasMetoda(){
        return 1;
    }


}
