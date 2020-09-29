package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: mdb reason: default package */
public final class mdb {
    private static b<Object, Long> a = b.b("churn_locked_state_unlocked_at");
    private static final long b = TimeUnit.HOURS.toMillis(24);
    private final hed c;
    private final SpSharedPreferences<Object> d;
    private final heg e;
    private final jrp f;

    public mdb(hed hed, SpSharedPreferences<Object> spSharedPreferences, heg heg, jrp jrp) {
        this.c = hed;
        this.d = spSharedPreferences;
        this.e = heg;
        this.f = jrp;
    }

    public final wud<Boolean> a() {
        return wud.a((Callable<? extends T>) new $$Lambda$mdb$FG8xggC0toqLScqs8U6howdCTrw<Object>(this)).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$mdb$taClnpLYV4czpGKCafR2j5k7zEs<Object,Object>(this)).b(vun.a(this.e.a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Long c() {
        return Long.valueOf(this.d.a(a, this.f.a() - b));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Long l) {
        if (this.f.a() - l.longValue() < b) {
            return ScalarSynchronousObservable.d(Boolean.FALSE);
        }
        return this.c.a("payments-locked-state").f(new $$Lambda$57qjxmYDaaOcXK34YDXTPaU2AA("1"));
    }

    public final void b() {
        this.d.a().a(a, this.f.a()).b();
    }
}
