package defpackage;

import android.content.ComponentName;

/* renamed from: euj reason: default package */
final class euj implements Runnable {
    private final /* synthetic */ euf a;

    euj(euf euf) {
        this.a = euf;
    }

    public final void run() {
        ets.a(this.a.c, new ComponentName(this.a.c.m(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
