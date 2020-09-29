package defpackage;

/* renamed from: nkv reason: default package */
public final class nkv implements vua<org> {
    private final wlc<oiv> a;
    private final wlc<a> b;
    private final wlc<ohz> c;

    private nkv(wlc<oiv> wlc, wlc<a> wlc2, wlc<ohz> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nkv a(wlc<oiv> wlc, wlc<a> wlc2, wlc<ohz> wlc3) {
        return new nkv(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (org) vuf.a(((a) this.b.get()).a((oiv) this.a.get(), ((ohz) this.c.get()).a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
