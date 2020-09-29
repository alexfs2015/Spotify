package defpackage;

/* renamed from: svn reason: default package */
public final class svn implements vua<hvk<svp>> {
    private final wlc<hvl> a;

    private svn(wlc<hvl> wlc) {
        this.a = wlc;
    }

    public static svn a(wlc<hvl> wlc) {
        return new svn(wlc);
    }

    public final /* synthetic */ Object get() {
        return (hvk) vuf.a(new hvk((hvl) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
