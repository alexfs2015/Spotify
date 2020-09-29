package defpackage;

/* renamed from: nio reason: default package */
public final class nio implements ndd {
    private final boolean a;
    private final wlc<rfe> b;
    private final ndr c;
    private final ndn d;

    public nio(boolean z, wlc<rfe> wlc, ndr ndr, ndn ndn) {
        this.a = z;
        this.b = wlc;
        this.c = ndr;
        this.d = ndn;
    }

    public final wud<gzz> a() {
        if (this.a) {
            return vun.a((wrf<T>) ((rfe) this.b.get()).a());
        }
        return this.c.a().a((c<? super T, ? extends R>) this.d);
    }
}
