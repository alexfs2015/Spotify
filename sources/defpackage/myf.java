package defpackage;

/* renamed from: myf reason: default package */
public final class myf implements wig<Boolean> {
    private final wzi<fqn> a;

    private myf(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static myf a(wzi<fqn> wzi) {
        return new myf(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jus.b((fqn) this.a.get()));
    }
}
