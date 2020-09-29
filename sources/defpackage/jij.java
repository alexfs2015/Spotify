package defpackage;

import com.spotify.mobile.android.util.SensorRecorder;
import com.spotify.mobile.android.util.SensorRecorder.RecordingPurpose;

/* renamed from: jij reason: default package */
public final class jij implements jhy {
    public final jii a;
    public final SensorRecorder b;
    private boolean c;

    public jij(jii jii, SensorRecorder sensorRecorder) {
        this.a = (jii) fay.a(jii);
        this.b = (SensorRecorder) fay.a(sensorRecorder);
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
