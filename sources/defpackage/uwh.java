package defpackage;

/* renamed from: uwh reason: default package */
public final class uwh implements wig<Boolean> {
    private final wzi<fqn> a;

    private uwh(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static uwh a(wzi<fqn> wzi) {
        return new uwh(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(uvx.a((fqn) this.a.get()));
    }
}
