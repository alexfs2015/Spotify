package defpackage;

/* renamed from: tpn reason: default package */
public final class tpn implements vua<tkz> {
    private final wlc<tla> a;
    private final wlc<kph> b;
    private final wlc<Boolean> c;

    private tpn(wlc<tla> wlc, wlc<kph> wlc2, wlc<Boolean> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tpn a(wlc<tla> wlc, wlc<kph> wlc2, wlc<Boolean> wlc3) {
        return new tpn(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        Object obj = (tla) this.a.get();
        Object obj2 = (kph) this.b.get();
        if (((Boolean) this.c.get()).booleanValue()) {
            obj = obj2;
        }
        return (tkz) vuf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
