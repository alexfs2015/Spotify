package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: mui reason: default package */
public final class mui implements wig<gwm> {
    private final wzi<Context> a;
    private final wzi<a> b;
    private final wzi<gxw> c;
    private final wzi<Map<String, gxk>> d;
    private final wzi<mun> e;

    private mui(wzi<Context> wzi, wzi<a> wzi2, wzi<gxw> wzi3, wzi<Map<String, gxk>> wzi4, wzi<mun> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static mui a(wzi<Context> wzi, wzi<a> wzi2, wzi<gxw> wzi3, wzi<Map<String, gxk>> wzi4, wzi<mun> wzi5) {
        mui mui = new mui(wzi, wzi2, wzi3, wzi4, wzi5);
        return mui;
    }

    public final /* synthetic */ Object get() {
        gxw gxw = (gxw) this.c.get();
        Map map = (Map) this.d.get();
        mun mun = (mun) this.e.get();
        return (gwm) wil.a(gxw.a((Context) this.a.get(), (a) this.b.get()).a(map).a.a(mun).c(mun).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
