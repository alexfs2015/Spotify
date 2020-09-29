package defpackage;

/* renamed from: mmp reason: default package */
public final class mmp implements vua<mmo> {
    private final wlc<twu> a;
    private final wlc<rgz> b;
    private final wlc<hdb> c;

    private mmp(wlc<twu> wlc, wlc<rgz> wlc2, wlc<hdb> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mmp a(wlc<twu> wlc, wlc<rgz> wlc2, wlc<hdb> wlc3) {
        return new mmp(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mmo((twu) this.a.get(), (rgz) this.b.get(), (hdb) this.c.get());
    }
}
