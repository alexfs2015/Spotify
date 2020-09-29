package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bwd reason: default package */
public abstract class bwd extends LifecycleCallback implements OnCancelListener {
    private final Handler b;
    protected volatile boolean c;
    protected final AtomicReference<bwe> d;
    protected final bso e;

    protected bwd(btm btm) {
        this(btm, bso.a());
    }

    private bwd(btm btm, bso bso) {
        super(btm);
        this.d = new AtomicReference<>(null);
        this.b = new egv(Looper.getMainLooper());
        this.e = bso;
    }

    private static int a(bwe bwe) {
        if (bwe == null) {
            return -1;
        }
        return bwe.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<bwe> r0 = r3.d
            java.lang.Object r0 = r0.get()
            bwe r0 = (defpackage.bwe) r0
            r1 = 1
            r2 = 0
            if (r4 == r1) goto L_0x002c
            r5 = 2
            if (r4 == r5) goto L_0x0010
            goto L_0x0051
        L_0x0010:
            bso r4 = r3.e
            android.app.Activity r5 = r3.a()
            int r4 = r4.a(r5)
            if (r4 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.gms.common.ConnectionResult r5 = r0.b
            int r5 = r5.b
            r6 = 18
            if (r5 != r6) goto L_0x0052
            if (r4 != r6) goto L_0x0052
            return
        L_0x002c:
            r4 = -1
            if (r5 != r4) goto L_0x0030
            goto L_0x0052
        L_0x0030:
            if (r5 != 0) goto L_0x0051
            r4 = 13
            if (r6 == 0) goto L_0x003c
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r4 = r6.getIntExtra(r5, r4)
        L_0x003c:
            bwe r5 = new bwe
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r6.<init>(r4, r1)
            int r4 = a(r0)
            r5.<init>(r6, r4)
            java.util.concurrent.atomic.AtomicReference<bwe> r4 = r3.d
            r4.set(r5)
            r0 = r5
        L_0x0051:
            r1 = 0
        L_0x0052:
            if (r1 == 0) goto L_0x0058
            r3.f()
            return
        L_0x0058:
            if (r0 == 0) goto L_0x0061
            com.google.android.gms.common.ConnectionResult r4 = r0.b
            int r5 = r0.a
            r3.a(r4, r5)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwd.a(int, int, android.content.Intent):void");
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.d.set(bundle.getBoolean("resolving_error", false) ? new bwe(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(ConnectionResult connectionResult, int i);

    public void b() {
        super.b();
        this.c = true;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        bwe bwe = (bwe) this.d.get();
        if (bwe != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", bwe.a);
            bundle.putInt("failed_status", bwe.b.b);
            bundle.putParcelable("failed_resolution", bwe.b.c);
        }
    }

    public final void b(ConnectionResult connectionResult, int i) {
        bwe bwe = new bwe(connectionResult, i);
        if (this.d.compareAndSet(null, bwe)) {
            this.b.post(new bwf(this, bwe));
        }
    }

    public void d() {
        super.d();
        this.c = false;
    }

    /* access modifiers changed from: protected */
    public abstract void e();

    /* access modifiers changed from: protected */
    public final void f() {
        this.d.set(null);
        e();
    }

    public void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, null), a((bwe) this.d.get()));
        f();
    }
}
