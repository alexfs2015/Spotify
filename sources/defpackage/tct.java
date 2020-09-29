package defpackage;

/* renamed from: tct reason: default package */
public final class tct implements wig<tcs> {
    private final wzi<tda> a;
    private final wzi<fqn> b;

    private tct(wzi<tda> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tct a(wzi<tda> wzi, wzi<fqn> wzi2) {
        return new tct(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tcs((tda) this.a.get(), (fqn) this.b.get());
    }
}
