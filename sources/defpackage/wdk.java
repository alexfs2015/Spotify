package defpackage;

/* renamed from: wdk reason: default package */
public class wdk extends wdn implements wdw {
    private final vyv b;

    public wdk(vyv vyv) {
        if (vyv != null) {
            this.b = vyv;
            return;
        }
        throw new NullPointerException("content");
    }

    public final vyv a() {
        return this.b;
    }

    public final int z() {
        return this.b.z();
    }

    /* renamed from: a */
    public wdw b(Object obj) {
        this.b.b(obj);
        return this;
    }

    public final boolean B() {
        return this.b.B();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wjn.a((Object) this));
        sb.append("(data: ");
        sb.append(this.b);
        sb.append(", decoderResult: ");
        sb.append(this.c_);
        sb.append(')');
        return sb.toString();
    }
}
