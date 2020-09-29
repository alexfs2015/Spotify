package defpackage;

import android.os.Handler;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.util.concurrent.TimeUnit;

/* renamed from: une reason: default package */
public final class une {
    private final jtz a;
    private final ums b;
    private final who<Player> c;
    private unc d;
    private Runnable e;
    private long f;
    private long g;
    private ObservableEmitter<Boolean> h;

    une(who<Player> who, jtz jtz, ums ums) {
        this.c = who;
        this.a = jtz;
        this.b = ums;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.h = observableEmitter;
    }

    private void a(Boolean bool) {
        ObservableEmitter<Boolean> observableEmitter = this.h;
        if (observableEmitter != null) {
            observableEmitter.a(bool);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(unc unc) {
        f();
        ((Player) this.c.get()).pause();
        a(Boolean.FALSE);
    }

    private long e() {
        return this.a.c();
    }

    private void f() {
        this.e = null;
        this.g = 0;
        this.f = 0;
    }

    public final long a() {
        return (this.g + this.f) - e();
    }

    public final void a(TimeUnit timeUnit, long j, unc unc) {
        if (j >= 0) {
            if (c()) {
                b();
            }
            this.d = unc;
            this.f = TimeUnit.MILLISECONDS.convert(j, timeUnit);
            this.g = e();
            $$Lambda$une$WrsDc3p6ne_A3Td0Nyx0fWjEVec r4 = new $$Lambda$une$WrsDc3p6ne_A3Td0Nyx0fWjEVec(this, unc);
            ums ums = this.b;
            long j2 = this.f;
            ums.a = new Handler();
            ums.a.postDelayed(r4, j2);
            this.e = r4;
            a(Boolean.TRUE);
        }
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
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$une$XOfEKkJ_Ll4GnS8a_dzyTO5TH8<T>(this)).e(Boolean.valueOf(c()));
    }
}
