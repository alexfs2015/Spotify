package defpackage;

/* renamed from: onn reason: default package */
public final class onn implements wig<onm> {
    private final wzi<ono> a;
    private final wzi<a> b;

    private onn(wzi<ono> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static onn a(wzi<ono> wzi, wzi<a> wzi2) {
        return new onn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new onm((ono) this.a.get(), (a) this.b.get());
    }
}
