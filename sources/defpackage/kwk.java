package defpackage;

/* renamed from: kwk reason: default package */
public final class kwk implements vua<kwi> {
    private final wlc<ghm> a;

    private kwk(wlc<ghm> wlc) {
        this.a = wlc;
    }

    public static kwk a(wlc<ghm> wlc) {
        return new kwk(wlc);
    }

    public static kwi a(ghm ghm) {
        return (kwi) vuf.a(CC.a(ghm), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((ghm) this.a.get());
    }
}
