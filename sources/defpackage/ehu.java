package defpackage;

import android.os.Handler;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ehu reason: default package */
final class ehu extends eij {
    private final AtomicReference<ehs> a;
    private final Handler b;

    public ehu(ehs ehs) {
        this.a = new AtomicReference<>(ehs);
        this.b = new eix(ehs.e);
    }

    public final ehs a() {
        ehs ehs = (ehs) this.a.getAndSet(null);
        if (ehs == null) {
            return null;
        }
        ehs.w();
        return ehs;
    }

    public final void a(int i) {
        ehs a2 = a();
        if (a2 != null) {
            ehs.a.a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                a2.a(2);
            }
        }
    }

    public final void a(long j) {
        ehs ehs = (ehs) this.a.get();
        if (ehs != null) {
            ehs.a(j, 0);
        }
    }

    public final void a(long j, int i) {
        ehs ehs = (ehs) this.a.get();
        if (ehs != null) {
            ehs.a(j, i);
        }
    }

    public final void a(bnx bnx, String str, String str2, boolean z) {
        ehs ehs = (ehs) this.a.get();
        if (ehs != null) {
            ehs.n = bnx;
            ehs.B = bnx.a;
            ehs.C = str2;
            ehs.u = str;
            synchronized (ehs.H) {
                if (ehs.F != null) {
                    b b2 = ehs.F;
                    ehv ehv = new ehv(new Status(0), bnx, str, str2, z);
                    b2.a(ehv);
                    ehs.F = null;
                }
            }
        }
    }

    public final void a(ehl ehl) {
        ehs ehs = (ehs) this.a.get();
        if (ehs != null) {
            ehs.a.a("onApplicationStatusChanged", new Object[0]);
            this.b.post(new eia(ehs, ehl));
        }
    }

    public final void a(eib eib) {
        ehs ehs = (ehs) this.a.get();
        if (ehs != null) {
            ehs.a.a("onDeviceStatusChanged", new Object[0]);
            this.b.post(new ehw(ehs, eib));
        }
    }

    public final void a(String str, String str2) {
        ehs ehs = (ehs) this.a.get();
        if (ehs != null) {
            ehs.a.a("Receive (type=text, ns=%s) %s", str, str2);
            this.b.post(new ehy(ehs, str, str2));
        }
    }

    public final void a(String str, byte[] bArr) {
        if (((ehs) this.a.get()) != null) {
            ehs.a.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }
    }

    public final void b(int i) {
        ehs ehs = (ehs) this.a.get();
        if (ehs != null) {
            ehs.b(i);
        }
    }

    public final boolean b() {
        return this.a.get() == null;
    }

    public final void c() {
        ehs.a.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    public final void c(int i) {
        ehs ehs = (ehs) this.a.get();
        if (ehs != null) {
            ehs.c(i);
        }
    }

    public final void d(int i) {
        ehs ehs = (ehs) this.a.get();
        if (ehs != null) {
            ehs.c(i);
        }
    }

    public final void e(int i) {
        ehs ehs = (ehs) this.a.get();
        if (ehs != null) {
            ehs.B = null;
            ehs.C = null;
            ehs.c(i);
            if (ehs.p != null) {
                this.b.post(new ehx(ehs, i));
            }
        }
    }
}
