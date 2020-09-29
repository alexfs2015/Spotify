package defpackage;

import android.content.res.Resources;

/* renamed from: hnv reason: default package */
public final class hnv implements vua<htk> {
    private final wlc<Resources> a;
    private final wlc<htn> b;
    private final wlc<hed> c;
    private final wlc<hrc> d;
    private final wlc<jjf> e;

    private hnv(wlc<Resources> wlc, wlc<htn> wlc2, wlc<hed> wlc3, wlc<hrc> wlc4, wlc<jjf> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static hnv a(wlc<Resources> wlc, wlc<htn> wlc2, wlc<hed> wlc3, wlc<hrc> wlc4, wlc<jjf> wlc5) {
        hnv hnv = new hnv(wlc, wlc2, wlc3, wlc4, wlc5);
        return hnv;
    }

    public final /* synthetic */ Object get() {
        htl htl = new htl((Resources) this.a.get(), (htn) this.b.get(), (hed) this.c.get(), (hrc) this.d.get(), new hou((jjf) this.e.get()));
        return (htk) vuf.a(htl, "Cannot return null from a non-@Nullable @Provides method");
    }
}
