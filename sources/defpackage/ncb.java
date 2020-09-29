package defpackage;

/* renamed from: ncb reason: default package */
public final class ncb implements wig<Boolean> {
    private final wzi<fqn> a;

    private ncb(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static ncb a(wzi<fqn> wzi) {
        return new ncb(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jus.b((fqn) this.a.get()));
    }
}
