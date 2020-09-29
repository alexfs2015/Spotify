package defpackage;

/* renamed from: wop reason: default package */
public abstract class wop implements wpa {
    protected final wpa a;

    public wop(wpa wpa) {
        if (wpa != null) {
            this.a = wpa;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public long a(wok wok, long j) {
        return this.a.a(wok, j);
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
