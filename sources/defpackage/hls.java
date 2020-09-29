package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.RxResolver;

/* renamed from: hls reason: default package */
public final class hls implements wig<hlr> {
    private final wzi<Context> a;
    private final wzi<jlr> b;
    private final wzi<vud> c;
    private final wzi<hlt> d;
    private final wzi<jtz> e;
    private final wzi<jyg> f;
    private final wzi<RxResolver> g;
    private final wzi<rwl> h;

    public static hlr a(Context context, jlr jlr, wzi<vud> wzi, hlt hlt, jtz jtz, jyg jyg, RxResolver rxResolver, rwl rwl) {
        hlr hlr = new hlr(context, jlr, wzi, hlt, jtz, jyg, rxResolver, rwl);
        return hlr;
    }

    public final /* synthetic */ Object get() {
        hlr hlr = new hlr((Context) this.a.get(), (jlr) this.b.get(), this.c, (hlt) this.d.get(), (jtz) this.e.get(), (jyg) this.f.get(), (RxResolver) this.g.get(), (rwl) this.h.get());
        return hlr;
    }
}
