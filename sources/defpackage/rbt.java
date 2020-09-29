package defpackage;

/* renamed from: rbt reason: default package */
public final class rbt implements wig<rbs> {
    private final wzi<rgs> a;

    private rbt(wzi<rgs> wzi) {
        this.a = wzi;
    }

    public static rbt a(wzi<rgs> wzi) {
        return new rbt(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rbs((rgs) this.a.get());
    }
}
