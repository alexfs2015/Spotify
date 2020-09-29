package defpackage;

/* renamed from: nmt reason: default package */
public final class nmt implements wig<nms> {
    private final wzi<xii<Boolean>> a;
    private final wzi<xii<Boolean>> b;

    private nmt(wzi<xii<Boolean>> wzi, wzi<xii<Boolean>> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static nms a(xii<Boolean> xii, xii<Boolean> xii2) {
        return new nms(xii, xii2);
    }

    public static nmt a(wzi<xii<Boolean>> wzi, wzi<xii<Boolean>> wzi2) {
        return new nmt(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new nms((xii) this.a.get(), (xii) this.b.get());
    }
}
