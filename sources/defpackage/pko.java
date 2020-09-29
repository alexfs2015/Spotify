package defpackage;

/* renamed from: pko reason: default package */
public final class pko implements wig<Boolean> {
    private final wzi<fqn> a;

    private pko(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static pko a(wzi<fqn> wzi) {
        return new pko(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jus.c((fqn) this.a.get()));
    }
}
