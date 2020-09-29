package defpackage;

/* renamed from: rjy reason: default package */
public final class rjy implements wig<rjx> {
    private final wzi<rji> a;

    private rjy(wzi<rji> wzi) {
        this.a = wzi;
    }

    public static rjy a(wzi<rji> wzi) {
        return new rjy(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rjx((rji) this.a.get());
    }
}
