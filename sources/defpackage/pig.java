package defpackage;

import android.app.Activity;
import java.util.Map;

/* renamed from: pig reason: default package */
public final class pig implements wig<gwm> {
    private final wzi<Activity> a;
    private final wzi<a> b;
    private final wzi<gxw> c;
    private final wzi<Map<String, gxk>> d;

    private pig(wzi<Activity> wzi, wzi<a> wzi2, wzi<gxw> wzi3, wzi<Map<String, gxk>> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static pig a(wzi<Activity> wzi, wzi<a> wzi2, wzi<gxw> wzi3, wzi<Map<String, gxk>> wzi4) {
        return new pig(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (gwm) wil.a(((gxw) this.c.get()).a((Activity) this.a.get(), (a) this.b.get()).a((Map) this.d.get()).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
