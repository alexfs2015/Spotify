package defpackage;

/* renamed from: xcu reason: default package */
public abstract class xcu implements xdf {
    private final xdf a;

    public xcu(xdf xdf) {
        if (xdf != null) {
            this.a = xdf;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final xdh a() {
        return this.a.a();
    }

    public void a_(xcq xcq, long j) {
        this.a.a_(xcq, j);
    }

    public void close() {
        this.a.close();
    }

    public void flush() {
        this.a.flush();
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
