package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ikg reason: default package */
public final class ikg {
    public final Context a;
    public final a b;
    public final Map<String, ikf> c = new HashMap(15);
    public final hne d;
    public final Scheduler e;
    public final Scheduler f;
    public final ksw g;

    public ikg(Context context, hne hne, a aVar, Scheduler scheduler, Scheduler scheduler2, ksw ksw) {
        this.a = (Context) fay.a(context);
        this.d = hne;
        this.b = (a) fay.a(aVar);
        this.e = scheduler;
        this.f = scheduler2;
        this.g = ksw;
    }

    public final void a() {
        for (ikf c2 : this.c.values()) {
            c2.c();
        }
    }

    public final void b() {
        for (ikf e2 : this.c.values()) {
            e2.e();
        }
    }

    public final ikf a(String str) {
        return (ikf) this.c.get(fay.a(str));
    }
}
