package defpackage;

import android.app.Activity;
import java.util.Map;

/* renamed from: pax reason: default package */
public final class pax implements vua<gum> {
    private final wlc<Activity> a;
    private final wlc<a> b;
    private final wlc<gvv> c;
    private final wlc<Map<String, gvk>> d;

    private pax(wlc<Activity> wlc, wlc<a> wlc2, wlc<gvv> wlc3, wlc<Map<String, gvk>> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pax a(wlc<Activity> wlc, wlc<a> wlc2, wlc<gvv> wlc3, wlc<Map<String, gvk>> wlc4) {
        return new pax(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (gum) vuf.a(((gvv) this.c.get()).a((Activity) this.a.get(), (a) this.b.get()).a((Map) this.d.get()).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
