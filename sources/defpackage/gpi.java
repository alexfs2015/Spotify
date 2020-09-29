package defpackage;

/* renamed from: gpi reason: default package */
public final class gpi implements wig<gph> {
    private final wzi<gpn> a;
    private final wzi<gpv> b;

    private gpi(wzi<gpn> wzi, wzi<gpv> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static gpi a(wzi<gpn> wzi, wzi<gpv> wzi2) {
        return new gpi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new gph((gpn) this.a.get(), (gpv) this.b.get());
    }
}
