package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.SensorRecorder;
import com.spotify.mobile.android.util.SensorRecorder.RecordingPurpose;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: jgj reason: default package */
public final class jgj implements jhy {
    public final hou a;
    public final SensorRecorder b;
    public String c;
    private final Flowable<PlayerState> d;
    private final rqi e;
    private Disposable f = Disposables.b();
    private boolean g;
    private boolean h;
    private hnc i;

    jgj(Flowable<PlayerState> flowable, hou hou, SensorRecorder sensorRecorder) {
        this.d = flowable;
        this.a = (hou) fay.a(hou);
        String str = "aux";
        this.e = new a(str).a(str).c("unknown").b(str).a();
        this.b = (SensorRecorder) fay.a(sensorRecorder);
    }

    public final void a(int i2) {
        this.a.a(this.c, i2);
        this.b.a("headphone_button_pressed", RecordingPurpose.TRAINING, 10000);
    }

    public final void a(boolean z) {
        if (this.g) {
            b(z);
            this.g = false;
        }
    }

    public final void c() {
        if (!this.g) {
            this.g = true;
            if (this.h) {
                a();
            }
        }
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            if (this.g) {
                this.b.a("aux_connected", RecordingPurpose.CLASSIFICATION, 180000);
                this.c = hoq.e();
                this.i = new hnc(this.a, this.c, this.e);
                this.a.a(this.c, 0, this.e);
                this.f = this.d.a((Consumer<? super T>) new $$Lambda$jgj$s2apbgaLDlp2hvaA1pa6dcls8s<Object>(this), (Consumer<? super Throwable>) $$Lambda$jgj$wlUffAe9t38yRhesyCgdT13fDs.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.i.a(playerState);
    }

    public final void b() {
        this.h = false;
        b(true);
    }

    private void b(boolean z) {
        this.b.a();
        if (!this.f.b()) {
            this.f.bf_();
        }
        if (z && this.g) {
            hnc hnc = this.i;
            if (hnc != null) {
                hnc.a();
            }
            this.a.b(this.c, 0, this.e);
        }
    }
}
