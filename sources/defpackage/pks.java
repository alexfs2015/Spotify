package defpackage;

/* renamed from: pks reason: default package */
public final class pks implements wig<pkr> {
    private final wzi<Boolean> a;
    private final wzi<pkt> b;

    private pks(wzi<Boolean> wzi, wzi<pkt> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pks a(wzi<Boolean> wzi, wzi<pkt> wzi2) {
        return new pks(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new pkr(((Boolean) this.a.get()).booleanValue(), (pkt) this.b.get());
    }
}
