package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;

/* renamed from: ouv reason: default package */
public final class ouv implements vua<ouu> {
    private final wlc<fpt> a;
    private final wlc<sih> b;
    private final wlc<spi> c;
    private final wlc<ToolbarMenuHelper> d;

    private ouv(wlc<fpt> wlc, wlc<sih> wlc2, wlc<spi> wlc3, wlc<ToolbarMenuHelper> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static ouv a(wlc<fpt> wlc, wlc<sih> wlc2, wlc<spi> wlc3, wlc<ToolbarMenuHelper> wlc4) {
        return new ouv(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new ouu((fpt) this.a.get(), (sih) this.b.get(), (spi) this.c.get(), (ToolbarMenuHelper) this.d.get());
    }
}
