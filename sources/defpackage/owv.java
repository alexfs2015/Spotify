package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;

/* renamed from: owv reason: default package */
public final class owv implements vua<owu> {
    private final wlc<uhs> a;
    private final wlc<ToolbarMenuHelper> b;
    private final wlc<fyz> c;
    private final wlc<iww> d;
    private final wlc<sih> e;
    private final wlc<fpt> f;
    private final wlc<tmj> g;
    private final wlc<Boolean> h;

    private owv(wlc<uhs> wlc, wlc<ToolbarMenuHelper> wlc2, wlc<fyz> wlc3, wlc<iww> wlc4, wlc<sih> wlc5, wlc<fpt> wlc6, wlc<tmj> wlc7, wlc<Boolean> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static owv a(wlc<uhs> wlc, wlc<ToolbarMenuHelper> wlc2, wlc<fyz> wlc3, wlc<iww> wlc4, wlc<sih> wlc5, wlc<fpt> wlc6, wlc<tmj> wlc7, wlc<Boolean> wlc8) {
        owv owv = new owv(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return owv;
    }

    public final /* synthetic */ Object get() {
        owu owu = new owu((uhs) this.a.get(), (ToolbarMenuHelper) this.b.get(), (fyz) this.c.get(), (iww) this.d.get(), (sih) this.e.get(), (fpt) this.f.get(), (tmj) this.g.get(), ((Boolean) this.h.get()).booleanValue());
        return owu;
    }
}
