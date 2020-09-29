package defpackage;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: bte reason: default package */
public class bte extends bvm {
    final dq<bvj<?>> b = new dq<>();
    private bss f;

    public static void a(Activity activity, bss bss, bvj<?> bvj) {
        bsv a = a(activity);
        bte bte = (bte) a.a("ConnectionlessLifecycleHelper", bte.class);
        if (bte == null) {
            bte = new bte(a);
        }
        bte.f = bss;
        bwx.a(bvj, (Object) "ApiKey cannot be null");
        bte.b.add(bvj);
        bss.a(bte);
    }

    private bte(bsv bsv) {
        super(bsv);
        this.a.a("ConnectionlessLifecycleHelper", (LifecycleCallback) this);
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
        bss bss = this.f;
        synchronized (bss.b) {
            if (bss.e == this) {
                bss.e = null;
                bss.f.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ConnectionResult connectionResult, int i) {
        this.f.b(connectionResult, i);
    }

    /* access modifiers changed from: protected */
    public final void e() {
        this.f.c();
    }

    private final void g() {
        if (!this.b.isEmpty()) {
            this.f.a(this);
        }
    }
}
