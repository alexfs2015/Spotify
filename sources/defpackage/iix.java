package defpackage;

/* renamed from: iix reason: default package */
public final class iix implements wig<iiw> {
    private final wzi<hzu> a;
    private final wzi<rwj> b;

    private iix(wzi<hzu> wzi, wzi<rwj> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static iix a(wzi<hzu> wzi, wzi<rwj> wzi2) {
        return new iix(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new iiw((hzu) this.a.get(), (rwj) this.b.get());
    }
}
