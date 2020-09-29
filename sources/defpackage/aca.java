package defpackage;

/* renamed from: aca reason: default package */
public final class aca {
    public final float a;
    public final float b;

    public aca(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public aca() {
        this(1.0f, 1.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("x");
        sb.append(this.b);
        return sb.toString();
    }
}
