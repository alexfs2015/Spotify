package defpackage;

/* renamed from: xcv reason: default package */
public abstract class xcv implements xdg {
    protected final xdg a;

    public xcv(xdg xdg) {
        if (xdg != null) {
            this.a = xdg;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public long a(xcq xcq, long j) {
        return this.a.a(xcq, j);
    }

    public final xdh a() {
        return this.a.a();
    }

    public void close() {
        this.a.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.a.toString());
        sb.append(")");
        return sb.toString();
    }
}
