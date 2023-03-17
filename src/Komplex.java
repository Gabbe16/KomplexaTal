import java.util.Objects;

public class Komplex {
    int a;
    int b;


    public Komplex(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;

    }

    public Komplex add(Komplex b) {
        int ca = (this.a+b.a);
        int cb = (this.b+b.b);
        return new Komplex(ca, cb);
    }

    public Komplex multiply(Komplex b) {
        return b;
    }

    public double arg() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Komplex komplex = (Komplex) o;
        return a == komplex.a && b == komplex.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "" +
                "" + a +
                "+" + b + 'i';
    }
}
