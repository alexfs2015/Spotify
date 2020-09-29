package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.HashSet;
import java.util.Set;
import rx.Emitter;
import rx.Emitter.BackpressureMode;

/* renamed from: net reason: default package */
public final class net {
    public static final b<Object, Boolean> c = b.b("show-podcast-onboarding-home-component");
    public static final b<Object, Boolean> d = b.b("accept-redirect-uri");
    private static b<Object, Boolean> f = b.b("show-onboarding-home-header");
    public final SpSharedPreferences<Object> a;
    public Emitter<Boolean> b;
    private final Set<Emitter<Boolean>> e = new HashSet(1);

    public net(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = (SpSharedPreferences) fay.a(spSharedPreferences);
    }

    public final void a(boolean z) {
        this.a.a().a(f, z).b();
        for (Emitter onNext : this.e) {
            onNext.onNext(Boolean.valueOf(z));
        }
    }

    public final wud<Boolean> a() {
        return wud.a((wun<Emitter<T>>) new $$Lambda$net$eoXVgZkMTTrm7wZX80HmzlnoKco<Emitter<T>>(this), BackpressureMode.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Emitter emitter) {
        this.e.add(emitter);
        emitter.onNext(Boolean.valueOf(this.a.a(f, true)));
        emitter.a((wur) new $$Lambda$net$VxzqKmJca1T4bcCoKu1IAqYraWs(this, emitter));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Emitter emitter) {
        this.e.remove(emitter);
    }

    public final wud<Boolean> b() {
        return wud.a((wun<Emitter<T>>) new $$Lambda$net$PLSrxZkThpHyoYiAMUXA14tu5UQ<Emitter<T>>(this), BackpressureMode.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Emitter emitter) {
        this.b = emitter;
        this.b.onNext(Boolean.valueOf(this.a.a(c, true)));
        this.b.a((wur) new $$Lambda$net$S4rdeFS5ZIHixHJ2qGqZxqw7CDA(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.b = null;
    }

    public final boolean c() {
        return this.a.a(rhb.a, false);
    }

    public final void b(boolean z) {
        this.a.a().a(rhb.a, false).b();
    }
}
