package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.Single;

/* renamed from: vqg reason: default package */
public final class vqg implements vua<wud<wan>> {
    private final wlc<vpt> a;
    private final wlc<ObjectMapper> b;
    private final wlc<wgd> c;
    private final wlc<wbv> d;
    private final wlc<Single<vrg>> e;
    private final wlc<vrh> f;
    private final wlc<String> g;
    private final wlc<String> h;
    private final wlc<vre> i;

    private vqg(wlc<vpt> wlc, wlc<ObjectMapper> wlc2, wlc<wgd> wlc3, wlc<wbv> wlc4, wlc<Single<vrg>> wlc5, wlc<vrh> wlc6, wlc<String> wlc7, wlc<String> wlc8, wlc<vre> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static vqg a(wlc<vpt> wlc, wlc<ObjectMapper> wlc2, wlc<wgd> wlc3, wlc<wbv> wlc4, wlc<Single<vrg>> wlc5, wlc<vrh> wlc6, wlc<String> wlc7, wlc<String> wlc8, wlc<vre> wlc9) {
        vqg vqg = new vqg(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return vqg;
    }

    public final /* synthetic */ Object get() {
        return (wud) vuf.a(CC.a((vpt) this.a.get(), (ObjectMapper) this.b.get(), (wgd) this.c.get(), (wbv) this.d.get(), (Single) this.e.get(), (vrh) this.f.get(), (String) this.g.get(), (String) this.h.get(), (vre) this.i.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
