package defpackage;

/* renamed from: tnb reason: default package */
public final class tnb implements wig<tna> {
    private final wzi<gvm> a;

    private tnb(wzi<gvm> wzi) {
        this.a = wzi;
    }

    public static tnb a(wzi<gvm> wzi) {
        return new tnb(wzi);
    }

    public final /* synthetic */ Object get() {
        return new tna((gvm) this.a.get());
    }
}
