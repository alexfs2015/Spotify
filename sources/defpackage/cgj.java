package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;

@cfp
/* renamed from: cgj reason: default package */
public final class cgj extends cgf implements a, b {
    private Context a;
    private cpp b;
    private cqv<cgl> c;
    private final cgd d;
    private final Object e = new Object();
    private cgk f;

    public cgj(Context context, cpp cpp, cqv<cgl> cqv, cgd cgd) {
        super(cqv, cgd);
        this.a = context;
        this.b = cpp;
        this.c = cqv;
        this.d = cgd;
        this.f = new cgk(context, ((Boolean) dqe.f().a(dtg.G)).booleanValue() ? bkc.t().a() : context.getMainLooper(), this, this);
        this.f.l();
    }

    public final void a() {
        synchronized (this.e) {
            if (this.f.g() || this.f.h()) {
                this.f.f();
            }
            Binder.flushPendingCommands();
        }
    }

    public final void a(int i) {
        cpn.a(3);
    }

    public final void a(Bundle bundle) {
        c();
    }

    public final void a(ConnectionResult connectionResult) {
        cpn.a(3);
        new cgi(this.a, this.c, this.d).c();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        bkc.e().b(this.a, this.b.a, "gmob-apps", bundle, true);
    }

    public final cgt d() {
        cgt s;
        synchronized (this.e) {
            try {
                s = this.f.s();
            } catch (DeadObjectException | IllegalStateException unused) {
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s;
    }
}
