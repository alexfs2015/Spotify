package defpackage;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: ety reason: default package */
final class ety implements Runnable {
    private final /* synthetic */ ConditionalUserProperty a;
    private final /* synthetic */ ett b;

    ety(ett ett, ConditionalUserProperty conditionalUserProperty) {
        this.b = ett;
        this.a = conditionalUserProperty;
    }

    public final void run() {
        ett.b(this.b, this.a);
    }
}
