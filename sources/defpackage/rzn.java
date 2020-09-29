package defpackage;

/* renamed from: rzn reason: default package */
public final class rzn implements wig<rzm> {
    private final wzi<Boolean> a;

    private rzn(wzi<Boolean> wzi) {
        this.a = wzi;
    }

    public static rzn a(wzi<Boolean> wzi) {
        return new rzn(wzi);
    }

    public final /* synthetic */ Object get() {
        return new rzm(this.a);
    }
}
