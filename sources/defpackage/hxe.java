package defpackage;

/* renamed from: hxe reason: default package */
public final class hxe implements vua<hxd> {
    private final wlc<igl> a;

    private hxe(wlc<igl> wlc) {
        this.a = wlc;
    }

    public static hxe a(wlc<igl> wlc) {
        return new hxe(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hxd((igl) this.a.get());
    }
}
