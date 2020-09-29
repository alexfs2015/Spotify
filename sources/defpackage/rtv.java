package defpackage;

/* renamed from: rtv reason: default package */
public final class rtv implements wig<rtu> {
    private final wzi<jwr> a;
    private final wzi<a> b;

    private rtv(wzi<jwr> wzi, wzi<a> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rtv a(wzi<jwr> wzi, wzi<a> wzi2) {
        return new rtv(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rtu((jwr) this.a.get(), (a) this.b.get());
    }
}
