package defpackage;

/* renamed from: twq reason: default package */
public final class twq implements wig<twp> {
    private final wzi<twu> a;
    private final wzi<twz> b;

    private twq(wzi<twu> wzi, wzi<twz> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static twq a(wzi<twu> wzi, wzi<twz> wzi2) {
        return new twq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new twp((twu) this.a.get(), (twz) this.b.get());
    }
}
