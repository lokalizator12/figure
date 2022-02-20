package Figure;

public abstract class Figure {
    private int a, b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Figure(int size) {
        this.a = size;
        this.b = size;
    }

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract void square();

}
