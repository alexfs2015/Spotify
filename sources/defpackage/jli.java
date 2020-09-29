package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: jli reason: default package */
public final class jli implements wig<jlh> {
    private final wzi<kf> a;
    private final wzi<RxResolver> b;
    private final wzi<jvf> c;
    private final wzi<tmu> d;
    private final wzi<mfo> e;
    private final wzi<iil> f;
    private final wzi<ure> g;

    private jli(wzi<kf> wzi, wzi<RxResolver> wzi2, wzi<jvf> wzi3, wzi<tmu> wzi4, wzi<mfo> wzi5, wzi<iil> wzi6, wzi<ure> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static jli a(wzi<kf> wzi, wzi<RxResolver> wzi2, wzi<jvf> wzi3, wzi<tmu> wzi4, wzi<mfo> wzi5, wzi<iil> wzi6, wzi<ure> wzi7) {
        jli jli = new jli(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return jli;
    }

    public final /* synthetic */ Object get() {
        jlh jlh = new jlh((kf) this.a.get(), (RxResolver) this.b.get(), (jvf) this.c.get(), (tmu) this.d.get(), (mfo) this.e.get(), (iil) this.f.get(), (ure) this.g.get());
        return jlh;
    }
}
