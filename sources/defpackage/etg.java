package defpackage;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: etg reason: default package */
final class etg implements Runnable {
    private final /* synthetic */ ConditionalUserProperty a;
    private final /* synthetic */ etc b;

    etg(etc etc, ConditionalUserProperty conditionalUserProperty) {
        this.b = etc;
        this.a = conditionalUserProperty;
    }

    public final void run() {
        etc.a(this.b, this.a);
    }
}
