package defpackage;

import android.os.Handler;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ehd reason: default package */
final class ehd extends ehs {
    private final AtomicReference<ehb> a;
    private final Handler b;

    public ehd(ehb ehb) {
        this.a = new AtomicReference<>(ehb);
        this.b = new eig(ehb.e);
    }

    public final ehb a() {
        ehb ehb = (ehb) this.a.getAndSet(null);
        if (ehb == null) {
            return null;
        }
        ehb.w();
        return ehb;
    }

    public final boolean b() {
        return this.a.get() == null;
    }

    public final void a(int i) {
        ehb a2 = a();
        if (a2 != null) {
            ehb.a.a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                a2.a(2);
            }
        }
    }

    public final void a(bng bng, String str, String str2, boolean z) {
        ehb ehb = (ehb) this.a.get();
        if (ehb != null) {
            ehb.n = bng;
            ehb.B = bng.a;
            ehb.C = str2;
            ehb.u = str;
            synchronized (ehb.H) {
                if (ehb.F != null) {
                    b b2 = ehb.F;
                    ehe ehe = new ehe(new Status(0), bng, str, str2, z);
                    b2.a(ehe);
                    ehb.F = null;
                }
            }
        }
    }

    public final void b(int i) {
        ehb ehb = (ehb) this.a.get();
        if (ehb != null) {
            ehb.b(i);
        }
    }

    public final void c(int i) {
        ehb ehb = (ehb) this.a.get();
        if (ehb != null) {
            ehb.c(i);
        }
    }

    public final void d(int i) {
        ehb ehb = (ehb) this.a.get();
        if (ehb != null) {
            ehb.c(i);
        }
    }

    public final void e(int i) {
        ehb ehb = (ehb) this.a.get();
        if (ehb != null) {
            ehb.B = null;
            ehb.C = null;
            ehb.c(i);
            if (ehb.p != null) {
                this.b.post(new ehg(ehb, i));
            }
        }
    }

    public final void c() {
        ehb.a.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    public final void a(ehk ehk) {
        ehb ehb = (ehb) this.a.get();
        if (ehb != null) {
            ehb.a.a("onDeviceStatusChanged", new Object[0]);
            this.b.post(new ehf(ehb, ehk));
        }
    }

    public final void a(egu egu) {
        ehb ehb = (ehb) this.a.get();
        if (ehb != null) {
            ehb.a.a("onApplicationStatusChanged", new Object[0]);
            this.b.post(new ehj(ehb, egu));
        }
    }

    public final void a(String str, String str2) {
        ehb ehb = (ehb) this.a.get();
        if (ehb != null) {
            ehb.a.a("Receive (type=text, ns=%s) %s", str, str2);
            this.b.post(new ehh(ehb, str, str2));
        }
    }

    public final void a(String str, byte[] bArr) {
        if (((ehb) this.a.get()) != null) {
            ehb.a.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }
    }

    public final void a(long j, int i) {
        ehb ehb = (ehb) this.a.get();
        if (ehb != null) {
            ehb.a(j, i);
        }
    }

    public final void a(long j) {
        ehb ehb = (ehb) this.a.get();
        if (ehb != null) {
            ehb.a(j, 0);
        }
    }
}
