package defpackage;

import android.app.Activity;

/* renamed from: mto reason: default package */
public final class mto implements vua<gur> {
    private final wlc<msm> a;
    private final wlc<gum> b;
    private final wlc<Activity> c;
    private final wlc<rfi> d;

    private mto(wlc<msm> wlc, wlc<gum> wlc2, wlc<Activity> wlc3, wlc<rfi> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mto a(wlc<msm> wlc, wlc<gum> wlc2, wlc<Activity> wlc3, wlc<rfi> wlc4) {
        return new mto(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (gur) vuf.a(new mvt((Activity) this.c.get(), (gum) this.b.get(), (msm) this.a.get(), (rfi) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
