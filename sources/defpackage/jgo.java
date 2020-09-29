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

/* renamed from: jgo reason: default package */
public final class jgo implements jhy {
    boolean a;
    final jgn b;
    final BluetoothCategorizer c;
    public jgr d;
    jgi e;
    jgt f;
    jgs g;
    final gtx h;
    private final kda i;
    private final kdl j;
    private final Flowable<PlayerState> k;
    private final wud<Boolean> l = vun.a((ObservableSource<T>) this.m, BackpressureStrategy.BUFFER);
    private final Observable<Boolean> m = Observable.a((ObservableOnSubscribe<T>) new $$Lambda$jgo$eOYnZDWF_8wjhNeLp0wODS36cSo<T>(this));
    private final Observable<Boolean> n;
    private final jhc o;
    private final jgu p;
    private jhj q;
    private final igh r;
    private final igj s;
    private final SensorRecorder t;
    private final wug u;
    private wuk v;
    private final jjf w;

    public jgo(jhz jhz, igh igh, igj igj, jjf jjf, SensorRecorder sensorRecorder, gtx gtx, BluetoothCategorizer bluetoothCategorizer, wug wug, kda kda, kdl kdl, nvw nvw, Flowable<PlayerState> flowable) {
        this.b = jhz.l;
        this.o = jhz.d;
        this.p = jhz.n;
        this.r = (igh) fay.a(igh);
        this.s = (igj) fay.a(igj);
        this.w = jjf;
        this.c = bluetoothCategorizer;
        this.t = sensorRecorder;
        this.h = gtx;
        this.u = wug;
        this.i = kda;
        this.j = kdl;
        this.k = flowable;
        this.n = nvw.a();
    }

    public final void a() {
        a aVar = this.b.a;
        if (aVar != null) {
            String str = "bluetooth";
            rqi a2 = new a(str).a(aVar.a).b(str).a();
            jjf jjf = this.w;
            this.d = new jgr(new hou(jjf), a2, this.k);
            this.d.a();
            wud e2 = OperatorReplay.d(this.c.a(a2.c).f(BluetoothCategorizer.b).a(this.u)).e();
            this.h.a(this.l, e2);
            jgi jgi = new jgi(vun.b(e2), this.m, this.n, this.i, this.j);
            this.e = jgi;
            this.f = new jgt(this.p);
            this.v = wud.a((wuj<? super T>) this.f, e2);
            this.g = new jgs(e2, a2, this.r, this.t);
            this.q = new jhj(e2, a2, this.s);
            this.q.a();
        }
    }

    public final void b() {
        jgr jgr = this.d;
        if (jgr != null) {
            jgr.a(true);
            this.d = null;
        }
        jgi jgi = this.e;
        if (jgi != null) {
            jgi.a();
            this.e = null;
        }
        jgt jgt = this.f;
        if (jgt != null) {
            if (jgt.isUnsubscribed()) {
                this.p.a("bluetooth", false);
                jgs jgs = this.g;
                jgs.c.a();
                try {
                    if (jgs.a != null) {
                        jgs.b.b(jgs.a);
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
        jhj jhj = this.q;
        if (jhj != null) {
            try {
                jhj.b.b(jhj.a);
            } catch (JsonProcessingException e3) {
                Assertion.a("Could not disconnect BT as external accessory", (Throwable) e3);
            }
            if (jhj.c != null && !jhj.c.isUnsubscribed()) {
                jhj.c.unsubscribe();
            }
            jhj.c = null;
        }
        c();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        wuk wuk = this.v;
        if (wuk != null && !wuk.isUnsubscribed()) {
            this.v.unsubscribe();
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

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final ObservableEmitter observableEmitter) {
        AnonymousClass1 r0 = new jhy() {
            public final void a() {
                observableEmitter.a(Boolean.TRUE);
            }

            public final void b() {
                observableEmitter.a(Boolean.FALSE);
            }
        };
        observableEmitter.a((Cancellable) new $$Lambda$jgo$RMJS136pplvOEpHldXize_FID8(this, r0));
        this.o.a(r0);
        observableEmitter.a(Boolean.valueOf(this.o.e));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jhy jhy) {
        this.o.b(jhy);
    }
}
