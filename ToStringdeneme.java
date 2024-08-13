package tostringdeneme;

public class ToStringdeneme {


    public static void main(String[] args)
    {
        ClosedShape s = new ClosedShape(1, 2);
        System.out.println(s.toString());
        
        s = new Rectangle(2, 3, 4, 5);
        System.out.println(s.toString());
        
        s = new Circle(2, 3, 4);
        System.out.println(s.toString());
        
        s = new ClosedShape();
        System.out.println(s.toString());
    }
}

