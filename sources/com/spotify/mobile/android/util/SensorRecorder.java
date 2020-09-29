package com.spotify.mobile.android.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;
import java.util.List;

public final class SensorRecorder implements SensorEventListener {
    private final jlr a;
    private final Context b;
    private final Flowable<fqn> c;
    /* access modifiers changed from: private */
    public final Handler d;
    private final Handler e;
    private SensorManager f;
    private Sensor g;
    private Sensor h;
    private String i;
    private Disposable j = Disposables.b();
    private c k;
    private c l;

    public enum RecordingPurpose {
        TRAINING,
        CLASSIFICATION
    }

    class a implements Consumer<Boolean> {
        private final int a;
        private final b b;

        public a(int i, b bVar) {
            this.a = i;
            this.b = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                SensorRecorder.this.b();
                SensorRecorder.this.d.postDelayed(this.b, (long) this.a);
            }
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
                SensorRecorder.this.d.postDelayed(this, 10000);
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

    public SensorRecorder(Context context, jlr jlr, Flowable<fqn> flowable) {
        this.b = context;
        this.c = flowable;
        this.d = new Handler();
        this.e = new Handler();
        this.a = jlr;
    }

    private static Observable<Boolean> a(RecordingPurpose recordingPurpose, Flowable<fqn> flowable) {
        fqu fqu;
        if (recordingPurpose == RecordingPurpose.CLASSIFICATION) {
            fqu = juv.b;
        } else if (recordingPurpose != RecordingPurpose.TRAINING) {
            return Observable.b(Boolean.FALSE);
        } else {
            fqu = juv.a;
        }
        String str = "otsrloC";
        String str2 = "blamdne";
        return flowable.c((Function<? super T, ? extends R>) new Function() {
            public final Object apply(Object obj) {
                return SensorRecorder.a(fqm.this, (fqn) obj);
            }
        }).a(Functions.a()).j().c(1).d((ObservableSource<? extends T>) Observable.b("Control")).c((Function<? super T, ? extends R>) new Function("Enabled") {
            private final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return Boolean.valueOf(this.f$0.equals((String) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(fqm fqm, fqn fqn) {
        return (String) fqn.a(fqm);
    }

    static /* synthetic */ void a(SensorRecorder sensorRecorder, String str) {
        String str2 = "eosnor";
        sensorRecorder.f = (SensorManager) sensorRecorder.b.getSystemService("sensor");
        SensorManager sensorManager = sensorRecorder.f;
        if (sensorManager != null) {
            sensorRecorder.g = sensorManager.getDefaultSensor(1);
            sensorRecorder.h = sensorRecorder.f.getDefaultSensor(4);
            if (!(sensorRecorder.g == null || sensorRecorder.h == null)) {
                sensorRecorder.k = new c(2000);
                sensorRecorder.l = new c(2000);
                sensorRecorder.i = str;
                boolean registerListener = sensorRecorder.f.registerListener(sensorRecorder, sensorRecorder.g, 0);
                boolean registerListener2 = sensorRecorder.f.registerListener(sensorRecorder, sensorRecorder.h, 0);
                if (registerListener && registerListener2) {
                    sensorRecorder.e.removeCallbacksAndMessages(null);
                    sensorRecorder.e.postDelayed(new Runnable() {
                        public final void run() {
                            SensorRecorder.this.b();
                            SensorRecorder.c(SensorRecorder.this);
                        }
                    }, 5000);
                }
            }
        }
    }

    private static void a(String str, String str2, List<Double> list, jlr jlr) {
        List<Double> list2 = list;
        List<Double> list3 = list;
        if (list3 != null && !list.isEmpty()) {
            double doubleValue = ((Double) list3.get(0)).doubleValue();
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
            at atVar = r6;
            at atVar2 = new at(str, str2, d3, d4, d7, d2 / size2);
            jlr.a(atVar2);
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        this.e.removeCallbacksAndMessages(null);
        this.j.bd_();
        Sensor sensor = this.g;
        if (sensor != null) {
            this.f.unregisterListener(this, sensor);
        }
        Sensor sensor2 = this.h;
        if (sensor2 != null) {
            this.f.unregisterListener(this, sensor2);
        }
    }

    static /* synthetic */ void c(SensorRecorder sensorRecorder) {
        if (sensorRecorder.l != null) {
            c cVar = sensorRecorder.k;
            if (cVar != null) {
                a("accelerometer", sensorRecorder.i, cVar.d, sensorRecorder.a);
                a("accelerometer_X", sensorRecorder.i, sensorRecorder.k.a, sensorRecorder.a);
                a("accelerometer_Y", sensorRecorder.i, sensorRecorder.k.b, sensorRecorder.a);
                String str = "ceZerboatm_erel";
                a("accelerometer_Z", sensorRecorder.i, sensorRecorder.k.c, sensorRecorder.a);
                String str2 = "cyeopsbor";
                a("gyroscope", sensorRecorder.i, sensorRecorder.l.d, sensorRecorder.a);
                String str3 = "osyepgotc_X";
                a("gyroscope_X", sensorRecorder.i, sensorRecorder.l.a, sensorRecorder.a);
                a("gyroscope_Y", sensorRecorder.i, sensorRecorder.l.b, sensorRecorder.a);
                a("gyroscope_Z", sensorRecorder.i, sensorRecorder.l.c, sensorRecorder.a);
            }
        }
        sensorRecorder.k = null;
        sensorRecorder.l = null;
    }

    public final void a() {
        this.d.removeCallbacksAndMessages(null);
        b();
    }

    public final void a(String str, RecordingPurpose recordingPurpose, int i2) {
        this.j = a(recordingPurpose, this.c).d((Consumer<? super T>) new a<Object>(i2, new b(str)));
    }

    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (!(sensorEvent == null || this.k == null)) {
            if (this.l != null) {
                if (sensorEvent.sensor.getType() == 1 && this.k.d.size() < 2000) {
                    this.k.a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                } else if (sensorEvent.sensor.getType() == 4 && this.l.d.size() < 2000) {
                    this.l.a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                }
            }
        }
    }
}
