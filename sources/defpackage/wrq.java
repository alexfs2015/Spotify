package defpackage;

/* renamed from: wrq reason: default package */
public class wrq extends wrt implements wsc {
    private final wnb b;

    public wrq(wnb wnb) {
        if (wnb != null) {
            this.b = wnb;
            return;
        }
        throw new NullPointerException("content");
    }

    public final boolean B() {
        return this.b.B();
    }

    public final wnb a() {
        return this.b;
    }

    /* renamed from: a */
    public wsc b(Object obj) {
        this.b.b(obj);
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wxt.a((Object) this));
        sb.append("(data: ");
        sb.append(this.b);
        sb.append(", decoderResult: ");
        sb.append(this.c_);
        sb.append(')');
        return sb.toString();
    }

    public final int z() {
        return this.b.z();
    }
}
