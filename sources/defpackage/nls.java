package defpackage;

/* renamed from: nls reason: default package */
public final class nls implements wig<Boolean> {
    private final wzi<fqn> a;

    private nls(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static nls a(wzi<fqn> wzi) {
        return new nls(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(CC.a((fqn) this.a.get()));
    }
}
