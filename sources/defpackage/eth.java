package defpackage;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: eth reason: default package */
final class eth implements Runnable {
    private final /* synthetic */ ConditionalUserProperty a;
    private final /* synthetic */ etc b;

    eth(etc etc, ConditionalUserProperty conditionalUserProperty) {
        this.b = etc;
        this.a = conditionalUserProperty;
    }

    public final void run() {
        etc.b(this.b, this.a);
    }
}
