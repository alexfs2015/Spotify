package defpackage;

/* renamed from: scg reason: default package */
public final class scg implements wig<scf> {
    private final wzi<rwj> a;

    private scg(wzi<rwj> wzi) {
        this.a = wzi;
    }

    public static scg a(wzi<rwj> wzi) {
        return new scg(wzi);
    }

    public final /* synthetic */ Object get() {
        return new scf((rwj) this.a.get());
    }
}
