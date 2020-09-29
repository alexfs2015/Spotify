package defpackage;

/* renamed from: vjm reason: default package */
public final class vjm implements wig<vjl> {
    private final wzi<vjk> a;

    private vjm(wzi<vjk> wzi) {
        this.a = wzi;
    }

    public static vjl a(Object obj) {
        return new vjl((vjk) obj);
    }

    public static vjm a(wzi<vjk> wzi) {
        return new vjm(wzi);
    }

    public final /* synthetic */ Object get() {
        return new vjl((vjk) this.a.get());
    }
}
