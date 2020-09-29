package defpackage;

/* renamed from: gvg reason: default package */
public final class gvg implements wig<Boolean> {
    private final wzi<fqn> a;

    private gvg(wzi<fqn> wzi) {
        this.a = wzi;
    }

    public static gvg a(wzi<fqn> wzi) {
        return new gvg(wzi);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(jus.c((fqn) this.a.get()));
    }
}
