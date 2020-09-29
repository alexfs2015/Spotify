package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: mhe reason: default package */
public final class mhe {
    private static b<Object, Long> a = b.b("churn_locked_state_unlocked_at");
    private static final long b = TimeUnit.HOURS.toMillis(24);
    private final hgz c;
    private final SpSharedPreferences<Object> d;
    private final hhc e;
    private final jtz f;

    public mhe(hgz hgz, SpSharedPreferences<Object> spSharedPreferences, hhc hhc, jtz jtz) {
        this.c = hgz;
        this.d = spSharedPreferences;
        this.e = hhc;
        this.f = jtz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Long l) {
        return this.f.a() - l.longValue() < b ? ScalarSynchronousObservable.d(Boolean.FALSE) : this.c.a("payments-locked-state").e((xiy<? super T, ? extends R>) new $$Lambda$C8qANqYKwvsa_phYYFwkFv3_Ghw<Object,Object>("1"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Long c() {
        return Long.valueOf(this.d.a(a, this.f.a() - b));
    }

    public final xii<Boolean> a() {
        return xii.a((Callable<? extends T>) new $$Lambda$mhe$BvMOvpzBmZb59cwItpyJgnzq0<Object>(this)).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$mhe$O4w9h5gicY4K8FBvdyKQ6U839g<Object,Object>(this)).b(wit.a(this.e.a()));
    }

    public final void b() {
        this.d.a().a(a, this.f.a()).b();
    }
}
