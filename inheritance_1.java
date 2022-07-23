class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printme(){
        System.out.println("it is a constructor");
    }
}

class inherit extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance_1 {
    public static void main(String[] args) {
        base b = new base();
        b.setX(6);
        System.out.println(b.getX());
    }
}