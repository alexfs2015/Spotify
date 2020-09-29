package defpackage;

/* renamed from: wrt reason: default package */
public class wrt implements wsl {
    wrf c_ = wrf.a;

    protected wrt() {
    }

    public final void a(wrf wrf) {
        if (wrf != null) {
            this.c_ = wrf;
            return;
        }
        throw new NullPointerException("decoderResult");
    }

    public final wrf b() {
        return this.c_;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wrt)) {
            return false;
        }
        return this.c_.equals(((wrt) obj).c_);
    }

    public int hashCode() {
        return this.c_.hashCode() + 31;
    }
}
