package defpackage;

/* renamed from: hrs reason: default package */
public final class hrs implements vua<hrr> {
    private final wlc<iod> a;
    private final wlc<hpb> b;

    private hrs(wlc<iod> wlc, wlc<hpb> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hrs a(wlc<iod> wlc, wlc<hpb> wlc2) {
        return new hrs(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hrr((iod) this.a.get(), (hpb) this.b.get());
    }
}
