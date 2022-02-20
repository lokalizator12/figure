package Main;

import Figure.Rect;
import Figure.Triangle;

public class Main {
    public static void main(String[] args) {
        Rect rect1 = new Rect(5, 10);
        Triangle tria1 = new Triangle(10);
        rect1.square();
        tria1.square();
    }
}
