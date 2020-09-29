package defpackage;

/* renamed from: jzk reason: default package */
public final class jzk implements vua<jyd> {
    private final wlc<fpt> a;

    private jzk(wlc<fpt> wlc) {
        this.a = wlc;
    }

    public static jzk a(wlc<fpt> wlc) {
        return new jzk(wlc);
    }

    public final /* synthetic */ Object get() {
        return (jyd) vuf.a(jyd.d().a((String) ((fpt) this.a.get()).a(jyz.a)).a(true).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
