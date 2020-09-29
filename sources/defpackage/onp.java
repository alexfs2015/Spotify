package defpackage;

/* renamed from: onp reason: default package */
public final class onp implements wig<ono> {
    private final wzi<a> a;

    private onp(wzi<a> wzi) {
        this.a = wzi;
    }

    public static onp a(wzi<a> wzi) {
        return new onp(wzi);
    }

    public final /* synthetic */ Object get() {
        return new ono((a) this.a.get());
    }
}
