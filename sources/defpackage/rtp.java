package defpackage;

/* renamed from: rtp reason: default package */
public final class rtp implements wig<rto> {
    private final wzi<jux> a;
    private final wzi<a> b;

    private rtp(wzi<jux> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rtp a(wzi<jux> wzi, wzi<a> wzi2) {
        return new rtp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rto((jux) this.a.get(), (a) this.b.get());
    }
}
