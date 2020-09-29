package defpackage;

/* renamed from: mzl reason: default package */
public final class mzl implements vua<String> {
    private final wlc<udr> a;

    private mzl(wlc<udr> wlc) {
        this.a = wlc;
    }

    public static mzl a(wlc<udr> wlc) {
        return new mzl(wlc);
    }

    public final /* synthetic */ Object get() {
        return (String) vuf.a(((udr) this.a.get()).toString(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
