package defpackage;

/* renamed from: sjd reason: default package */
public final class sjd implements vua<sjc> {
    private final wlc<skb> a;

    private sjd(wlc<skb> wlc) {
        this.a = wlc;
    }

    public static sjd a(wlc<skb> wlc) {
        return new sjd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new sjc((skb) this.a.get());
    }
}
