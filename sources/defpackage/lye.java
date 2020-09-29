package defpackage;

/* renamed from: lye reason: default package */
public final class lye implements wig<lyd> {
    private final wzi<lyh> a;

    private lye(wzi<lyh> wzi) {
        this.a = wzi;
    }

    public static lye a(wzi<lyh> wzi) {
        return new lye(wzi);
    }

    public final /* synthetic */ Object get() {
        return new lyd((lyh) this.a.get());
    }
}
