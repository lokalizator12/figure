package Figure;

public final class Triangle extends Figure {
    private int c;

    public Triangle(int size) {
        super(size);
        this.c = size;
    }

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public void square() {
        int p = (getA() + getB() + c) / 2;
        int s = p * (p - getA()) * (p - getB()) * (p - c);
        System.out.println(Math.sqrt(s));
    }
}
