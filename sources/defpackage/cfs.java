package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;

@cey
/* renamed from: cfs reason: default package */
public final class cfs extends cfo implements a, b {
    private Context a;
    private coy b;
    private cqe<cfu> c;
    private final cfm d;
    private final Object e = new Object();
    private cft f;

    public cfs(Context context, coy coy, cqe<cfu> cqe, cfm cfm) {
        super(cqe, cfm);
        this.a = context;
        this.b = coy;
        this.c = cqe;
        this.d = cfm;
        this.f = new cft(context, ((Boolean) dpn.f().a(dsp.G)).booleanValue() ? bjl.t().a() : context.getMainLooper(), this, this);
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

    public final void a(Bundle bundle) {
        c();
    }

    public final cgc d() {
        cgc s;
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

    public final void a(ConnectionResult connectionResult) {
        cow.a(3);
        new cfr(this.a, this.c, this.d).c();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        bjl.e().b(this.a, this.b.a, "gmob-apps", bundle, true);
    }

    public final void a(int i) {
        cow.a(3);
    }
}
