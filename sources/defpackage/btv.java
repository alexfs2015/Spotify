package defpackage;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: btv reason: default package */
public class btv extends bwd {
    final dq<bwa<?>> b = new dq<>();
    private btj f;

    private btv(btm btm) {
        super(btm);
        this.a.a("ConnectionlessLifecycleHelper", (LifecycleCallback) this);
    }

    public static void a(Activity activity, btj btj, bwa<?> bwa) {
        btm a = a(activity);
        btv btv = (btv) a.a("ConnectionlessLifecycleHelper", btv.class);
        if (btv == null) {
            btv = new btv(a);
        }
        btv.f = btj;
        bxo.a(bwa, (Object) "ApiKey cannot be null");
        btv.b.add(bwa);
        btj.a(btv);
    }

    private final void g() {
        if (!this.b.isEmpty()) {
            this.f.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ConnectionResult connectionResult, int i) {
        this.f.b(connectionResult, i);
    }

    public final void b() {
        super.b();
        g();
    }

    public final void c() {
        super.c();
        g();
    }

    public final void d() {
        super.d();
        btj btj = this.f;
        synchronized (btj.b) {
            if (btj.e == this) {
                btj.e = null;
                btj.f.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        this.f.c();
    }
}
