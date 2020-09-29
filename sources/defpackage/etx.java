package defpackage;

import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;

/* renamed from: etx reason: default package */
final class etx implements Runnable {
    private final /* synthetic */ ConditionalUserProperty a;
    private final /* synthetic */ ett b;

    etx(ett ett, ConditionalUserProperty conditionalUserProperty) {
        this.b = ett;
        this.a = conditionalUserProperty;
    }

    public final void run() {
        ett.a(this.b, this.a);
    }
}
