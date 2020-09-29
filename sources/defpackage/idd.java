package defpackage;

/* renamed from: idd reason: default package */
public final class idd implements vua<idc> {
    private final wlc<hxl> a;

    private idd(wlc<hxl> wlc) {
        this.a = wlc;
    }

    public static idd a(wlc<hxl> wlc) {
        return new idd(wlc);
    }

    public final /* synthetic */ Object get() {
        return new idc((hxl) this.a.get());
    }
}
