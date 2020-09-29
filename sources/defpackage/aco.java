package defpackage;

/* renamed from: aco reason: default package */
public final class aco {
    public final float a;
    public final float b;

    public aco() {
        this(1.0f, 1.0f);
    }

    public aco(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("x");
        sb.append(this.b);
        return sb.toString();
    }
}
