import mypack.*;

public class use_package {
    public static void main(String[] args) {
        Message m = new Message();
        m.show();
    }
}


public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        c.area();

        Rectangle r = new Rectangle(4, 6);
        r.area();
    }
}