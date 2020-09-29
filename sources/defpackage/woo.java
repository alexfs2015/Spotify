package defpackage;

/* renamed from: woo reason: default package */
public abstract class woo implements woz {
    private final woz a;

    public woo(woz woz) {
        if (woz != null) {
            this.a = woz;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void a_(wok wok, long j) {
        this.a.a_(wok, j);
    }

    public void flush() {
        this.a.flush();
    }

    public final wpb a() {
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
