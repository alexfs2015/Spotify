package defpackage;

/* renamed from: lxl reason: default package */
public final class lxl implements vua<rfd> {
    private final wlc<uzm> a;
    private final wlc<Boolean> b;
    private final wlc<Boolean> c;
    private final wlc<wud<Boolean>> d;

    private lxl(wlc<uzm> wlc, wlc<Boolean> wlc2, wlc<Boolean> wlc3, wlc<wud<Boolean>> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static lxl a(wlc<uzm> wlc, wlc<Boolean> wlc2, wlc<Boolean> wlc3, wlc<wud<Boolean>> wlc4) {
        return new lxl(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        Object obj;
        uzm uzm = (uzm) this.a.get();
        boolean booleanValue = ((Boolean) this.b.get()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.c.get()).booleanValue();
        wud wud = (wud) this.d.get();
        if (!booleanValue || !booleanValue2) {
            obj = new rfc();
        } else {
            obj = new rfb(uzm, wud);
        }
        return (rfd) vuf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
