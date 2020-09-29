package defpackage;

import com.spotify.mobile.android.util.SensorRecorder;
import com.spotify.mobile.android.util.SensorRecorder.RecordingPurpose;

/* renamed from: jkz reason: default package */
public final class jkz implements jko {
    public final jky a;
    public final SensorRecorder b;
    private boolean c;

    public jkz(jky jky, SensorRecorder sensorRecorder) {
        this.a = (jky) fbp.a(jky);
        this.b = (SensorRecorder) fbp.a(sensorRecorder);
        this.a.a(this);
        if (this.a.e) {
            a();
        }
    }

    public final void a() {
        if (!this.c) {
            this.b.a("wifi_connected", RecordingPurpose.TRAINING, 10000);
            this.c = true;
        }
    }

    public final void b() {
        this.b.a();
        this.c = false;
    }
}
