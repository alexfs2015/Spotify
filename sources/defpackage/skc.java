package defpackage;

/* renamed from: skc reason: default package */
public final class skc implements vua<skb> {
    private final wlc<sjv> a;

    private skc(wlc<sjv> wlc) {
        this.a = wlc;
    }

    public static skc a(wlc<sjv> wlc) {
        return new skc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new skb((sjv) this.a.get());
    }
}
