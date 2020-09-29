package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;

/* renamed from: fyx reason: default package */
public final class fyx implements vua<ToolbarMenuHelper> {
    private final wlc<jjf> a;
    private final wlc<jsz> b;
    private final wlc<udr> c;

    private fyx(wlc<jjf> wlc, wlc<jsz> wlc2, wlc<udr> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static fyx a(wlc<jjf> wlc, wlc<jsz> wlc2, wlc<udr> wlc3) {
        return new fyx(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ToolbarMenuHelper((jjf) this.a.get(), (jsz) this.b.get(), (udr) this.c.get());
    }
}
