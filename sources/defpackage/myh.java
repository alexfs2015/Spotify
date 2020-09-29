package defpackage;

/* renamed from: myh reason: default package */
public final class myh implements wig<Boolean> {
    private final wzi<fqn> a;

    private myh(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static myh a(wzi<fqn> wzi) {
        return new myh(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jus.a((fqn) this.a.get()));
    }
}
