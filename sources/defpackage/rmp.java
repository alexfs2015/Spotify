package defpackage;

/* renamed from: rmp reason: default package */
public final class rmp implements wig<rmo> {
    private final wzi<a> a;
    private final wzi<heg> b;

    private rmp(wzi<a> wzi, wzi<heg> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rmp a(wzi<a> wzi, wzi<heg> wzi2) {
        return new rmp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rmo((a) this.a.get(), (heg) this.b.get());
    }
}
