package defpackage;

/* renamed from: wdn reason: default package */
public class wdn implements wef {
    wcz c_ = wcz.a;

    protected wdn() {
    }

    public final wcz b() {
        return this.c_;
    }

    public final void a(wcz wcz) {
        if (wcz != null) {
            this.c_ = wcz;
            return;
        }
        throw new NullPointerException("decoderResult");
    }

    public int hashCode() {
        return this.c_.hashCode() + 31;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wdn)) {
            return false;
        }
        return this.c_.equals(((wdn) obj).c_);
    }
}
