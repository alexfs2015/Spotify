package defpackage;

/* renamed from: myg reason: default package */
public final class myg implements wig<Boolean> {
    private final wzi<fqn> a;
    private final wzi<lap> b;

    private myg(wzi<fqn> wzi, wzi<lap> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static myg a(wzi<fqn> wzi, wzi<lap> wzi2) {
        return new myg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(((lap) this.b.get()).a((fqn) this.a.get()));
    }
}
