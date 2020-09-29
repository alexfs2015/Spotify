package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;

/* renamed from: pei reason: default package */
public final class pei implements wig<peh> {
    private final wzi<utg> a;
    private final wzi<ToolbarMenuHelper> b;
    private final wzi<fzt> c;
    private final wzi<izh> d;
    private final wzi<sso> e;
    private final wzi<fqn> f;
    private final wzi<tye> g;
    private final wzi<Boolean> h;

    private pei(wzi<utg> wzi, wzi<ToolbarMenuHelper> wzi2, wzi<fzt> wzi3, wzi<izh> wzi4, wzi<sso> wzi5, wzi<fqn> wzi6, wzi<tye> wzi7, wzi<Boolean> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static pei a(wzi<utg> wzi, wzi<ToolbarMenuHelper> wzi2, wzi<fzt> wzi3, wzi<izh> wzi4, wzi<sso> wzi5, wzi<fqn> wzi6, wzi<tye> wzi7, wzi<Boolean> wzi8) {
        pei pei = new pei(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return pei;
    }

    public final /* synthetic */ Object get() {
        peh peh = new peh((utg) this.a.get(), (ToolbarMenuHelper) this.b.get(), (fzt) this.c.get(), (izh) this.d.get(), (sso) this.e.get(), (fqn) this.f.get(), (tye) this.g.get(), ((Boolean) this.h.get()).booleanValue());
        return peh;
    }
}
