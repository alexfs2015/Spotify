package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: pxb reason: default package */
public final class pxb implements vua<gum> {
    private final wlc<Context> a;
    private final wlc<a> b;
    private final wlc<Map<String, gvk>> c;
    private final wlc<gvv> d;
    private final wlc<gyl> e;

    private pxb(wlc<Context> wlc, wlc<a> wlc2, wlc<Map<String, gvk>> wlc3, wlc<gvv> wlc4, wlc<gyl> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static pxb a(wlc<Context> wlc, wlc<a> wlc2, wlc<Map<String, gvk>> wlc3, wlc<gvv> wlc4, wlc<gyl> wlc5) {
        pxb pxb = new pxb(wlc, wlc2, wlc3, wlc4, wlc5);
        return pxb;
    }

    public final /* synthetic */ Object get() {
        return (gum) vuf.a(((gvv) this.d.get()).a((Context) this.a.get(), (a) this.b.get()).a(gxz.a).a((Map) this.c.get()).a((gyl) this.e.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
