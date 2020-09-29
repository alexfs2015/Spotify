package defpackage;

/* renamed from: skg reason: default package */
public final class skg implements wig<skf> {
    private final wzi<skb> a;

    private skg(wzi<skb> wzi) {
        this.a = wzi;
    }

    public static skg a(wzi<skb> wzi) {
        return new skg(wzi);
    }

    public final /* synthetic */ Object get() {
        return new skf((skb) this.a.get());
    }
}
