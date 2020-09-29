package defpackage;

/* renamed from: mgj reason: default package */
public final class mgj implements vua<mgi> {
    private final wlc<mhd> a;

    private mgj(wlc<mhd> wlc) {
        this.a = wlc;
    }

    public static mgj a(wlc<mhd> wlc) {
        return new mgj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new mgi((mhd) this.a.get());
    }
}
