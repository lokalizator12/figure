package Figure;

public final class Rect extends Figure {
    public Rect(int size) {
        super(size);
    }

    public Rect(int a, int b) {
        super(a, b);
    }

    @Override
    public void square() {
        System.out.println(getA() * getB());
    }
}
