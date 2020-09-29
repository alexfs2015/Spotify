package defpackage;

import android.content.Context;

/* renamed from: owr reason: default package */
public final class owr implements wig<owq> {
    private final wzi<Context> a;
    private final wzi<own> b;
    private final wzi<fqn> c;
    private final wzi<rqb> d;
    private final wzi<rof> e;
    private final wzi<jty> f;

    private owr(wzi<Context> wzi, wzi<own> wzi2, wzi<fqn> wzi3, wzi<rqb> wzi4, wzi<rof> wzi5, wzi<jty> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static owr a(wzi<Context> wzi, wzi<own> wzi2, wzi<fqn> wzi3, wzi<rqb> wzi4, wzi<rof> wzi5, wzi<jty> wzi6) {
        owr owr = new owr(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return owr;
    }

    public final /* synthetic */ Object get() {
        owq owq = new owq((Context) this.a.get(), (own) this.b.get(), (fqn) this.c.get(), (rqb) this.d.get(), (rof) this.e.get(), (jty) this.f.get());
        return owq;
    }
}
