package defpackage;

/* renamed from: ksl reason: default package */
public final class ksl implements wig<ksk> {
    private final wzi<ksb> a;
    private final wzi<kry> b;

    private ksl(wzi<ksb> wzi, wzi<kry> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static ksl a(wzi<ksb> wzi, wzi<kry> wzi2) {
        return new ksl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ksk((ksb) this.a.get(), (kry) this.b.get());
    }
}
