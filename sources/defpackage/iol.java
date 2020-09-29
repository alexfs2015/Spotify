package defpackage;

/* renamed from: iol reason: default package */
public final class iol implements wig<iok> {
    private final wzi<inr> a;
    private final wzi<ioi> b;

    private iol(wzi<inr> wzi, wzi<ioi> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static iol a(wzi<inr> wzi, wzi<ioi> wzi2) {
        return new iol(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new iok((inr) this.a.get(), (ioi) this.b.get());
    }
}
