package defpackage;

import java.util.Set;

/* renamed from: sjz reason: default package */
public final class sjz implements wig<sjy> {
    private final wzi<skb> a;
    private final wzi<sjo> b;
    private final wzi<sjr> c;
    private final wzi<Set<skc>> d;

    private sjz(wzi<skb> wzi, wzi<sjo> wzi2, wzi<sjr> wzi3, wzi<Set<skc>> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static sjz a(wzi<skb> wzi, wzi<sjo> wzi2, wzi<sjr> wzi3, wzi<Set<skc>> wzi4) {
        return new sjz(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new sjy(this.a, this.b, this.c, this.d);
    }
}
