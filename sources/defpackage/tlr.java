package defpackage;

/* renamed from: tlr reason: default package */
public final class tlr {
    private final tlp a;
    private boolean b;

    public tlr(tlp tlp) {
        this.a = tlp;
    }

    public final boolean a() {
        if (this.b) {
            return false;
        }
        this.b = true;
        return this.a.a;
    }
}
