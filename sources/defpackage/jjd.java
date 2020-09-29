package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SensorRecorder;
import com.spotify.music.libs.bluetooth.BluetoothCategorizer;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Cancellable;
import rx.internal.operators.OperatorReplay;

/* renamed from: jjd reason: default package */
public final class jjd implements jko {
    boolean a;
    final jjc b;
    final BluetoothCategorizer c;
    public jjg d;
    jix e;
    jji f;
    jjh g;
    final gvx h;
    private final kfb i;
    private final kfm j;
    private final hqu k;
    private final Flowable<PlayerState> l;
    private final xii<Boolean> m = wit.a((ObservableSource<T>) this.n, BackpressureStrategy.BUFFER);
    private final Observable<Boolean> n = Observable.a((ObservableOnSubscribe<T>) new $$Lambda$jjd$BQCArWYc03OtT6wOWGPyEF_KavE<T>(this));
    private final Observable<Boolean> o;
    private final jjs p;
    private final jjj q;
    private jjz r;
    private final iiu s;
    private final iiw t;
    private final SensorRecorder u;
    private final xil v;
    private xip w;
    private final jlr x;

    public jjd(jkp jkp, iiu iiu, iiw iiw, jlr jlr, SensorRecorder sensorRecorder, gvx gvx, BluetoothCategorizer bluetoothCategorizer, xil xil, kfb kfb, kfm kfm, hqu hqu, ocj ocj, Flowable<PlayerState> flowable) {
        this.b = jkp.l;
        this.p = jkp.d;
        this.q = jkp.n;
        this.s = (iiu) fbp.a(iiu);
        this.t = (iiw) fbp.a(iiw);
        this.x = jlr;
        this.c = bluetoothCategorizer;
        this.u = sensorRecorder;
        this.h = gvx;
        this.v = xil;
        this.i = kfb;
        this.j = kfm;
        this.k = hqu;
        this.l = flowable;
        this.o = ocj.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final ObservableEmitter observableEmitter) {
        AnonymousClass1 r0 = new jko() {
            public final void a() {
                observableEmitter.a(Boolean.TRUE);
            }

            public final void b() {
                observableEmitter.a(Boolean.FALSE);
            }
        };
        observableEmitter.a((Cancellable) new $$Lambda$jjd$cur2Z_lfGGbA6O3GifwBKk7vI(this, r0));
        this.p.a(r0);
        observableEmitter.a(Boolean.valueOf(this.p.e));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jko jko) {
        this.p.b(jko);
    }

    public final void a() {
        a aVar = this.b.a;
        if (aVar != null) {
            String str = "bluetooth";
            rzt a2 = new a(str).a(aVar.a).b(str).a();
            jlr jlr = this.x;
            this.d = new jjg(new hqy(jlr), this.k, a2, this.l);
            this.d.a();
            xii e2 = OperatorReplay.d(this.c.a(a2.c).e(BluetoothCategorizer.b).a(this.v)).e();
            this.h.a(this.m, e2);
            jix jix = new jix(wit.b(e2), this.n, this.o, this.i, this.j);
            this.e = jix;
            this.f = new jji(this.q);
            this.w = xii.a((xio<? super T>) this.f, e2);
            this.g = new jjh(e2, a2, this.s, this.u);
            this.r = new jjz(e2, a2, this.t);
            this.r.a();
        }
    }

    public final void b() {
        jjg jjg = this.d;
        if (jjg != null) {
            jjg.a(true);
            this.d = null;
        }
        jix jix = this.e;
        if (jix != null) {
            jix.a();
            this.e = null;
        }
        jji jji = this.f;
        if (jji != null) {
            if (jji.isUnsubscribed()) {
                this.q.a("bluetooth", false);
                jjh jjh = this.g;
                jjh.c.a();
                try {
                    if (jjh.a != null) {
                        jjh.b.b(jjh.a);
                    }
                } catch (JsonProcessingException e2) {
                    Assertion.a("Could not disconnect BT car as external accessory", (Throwable) e2);
                }
            } else {
                this.f.unsubscribe();
            }
            this.f = null;
            this.g.a();
        }
        this.h.a();
        jjz jjz = this.r;
        if (jjz != null) {
            try {
                jjz.b.b(jjz.a);
            } catch (JsonProcessingException e3) {
                Assertion.a("Could not disconnect BT as external accessory", (Throwable) e3);
            }
            if (jjz.c != null && !jjz.c.isUnsubscribed()) {
                jjz.c.unsubscribe();
            }
            jjz.c = null;
        }
        c();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        xip xip = this.w;
        if (xip != null && !xip.isUnsubscribed()) {
            this.w.unsubscribe();
        }
    }

    public final void d() {
        if (!this.a) {
            this.a = true;
            this.b.a(this);
            if (this.b.e) {
                a();
            } else {
                b();
            }
        }
    }
}
