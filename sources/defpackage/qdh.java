package defpackage;

/* renamed from: qdh reason: default package */
public final class qdh implements vua<ihg> {
    private final wlc<qda> a;
    private final wlc<fpt> b;
    private final wlc<jvr> c;
    private final wlc<ihe> d;

    private qdh(wlc<qda> wlc, wlc<fpt> wlc2, wlc<jvr> wlc3, wlc<ihe> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qdh a(wlc<qda> wlc, wlc<fpt> wlc2, wlc<jvr> wlc3, wlc<ihe> wlc4) {
        return new qdh(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (ihg) vuf.a(new ihg((qda) this.a.get(), (fpt) this.b.get(), (jvr) this.c.get(), (ihe) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
