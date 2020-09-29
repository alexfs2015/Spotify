package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: gtt reason: default package */
public final class gtt implements gts {
    private static b<Object, Boolean> a = b.a("local_devices_only");
    private final SpSharedPreferences<Object> b;
    private final CompositeDisposable c = new CompositeDisposable();
    private final jwo d;
    private boolean e;
    private boolean f;

    public gtt(SpSharedPreferences<Object> spSharedPreferences, jwo jwo) {
        this.b = (SpSharedPreferences) fbp.a(spSharedPreferences);
        this.d = (jwo) fbp.a(jwo);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        a(bool.booleanValue());
        d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        a(false);
        d();
    }

    private void d() {
        if (this.e) {
            this.e = false;
            this.c.c();
        }
    }

    public final void a() {
        if (this.b.e(a)) {
            this.f = this.b.a(a);
            return;
        }
        this.e = true;
        this.c.c();
        this.c.a(this.d.n.c((Function<? super T, ? extends R>) $$Lambda$Tvr7rtz5EckunWLTB7hVRXvnoBo.INSTANCE).a((Consumer<? super T>) new $$Lambda$gtt$7y7Q70xdNjebz7wSXd8LUcVAuls<Object>(this), (Consumer<? super Throwable>) new $$Lambda$gtt$sB_l5pp2R9yFTjBITbzgaqURTQ<Object>(this)));
    }

    public final void a(boolean z) {
        this.b.a().a(a, z).a();
        this.f = this.b.a(a);
    }

    public final boolean b() {
        return this.f;
    }

    public final void c() {
        d();
    }
}
