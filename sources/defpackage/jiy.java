package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.SensorRecorder;
import com.spotify.mobile.android.util.SensorRecorder.RecordingPurpose;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: jiy reason: default package */
public final class jiy implements jko {
    public final hqy a;
    public final SensorRecorder b;
    public String c;
    private final Flowable<PlayerState> d;
    private final hqu e;
    private final rzt f;
    private Disposable g = Disposables.b();
    private boolean h;
    private boolean i;
    private hps j;

    jiy(Flowable<PlayerState> flowable, hqy hqy, SensorRecorder sensorRecorder, hqu hqu) {
        this.d = flowable;
        this.a = (hqy) fbp.a(hqy);
        this.e = (hqu) fbp.a(hqu);
        String str = "aux";
        this.f = new a(str).a(str).c("unknown").b(str).a();
        this.b = (SensorRecorder) fbp.a(sensorRecorder);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.j.a(playerState);
    }

    private void b(boolean z) {
        this.b.a();
        if (!this.g.b()) {
            this.g.bd_();
        }
        if (z && this.h) {
            hps hps = this.j;
            if (hps != null) {
                hps.a();
            }
            this.a.b(this.c, 0, this.f);
        }
    }

    public final void a() {
        if (!this.i) {
            this.i = true;
            if (this.h) {
                this.b.a("aux_connected", RecordingPurpose.CLASSIFICATION, 180000);
                this.c = this.e.a();
                this.j = new hps(this.a, this.c, this.f);
                this.a.a(this.c, 0, this.f);
                this.g = this.d.a((Consumer<? super T>) new $$Lambda$jiy$eABrfbIBlTjObfAT_QhQS_i4Vz0<Object>(this), (Consumer<? super Throwable>) $$Lambda$jiy$1jIzMBYuvwDfdFEA4VFFL4y5JDA.INSTANCE);
            }
        }
    }

    public final void a(int i2) {
        this.a.a(this.c, i2);
        this.b.a("headphone_button_pressed", RecordingPurpose.TRAINING, 10000);
    }

    public final void a(boolean z) {
        if (this.h) {
            b(z);
            this.h = false;
        }
    }

    public final void b() {
        this.i = false;
        b(true);
    }

    public final void c() {
        if (!this.h) {
            this.h = true;
            if (this.i) {
                a();
            }
        }
    }
}
