package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import java.util.HashSet;
import java.util.Set;
import rx.Emitter;
import rx.Emitter.BackpressureMode;

/* renamed from: nki reason: default package */
public final class nki {
    public static final b<Object, Boolean> c = b.b("show-podcast-onboarding-home-component");
    public static final b<Object, Boolean> d = b.b("accept-redirect-uri");
    private static b<Object, Boolean> f = b.b("show-onboarding-home-header");
    public final SpSharedPreferences<Object> a;
    public Emitter<Boolean> b;
    private final Set<Emitter<Boolean>> e = new HashSet(1);

    public nki(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = (SpSharedPreferences) fbp.a(spSharedPreferences);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Emitter emitter) {
        this.b = emitter;
        this.b.onNext(Boolean.valueOf(this.a.a(c, true)));
        this.b.a((xiw) new $$Lambda$nki$h8iPFg2k64p_W9oKtzxLGyPOXIk(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Emitter emitter) {
        this.e.add(emitter);
        emitter.onNext(Boolean.valueOf(this.a.a(f, true)));
        emitter.a((xiw) new $$Lambda$nki$FesPhYtP0uNoFRCNNF2SMNBakA(this, emitter));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(Emitter emitter) {
        this.e.remove(emitter);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.b = null;
    }

    public final xii<Boolean> a() {
        return xii.a((xis<Emitter<T>>) new $$Lambda$nki$OELkYKedCJqdyOgpPvMUuZzFNqo<Emitter<T>>(this), BackpressureMode.BUFFER);
    }

    public final void a(boolean z) {
        this.a.a().a(f, z).b();
        for (Emitter onNext : this.e) {
            onNext.onNext(Boolean.valueOf(z));
        }
    }

    public final xii<Boolean> b() {
        return xii.a((xis<Emitter<T>>) new $$Lambda$nki$Mxf6qIytaGXrnUSDI44xeZVRBzk<Emitter<T>>(this), BackpressureMode.BUFFER);
    }

    public final void b(boolean z) {
        this.a.a().a(rqd.a, false).b();
    }

    public final boolean c() {
        return this.a.a(rqd.a, false);
    }
}
