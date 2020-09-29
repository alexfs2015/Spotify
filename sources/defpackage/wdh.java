package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.reactivex.Single;

/* renamed from: wdh reason: default package */
public final class wdh implements wig<xii<wot>> {
    private final wzi<wcu> a;
    private final wzi<ObjectMapper> b;
    private final wzi<wuj> c;
    private final wzi<wqb> d;
    private final wzi<Single<weo>> e;
    private final wzi<wep> f;
    private final wzi<String> g;
    private final wzi<String> h;
    private final wzi<wem> i;

    private wdh(wzi<wcu> wzi, wzi<ObjectMapper> wzi2, wzi<wuj> wzi3, wzi<wqb> wzi4, wzi<Single<weo>> wzi5, wzi<wep> wzi6, wzi<String> wzi7, wzi<String> wzi8, wzi<wem> wzi9) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
    }

    public static wdh a(wzi<wcu> wzi, wzi<ObjectMapper> wzi2, wzi<wuj> wzi3, wzi<wqb> wzi4, wzi<Single<weo>> wzi5, wzi<wep> wzi6, wzi<String> wzi7, wzi<String> wzi8, wzi<wem> wzi9) {
        wdh wdh = new wdh(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9);
        return wdh;
    }

    public final /* synthetic */ Object get() {
        return (xii) wil.a(CC.a((wcu) this.a.get(), (ObjectMapper) this.b.get(), (wuj) this.c.get(), (wqb) this.d.get(), (Single) this.e.get(), (wep) this.f.get(), (String) this.g.get(), (String) this.h.get(), (wem) this.i.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
