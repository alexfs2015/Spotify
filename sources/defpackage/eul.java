package defpackage;

import android.content.Context;
import android.content.Intent;
import defpackage.eup;

/* renamed from: eul reason: default package */
public final class eul<T extends Context & eup> {
    public final T a;

    public eul(T t) {
        bwx.a(t);
        this.a = t;
    }

    public final void a() {
        ery.a((Context) this.a, (eqr) null).q().k.a("Local AppMeasurementService is starting up");
    }

    public final void b() {
        ery.a((Context) this.a, (eqr) null).q().k.a("Local AppMeasurementService is shutting down");
    }

    public final void a(Runnable runnable) {
        evc a2 = evc.a((Context) this.a);
        a2.p().a((Runnable) new euo(a2, runnable));
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            c().c.a("onUnbind called with null intent");
            return true;
        }
        c().k.a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().c.a("onRebind called with null intent");
            return;
        }
        c().k.a("onRebind called. action", intent.getAction());
    }

    public final eqw c() {
        return ery.a((Context) this.a, (eqr) null).q();
    }
}
