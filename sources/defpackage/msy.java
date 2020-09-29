package defpackage;

/* renamed from: msy reason: default package */
public final class msy implements vua<msr> {
    private final wlc<Boolean> a;
    private final wlc<muy> b;
    private final wlc<mss> c;

    private msy(wlc<Boolean> wlc, wlc<muy> wlc2, wlc<mss> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static msy a(wlc<Boolean> wlc, wlc<muy> wlc2, wlc<mss> wlc3) {
        return new msy(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        Object obj = (muy) this.b.get();
        Object obj2 = (mss) this.c.get();
        if (!((Boolean) this.a.get()).booleanValue()) {
            obj = obj2;
        }
        return (msr) vuf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
