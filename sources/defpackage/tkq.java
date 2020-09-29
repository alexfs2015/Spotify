package defpackage;

/* renamed from: tkq reason: default package */
public final class tkq implements wig<tkp> {
    private final wzi<vcs> a;
    private final wzi<tlr> b;

    private tkq(wzi<vcs> wzi, wzi<tlr> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tkq a(wzi<vcs> wzi, wzi<tlr> wzi2) {
        return new tkq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tkp(this.a, this.b);
    }
}
