package defpackage;

/* renamed from: ngu reason: default package */
public final class ngu implements vua<sie> {
    private final wlc<fpt> a;
    private final wlc<shy> b;

    private ngu(wlc<fpt> wlc, wlc<shy> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ngu a(wlc<fpt> wlc, wlc<shy> wlc2) {
        return new ngu(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (sie) vuf.a(jsl.b((fpt) this.a.get()) ? sie.a : (sie) vtz.b(this.b).get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
