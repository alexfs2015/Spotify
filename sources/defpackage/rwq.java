package defpackage;

/* renamed from: rwq reason: default package */
public final class rwq implements wig<rwj> {
    private final wzi<rwl> a;

    private rwq(wzi<rwl> wzi) {
        this.a = wzi;
    }

    public static rwq a(wzi<rwl> wzi) {
        return new rwq(wzi);
    }

    public final /* synthetic */ Object get() {
        return (rwj) wil.a(((rwl) this.a.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
