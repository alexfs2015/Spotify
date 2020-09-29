package defpackage;

/* renamed from: qbb reason: default package */
public final class qbb implements vua<vim<gzz>> {
    private final wlc<fpt> a;
    private final wlc<Boolean> b;
    private final wlc<twu> c;
    private final wlc<rgz> d;
    private final wlc<rfd> e;
    private final wlc<qbi> f;
    private final wlc<qbk> g;

    private qbb(wlc<fpt> wlc, wlc<Boolean> wlc2, wlc<twu> wlc3, wlc<rgz> wlc4, wlc<rfd> wlc5, wlc<qbi> wlc6, wlc<qbk> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static qbb a(wlc<fpt> wlc, wlc<Boolean> wlc2, wlc<twu> wlc3, wlc<rgz> wlc4, wlc<rfd> wlc5, wlc<qbi> wlc6, wlc<qbk> wlc7) {
        qbb qbb = new qbb(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return qbb;
    }

    public final /* synthetic */ Object get() {
        fpt fpt = (fpt) this.a.get();
        boolean booleanValue = ((Boolean) this.b.get()).booleanValue();
        twu twu = (twu) this.c.get();
        rgz rgz = (rgz) this.d.get();
        wlc<rfd> wlc = this.e;
        wlc<qbi> wlc2 = this.f;
        wlc<qbk> wlc3 = this.g;
        a aVar = new a();
        if (rgz.a(fpt) || twu.a(fpt)) {
            aVar.a(vun.a((c) wlc.get()));
            if (booleanValue) {
                aVar.a(vun.a((c) wlc2.get()));
            }
            if (booleanValue) {
                aVar.a(vun.a((c) wlc3.get()));
            }
        }
        return (vim) vuf.a(vim.a(aVar.a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
