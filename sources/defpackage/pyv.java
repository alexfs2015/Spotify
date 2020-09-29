package defpackage;

/* renamed from: pyv reason: default package */
public final class pyv implements wig<pyu> {
    private final wzi<rwl> a;

    private pyv(wzi<rwl> wzi) {
        this.a = wzi;
    }

    public static pyv a(wzi<rwl> wzi) {
        return new pyv(wzi);
    }

    public final /* synthetic */ Object get() {
        return new pyu((rwl) this.a.get());
    }
}
