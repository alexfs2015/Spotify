package defpackage;

/* renamed from: kto reason: default package */
public final class kto implements wig<ktn> {
    private final wzi<hgy> a;
    private final wzi<gix> b;

    private kto(wzi<hgy> wzi, wzi<gix> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static kto a(wzi<hgy> wzi, wzi<gix> wzi2) {
        return new kto(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new ktn((hgy) this.a.get(), (gix) this.b.get());
    }
}
