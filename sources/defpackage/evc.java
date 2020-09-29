package defpackage;

import android.content.Context;
import android.content.Intent;
import defpackage.evg;

/* renamed from: evc reason: default package */
public final class evc<T extends Context & evg> {
    public final T a;

    public evc(T t) {
        bxo.a(t);
        this.a = t;
    }

    public final void a() {
        esp.a((Context) this.a, (eri) null).q().k.a("Local AppMeasurementService is starting up");
    }

    public final void a(Runnable runnable) {
        evt a2 = evt.a((Context) this.a);
        a2.p().a((Runnable) new evf(a2, runnable));
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            c().c.a("onUnbind called with null intent");
            return true;
        }
        c().k.a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void b() {
        esp.a((Context) this.a, (eri) null).q().k.a("Local AppMeasurementService is shutting down");
    }

    public final void b(Intent intent) {
        if (intent == null) {
            c().c.a("onRebind called with null intent");
            return;
        }
        c().k.a("onRebind called. action", intent.getAction());
    }

    public final ern c() {
        return esp.a((Context) this.a, (eri) null).q();
    }
}
