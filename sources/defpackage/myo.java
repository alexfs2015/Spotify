package defpackage;

import android.app.Activity;
import java.util.Map;

/* renamed from: myo reason: default package */
public final class myo implements wig<gwm> {
    private final wzi<Activity> a;
    private final wzi<a> b;
    private final wzi<gxw> c;
    private final wzi<rnu> d;
    private final wzi<has> e;
    private final wzi<Map<String, gxk>> f;

    private myo(wzi<Activity> wzi, wzi<a> wzi2, wzi<gxw> wzi3, wzi<rnu> wzi4, wzi<has> wzi5, wzi<Map<String, gxk>> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static myo a(wzi<Activity> wzi, wzi<a> wzi2, wzi<gxw> wzi3, wzi<rnu> wzi4, wzi<has> wzi5, wzi<Map<String, gxk>> wzi6) {
        myo myo = new myo(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return myo;
    }

    public final /* synthetic */ Object get() {
        gxw gxw = (gxw) this.c.get();
        rnu rnu = (rnu) this.d.get();
        has has = (has) this.e.get();
        Map map = (Map) this.f.get();
        return (gwm) wil.a(gxw.a((Activity) this.a.get(), (a) this.b.get()).a(has).a(map).a.b(rnu).c(rnu).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
