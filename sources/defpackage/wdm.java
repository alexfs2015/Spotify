package defpackage;

/* renamed from: wdm reason: default package */
public abstract class wdm extends wdn implements wec {
    private wen b;
    private final wea c;

    protected wdm(wen wen, boolean z, boolean z2) {
        this(wen, z2 ? new wdi(z) : new wdl(z));
    }

    private wdm(wen wen, wea wea) {
        this.b = (wen) wjk.a(wen, "version");
        this.c = (wea) wjk.a(wea, "headers");
    }

    public final wea d() {
        return this.c;
    }

    public final wen e() {
        return this.b;
    }

    public int hashCode() {
        return ((((this.c.hashCode() + 31) * 31) + this.b.hashCode()) * 31) + super.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wdm)) {
            return false;
        }
        wdm wdm = (wdm) obj;
        if (!this.c.equals(wdm.c) || !this.b.equals(wdm.b) || !super.equals(obj)) {
            return false;
        }
        return true;
    }
}
