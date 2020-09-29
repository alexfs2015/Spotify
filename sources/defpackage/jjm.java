package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: jjm reason: default package */
public final class jjm extends jkj implements SensorEventListener {
    boolean a;
    final SensorManager b;
    final Sensor c;
    private float f;
    private float g;
    private float h;
    private float i;
    private float[] j = {0.0f, 0.0f, 0.0f};
    private ScheduledExecutorService k = Executors.newSingleThreadScheduledExecutor();
    private boolean l;
    /* access modifiers changed from: private */
    public Future<?> m;
    private final Runnable n = new Runnable() {
        public final void run() {
            if (jjm.this.m != null && !jjm.this.m.isCancelled()) {
                jjm.b(jjm.this);
            }
        }
    };

    public jjm(jkk jkk) {
        super("DeviceMoving");
        this.b = (SensorManager) jkk.a.getSystemService("sensor");
        this.c = this.b.getDefaultSensor(10) == null ? this.b.getDefaultSensor(1) : this.b.getDefaultSensor(10);
        this.a = false;
        this.l = false;
    }

    static /* synthetic */ void b(jjm jjm) {
        if (((double) jjm.i) > 0.1d) {
            jjm.ag_();
        } else {
            jjm.ah_();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void af_() {
        super.af_();
        if (!(this.c == null || this.b == null)) {
            this.b.registerListener(this, this.c, 3);
            this.a = true;
            if (!this.l) {
                this.l = true;
                this.m = this.k.scheduleAtFixedRate(this.n, 0, 3000, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.l) {
            Future<?> future = this.m;
            if (future != null) {
                future.cancel(false);
            }
        }
        this.k.shutdown();
        this.l = false;
        this.k = null;
        e();
    }

    public final void e() {
        SensorManager sensorManager = this.b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.a = false;
        }
    }

    public final boolean f() {
        return this.c != null;
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (!this.a) {
            e();
            Logger.b("SensorUpdate disabled. return", new Object[0]);
            return;
        }
        if (sensorEvent != null) {
            if (sensorEvent.sensor.getType() == 10) {
                this.f = sensorEvent.values[0];
                this.g = sensorEvent.values[1];
                this.h = sensorEvent.values[2];
            }
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = this.j;
                fArr[0] = (fArr[0] * 0.8f) + (sensorEvent.values[0] * 0.19999999f);
                float[] fArr2 = this.j;
                fArr2[1] = (fArr2[1] * 0.8f) + (sensorEvent.values[1] * 0.19999999f);
                float[] fArr3 = this.j;
                fArr3[2] = (fArr3[2] * 0.8f) + (sensorEvent.values[2] * 0.19999999f);
                this.f = sensorEvent.values[0] - this.j[0];
                this.g = sensorEvent.values[1] - this.j[1];
                this.h = sensorEvent.values[2] - this.j[2];
            }
        }
        float f2 = this.f;
        float f3 = f2 * f2;
        float f4 = this.g;
        float f5 = f3 + (f4 * f4);
        float f6 = this.h;
        this.i = f5 + (f6 * f6);
    }
}
