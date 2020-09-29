package defpackage;

/* renamed from: wrs reason: default package */
public abstract class wrs extends wrt implements wsi {
    private wst b;
    private final wsg c;

    private wrs(wst wst, wsg wsg) {
        this.b = (wst) wxq.a(wst, "version");
        this.c = (wsg) wxq.a(wsg, "headers");
    }

    protected wrs(wst wst, boolean z, boolean z2) {
        this(wst, z2 ? new wro(z) : new wrr(z));
    }

    public final wsg d() {
        return this.c;
    }

    public final wst e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wrs)) {
            return false;
        }
        wrs wrs = (wrs) obj;
        return this.c.equals(wrs.c) && this.b.equals(wrs.b) && super.equals(obj);
    }

    public int hashCode() {
        return ((((this.c.hashCode() + 31) * 31) + this.b.hashCode()) * 31) + super.hashCode();
    }
}
