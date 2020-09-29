package com.spotify.mobile.android.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import rx.internal.util.ScalarSynchronousObservable;

public final class SensorRecorder implements SensorEventListener {
    private final jjf a;
    private final Context b;
    /* access modifiers changed from: private */
    public final Handler c;
    private final Handler d;
    private SensorManager e;
    private Sensor f;
    private Sensor g;
    private String h;
    private wuk i = xaj.b();
    private c j;
    private c k;

    public enum RecordingPurpose {
        TRAINING,
        CLASSIFICATION
    }

    class a implements wun<Boolean> {
        private final int a;
        private final b b;

        public final /* synthetic */ void call(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                SensorRecorder.this.b();
                SensorRecorder.this.c.postDelayed(this.b, (long) this.a);
            }
        }

        public a(int i, b bVar) {
            this.a = i;
            this.b = bVar;
        }
    }

    class b implements Runnable {
        private final String a;
        private int b;

        public b(String str) {
            this.a = str;
        }

        public final void run() {
            if (this.b < 8) {
                SensorRecorder.a(SensorRecorder.this, this.a);
                SensorRecorder.this.c.postDelayed(this, 10000);
                this.b++;
            }
        }
    }

    static class c {
        List<Double> a = new ArrayList(2000);
        List<Double> b = new ArrayList(2000);
        List<Double> c = new ArrayList(2000);
        List<Double> d = new ArrayList(2000);

        public c(int i) {
        }

        public final void a(float f, float f2, float f3) {
            this.a.add(Double.valueOf((double) f));
            this.b.add(Double.valueOf((double) f2));
            this.c.add(Double.valueOf((double) f3));
            this.d.add(Double.valueOf(Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)))));
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public SensorRecorder(Context context, jjf jjf) {
        this.b = context;
        this.c = new Handler();
        this.d = new Handler();
        this.a = jjf;
    }

    public final void a(String str, RecordingPurpose recordingPurpose, int i2) {
        wud wud;
        wud wud2;
        a aVar = new a(i2, new b(str));
        hec hec = (hec) ggw.a(hec.class);
        if (recordingPurpose == RecordingPurpose.CLASSIFICATION) {
            wud2 = vun.a((wrf<T>) hec.a(jso.b));
        } else if (recordingPurpose == RecordingPurpose.TRAINING) {
            wud2 = vun.a((wrf<T>) hec.a(jso.a));
        } else {
            wud = ScalarSynchronousObservable.d(Boolean.FALSE);
            this.i = wud.a((wun<? super T>) aVar, (wun<Throwable>) $$Lambda$SensorRecorder$qFa7HGxTY_C9SUgzRbIZ5h0QpKE.INSTANCE);
        }
        wud = wud2.c().c((wud<? extends T>) ScalarSynchronousObservable.d("Control")).f(new wut("Enabled") {
            private final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object call(Object obj) {
                return Boolean.valueOf(this.f$0.equals((String) obj));
            }
        });
        this.i = wud.a((wun<? super T>) aVar, (wun<Throwable>) $$Lambda$SensorRecorder$qFa7HGxTY_C9SUgzRbIZ5h0QpKE.INSTANCE);
    }

    /* access modifiers changed from: private */
    public void b() {
        this.d.removeCallbacksAndMessages(null);
        if (!this.i.isUnsubscribed()) {
            this.i.unsubscribe();
        }
        Sensor sensor = this.f;
        if (sensor != null) {
            this.e.unregisterListener(this, sensor);
        }
        Sensor sensor2 = this.g;
        if (sensor2 != null) {
            this.e.unregisterListener(this, sensor2);
        }
    }

    public final void a() {
        this.c.removeCallbacksAndMessages(null);
        b();
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (!(sensorEvent == null || this.j == null || this.k == null)) {
            if (sensorEvent.sensor.getType() == 1 && this.j.d.size() < 2000) {
                this.j.a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
            } else if (sensorEvent.sensor.getType() == 4 && this.k.d.size() < 2000) {
                this.k.a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
            }
        }
    }

    private static void a(String str, String str2, List<Double> list, jjf jjf) {
        List<Double> list2 = list;
        if (list2 != null && !list.isEmpty()) {
            double doubleValue = ((Double) list2.get(0)).doubleValue();
            double d2 = 0.0d;
            double d3 = doubleValue;
            double d4 = d3;
            double d5 = 0.0d;
            for (Double d6 : list) {
                d5 += d6.doubleValue();
                if (d6.doubleValue() < d3) {
                    d3 = d6.doubleValue();
                }
                if (d6.doubleValue() > d4) {
                    d4 = d6.doubleValue();
                }
            }
            double size = (double) list.size();
            Double.isNaN(size);
            double d7 = d5 / size;
            for (Double doubleValue2 : list) {
                double doubleValue3 = doubleValue2.doubleValue() - d7;
                d2 += doubleValue3 * doubleValue3;
            }
            double size2 = (double) (list.size() - 1);
            Double.isNaN(size2);
            au auVar = new au(str, str2, d3, d4, d7, d2 / size2);
            jjf.a(auVar);
        }
    }

    static /* synthetic */ void a(SensorRecorder sensorRecorder, String str) {
        sensorRecorder.e = (SensorManager) sensorRecorder.b.getSystemService("sensor");
        SensorManager sensorManager = sensorRecorder.e;
        if (sensorManager != null) {
            sensorRecorder.f = sensorManager.getDefaultSensor(1);
            sensorRecorder.g = sensorRecorder.e.getDefaultSensor(4);
            if (sensorRecorder.f != null && sensorRecorder.g != null) {
                sensorRecorder.j = new c(2000);
                sensorRecorder.k = new c(2000);
                sensorRecorder.h = str;
                boolean registerListener = sensorRecorder.e.registerListener(sensorRecorder, sensorRecorder.f, 0);
                boolean registerListener2 = sensorRecorder.e.registerListener(sensorRecorder, sensorRecorder.g, 0);
                if (registerListener && registerListener2) {
                    sensorRecorder.d.removeCallbacksAndMessages(null);
                    sensorRecorder.d.postDelayed(new Runnable() {
                        public final void run() {
                            SensorRecorder.this.b();
                            SensorRecorder.c(SensorRecorder.this);
                        }
                    }, 5000);
                }
            }
        }
    }

    static /* synthetic */ void c(SensorRecorder sensorRecorder) {
        if (sensorRecorder.k != null) {
            c cVar = sensorRecorder.j;
            if (cVar != null) {
                a("accelerometer", sensorRecorder.h, cVar.d, sensorRecorder.a);
                a("accelerometer_X", sensorRecorder.h, sensorRecorder.j.a, sensorRecorder.a);
                a("accelerometer_Y", sensorRecorder.h, sensorRecorder.j.b, sensorRecorder.a);
                a("accelerometer_Z", sensorRecorder.h, sensorRecorder.j.c, sensorRecorder.a);
                a("gyroscope", sensorRecorder.h, sensorRecorder.k.d, sensorRecorder.a);
                a("gyroscope_X", sensorRecorder.h, sensorRecorder.k.a, sensorRecorder.a);
                a("gyroscope_Y", sensorRecorder.h, sensorRecorder.k.b, sensorRecorder.a);
                a("gyroscope_Z", sensorRecorder.h, sensorRecorder.k.c, sensorRecorder.a);
            }
        }
        sensorRecorder.j = null;
        sensorRecorder.k = null;
    }
}
