package defpackage;

import android.app.Activity;
import java.util.Map;

/* renamed from: mxr reason: default package */
public final class mxr implements vua<gum> {
    private final wlc<Activity> a;
    private final wlc<a> b;
    private final wlc<gvv> c;
    private final wlc<res> d;
    private final wlc<gxz> e;
    private final wlc<Map<String, gvk>> f;

    private mxr(wlc<Activity> wlc, wlc<a> wlc2, wlc<gvv> wlc3, wlc<res> wlc4, wlc<gxz> wlc5, wlc<Map<String, gvk>> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static mxr a(wlc<Activity> wlc, wlc<a> wlc2, wlc<gvv> wlc3, wlc<res> wlc4, wlc<gxz> wlc5, wlc<Map<String, gvk>> wlc6) {
        mxr mxr = new mxr(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return mxr;
    }

    public final /* synthetic */ Object get() {
        gvv gvv = (gvv) this.c.get();
        res res = (res) this.d.get();
        gxz gxz = (gxz) this.e.get();
        Map map = (Map) this.f.get();
        return (gum) vuf.a(gvv.a((Activity) this.a.get(), (a) this.b.get()).a(gxz).a(map).a.b(res).c(res).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
