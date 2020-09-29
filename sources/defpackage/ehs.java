package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ehs reason: default package */
public final class ehs extends bxc<eie> {
    /* access modifiers changed from: private */
    public static final Object H = new Object();
    private static final Object I = new Object();
    public static final ein a = new ein("CastClientImpl", 0);
    private int A;
    /* access modifiers changed from: private */
    public String B;
    /* access modifiers changed from: private */
    public String C;
    private Bundle D;
    private double E;
    /* access modifiers changed from: private */
    public b<a> F;
    private b<Status> G;
    public boolean j;
    public double k;
    public final AtomicLong l = new AtomicLong(0);
    public final Map<Long, b<Status>> m = new HashMap();
    /* access modifiers changed from: private */
    public bnx n;
    /* access modifiers changed from: private */
    public final CastDevice o;
    /* access modifiers changed from: private */
    public final d p;
    /* access modifiers changed from: private */
    public final Map<String, e> q = new HashMap();
    private final long r;
    private final Bundle s;
    private ehu t;
    /* access modifiers changed from: private */
    public String u;
    private boolean v;
    private boolean w;
    private boolean x;
    private bro y;
    private int z;

    public ehs(Context context, Looper looper, bwy bwy, CastDevice castDevice, long j2, d dVar, Bundle bundle, b bVar, c cVar) {
        super(context, looper, 10, bwy, bVar, cVar);
        this.o = castDevice;
        this.p = dVar;
        this.r = j2;
        this.s = bundle;
        w();
        this.E = y();
    }

    static /* synthetic */ void a(ehs ehs, ehl ehl) {
        boolean z2;
        String str = ehl.a;
        if (!eic.a(str, ehs.u)) {
            ehs.u = str;
            z2 = true;
        } else {
            z2 = false;
        }
        a.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(ehs.v));
        if (ehs.p != null && (z2 || ehs.v)) {
            ehs.p.a();
        }
        ehs.v = false;
    }

    static /* synthetic */ void a(ehs ehs, eib eib) {
        boolean z2;
        boolean z3;
        boolean z4;
        bnx bnx = eib.d;
        if (!eic.a(bnx, ehs.n)) {
            ehs.n = bnx;
            ehs.p.a(ehs.n);
        }
        double d = eib.a;
        if (Double.isNaN(d) || Math.abs(d - ehs.k) <= 1.0E-7d) {
            z2 = false;
        } else {
            ehs.k = d;
            z2 = true;
        }
        boolean z5 = eib.b;
        if (z5 != ehs.j) {
            ehs.j = z5;
            z2 = true;
        }
        double d2 = eib.g;
        if (!Double.isNaN(d2)) {
            ehs.E = d2;
        }
        a.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(ehs.w));
        if (ehs.p != null && (z2 || ehs.w)) {
            ehs.p.b();
        }
        int i = eib.c;
        if (i != ehs.z) {
            ehs.z = i;
            z3 = true;
        } else {
            z3 = false;
        }
        a.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(ehs.w));
        if (ehs.p != null && (z3 || ehs.w)) {
            ehs.p.b(ehs.z);
        }
        int i2 = eib.e;
        if (i2 != ehs.A) {
            ehs.A = i2;
            z4 = true;
        } else {
            z4 = false;
        }
        a.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z4), Boolean.valueOf(ehs.w));
        if (ehs.p != null && (z4 || ehs.w)) {
            ehs.p.c(ehs.A);
        }
        if (!eic.a(ehs.y, eib.f)) {
            ehs.y = eib.f;
        }
        ehs.w = false;
    }

    /* access modifiers changed from: private */
    public final void w() {
        this.x = false;
        this.z = -1;
        this.A = -1;
        this.n = null;
        this.u = null;
        this.k = 0.0d;
        this.E = y();
        this.j = false;
        this.y = null;
    }

    private final void x() {
        a.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.q) {
            this.q.clear();
        }
    }

    private final double y() {
        if (this.o.a(2048)) {
            return 0.02d;
        }
        if (!this.o.a(4) || this.o.a(1)) {
            return 0.05d;
        }
        return "Chromecast Audio".equals(this.o.d) ? 0.05d : 0.02d;
    }

    public final String C_() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final Bundle a() {
        Bundle bundle = this.D;
        if (bundle == null) {
            return super.a();
        }
        this.D = null;
        return bundle;
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return queryLocalInterface instanceof eie ? (eie) queryLocalInterface : new eih(iBinder);
    }

    public final void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        a.a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i));
        if (i == 0 || i == 1001) {
            this.x = true;
            this.v = true;
            this.w = true;
        } else {
            this.x = false;
        }
        if (i == 1001) {
            this.D = new Bundle();
            this.D.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i = 0;
        }
        super.a(i, iBinder, bundle, i2);
    }

    public final void a(long j2, int i) {
        b bVar;
        synchronized (this.m) {
            bVar = (b) this.m.remove(Long.valueOf(j2));
        }
        if (bVar != null) {
            bVar.a(new Status(i));
        }
    }

    public final void a(b<a> bVar) {
        synchronized (H) {
            if (this.F != null) {
                this.F.a(new ehv(new Status(2002)));
            }
            this.F = bVar;
        }
    }

    public final void a(ConnectionResult connectionResult) {
        super.a(connectionResult);
        x();
    }

    public final void a(String str) {
        e eVar;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.q) {
                eVar = (e) this.q.remove(str);
            }
            if (eVar != null) {
                try {
                    ((eie) q()).c(str);
                    return;
                } catch (IllegalStateException e) {
                    a.a(e, "Error unregistering namespace (%s): %s", str, e.getMessage());
                }
            }
            return;
        }
        throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }

    public final void a(String str, e eVar) {
        eic.a(str);
        a(str);
        if (eVar != null) {
            synchronized (this.q) {
                this.q.put(str, eVar);
            }
            eie eie = (eie) q();
            if (t()) {
                eie.b(str);
            }
        }
    }

    public final String b() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    public final void b(int i) {
        synchronized (H) {
            if (this.F != null) {
                this.F.a(new ehv(new Status(i)));
                this.F = null;
            }
        }
    }

    public final void b(b<Status> bVar) {
        synchronized (I) {
            if (this.G != null) {
                bVar.a(new Status(2001));
            } else {
                this.G = bVar;
            }
        }
    }

    public final void c(int i) {
        synchronized (I) {
            if (this.G != null) {
                this.G.a(new Status(i));
                this.G = null;
            }
        }
    }

    public final int e() {
        return 12800000;
    }

    public final void f() {
        a.a("disconnect(); ServiceListener=%s, isConnected=%b", this.t, Boolean.valueOf(g()));
        ehu ehu = this.t;
        this.t = null;
        if (ehu == null || ehu.a() == null) {
            a.a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        x();
        try {
            ((eie) q()).a();
        } catch (RemoteException | IllegalStateException e) {
            a.a(e, "Error while disconnecting the controller interface: %s", e.getMessage());
        } finally {
            super.f();
        }
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        a.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.B, this.C);
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this.o);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.r);
        Bundle bundle2 = this.s;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.t = new ehu(this);
        bundle.putParcelable("listener", new BinderWrapper(this.t.asBinder()));
        String str = this.B;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.C;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    public final double s() {
        p();
        return this.k;
    }

    public final boolean t() {
        if (this.x) {
            ehu ehu = this.t;
            if (ehu != null && !ehu.b()) {
                return true;
            }
        }
        return false;
    }
}
