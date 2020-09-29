package defpackage;

/* renamed from: uns reason: default package */
public final class uns implements vua<a> {
    private final wlc<jsz> a;

    private uns(wlc<jsz> wlc) {
        this.a = wlc;
    }

    public static uns a(wlc<jsz> wlc) {
        return new uns(wlc);
    }

    public final /* synthetic */ Object get() {
        return (a) vuf.a(unr.a((jsz) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
