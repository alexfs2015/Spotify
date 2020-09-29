package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;

@cey
/* renamed from: crl reason: default package */
final class crl implements SensorEventListener {
    final SensorManager a;
    Handler b;
    crn c;
    private final Object d = new Object();
    private final Display e;
    private final float[] f = new float[9];
    private final float[] g = new float[9];
    private float[] h;

    crl(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
        this.e = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void a(int i, int i2) {
        float[] fArr = this.g;
        float f2 = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f2;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        if (this.b != null) {
            this.a.unregisterListener(this);
            this.b.post(new crm());
            this.b = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(float[] fArr) {
        synchronized (this.d) {
            if (this.h == null) {
                return false;
            }
            System.arraycopy(this.h, 0, fArr, 0, this.h.length);
            return true;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.d) {
                if (this.h == null) {
                    this.h = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f, fArr);
            int rotation = this.e.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f, 2, 129, this.g);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f, 129, 130, this.g);
            } else if (rotation != 3) {
                System.arraycopy(this.f, 0, this.g, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f, 130, 1, this.g);
            }
            a(1, 3);
            a(2, 6);
            a(5, 7);
            synchronized (this.d) {
                System.arraycopy(this.g, 0, this.h, 0, 9);
            }
            crn crn = this.c;
            if (crn != null) {
                crn.a();
            }
        }
    }
}
