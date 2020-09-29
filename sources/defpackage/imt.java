package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;
import java.util.HashMap;
import java.util.Map;

/* renamed from: imt reason: default package */
public final class imt {
    public final Context a;
    public final a b;
    public final Map<String, ims> c = new HashMap(15);
    public final hpt d;
    public final Scheduler e;
    public final Scheduler f;
    public final kwf g;

    public imt(Context context, hpt hpt, a aVar, Scheduler scheduler, Scheduler scheduler2, kwf kwf) {
        this.a = (Context) fbp.a(context);
        this.d = hpt;
        this.b = (a) fbp.a(aVar);
        this.e = scheduler;
        this.f = scheduler2;
        this.g = kwf;
    }

    public final ims a(String str) {
        return (ims) this.c.get(fbp.a(str));
    }

    public final void a() {
        for (ims c2 : this.c.values()) {
            c2.c();
        }
    }

    public final void b() {
        for (ims e2 : this.c.values()) {
            e2.e();
        }
    }
}
