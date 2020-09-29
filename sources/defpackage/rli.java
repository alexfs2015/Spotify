package defpackage;

/* renamed from: rli reason: default package */
public final class rli implements wig<rlh> {
    private final wzi<rkn> a;

    private rli(wzi<rkn> wzi) {
        this.a = wzi;
    }

    public static rli a(wzi<rkn> wzi) {
        return new rli(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rlh((rkn) this.a.get());
    }
}
