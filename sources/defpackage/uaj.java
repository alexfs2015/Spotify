package defpackage;

import android.os.Handler;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.concurrent.TimeUnit;

/* renamed from: uaj reason: default package */
public final class uaj {
    private final jrp a;
    private final tzx b;
    private final vti<Player> c;
    private uah d;
    private Runnable e;
    private long f;
    private long g;
    private ObservableEmitter<Boolean> h;

    uaj(vti<Player> vti, jrp jrp, tzx tzx) {
        this.c = vti;
        this.a = jrp;
        this.b = tzx;
    }

    public final void a(TimeUnit timeUnit, long j, uah uah) {
        if (j >= 0) {
            if (c()) {
                b();
            }
            this.d = uah;
            this.f = TimeUnit.MILLISECONDS.convert(j, timeUnit);
            this.g = e();
            $$Lambda$uaj$fZ3gCRlu35RNSoEVgB07gQG8mM r4 = new $$Lambda$uaj$fZ3gCRlu35RNSoEVgB07gQG8mM(this, uah);
            tzx tzx = this.b;
            long j2 = this.f;
            tzx.a = new Handler();
            tzx.a.postDelayed(r4, j2);
            this.e = r4;
            a(Boolean.TRUE);
        }
    }

    public final long a() {
        return (this.g + this.f) - e();
    }

    private long e() {
        return this.a.c();
    }

    public final void b() {
        Runnable runnable = this.e;
        if (runnable != null) {
            this.b.a(runnable);
            f();
            a(Boolean.FALSE);
        }
    }

    public final boolean c() {
        return this.e != null;
    }

    public final Observable<Boolean> d() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$uaj$sBqx3ZTP6WmJ_H7LPiO5Gmv8ZVY<T>(this)).e(Boolean.valueOf(c()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.h = observableEmitter;
    }

    private void f() {
        this.e = null;
        this.g = 0;
        this.f = 0;
    }

    private void a(Boolean bool) {
        ObservableEmitter<Boolean> observableEmitter = this.h;
        if (observableEmitter != null) {
            observableEmitter.a(bool);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uah uah) {
        f();
        ((Player) this.c.get()).pause();
        a(Boolean.FALSE);
    }
}
