package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSession.DrmSessionException;
import com.google.android.exoplayer2.drm.KeysExpiredException;
import defpackage.asf;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: arz reason: default package */
public final class arz<T extends asf> implements DrmSession<T> {
    public final List<defpackage.asc.a> a;
    final asg<T> b;
    final c<T> c;
    final int d;
    final asj e;
    final UUID f;
    final b g;
    int h;
    public byte[] i;
    defpackage.asg.c j;
    private final int k;
    private final HashMap<String, String> l;
    private final bda<asa> m;
    private int n;
    private HandlerThread o;
    private a p;
    private T q;
    private DrmSessionException r;
    private byte[] s;
    private defpackage.asg.a t;

    /* renamed from: arz$a */
    class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, Object obj, boolean z) {
            obtainMessage(i, z ? 1 : 0, 0, obj).sendToTarget();
        }

        public final void handleMessage(Message message) {
            Object obj;
            Object obj2 = message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    obj = arz.this.e.a(arz.this.f, (defpackage.asg.c) obj2);
                } else if (i == 1) {
                    obj = arz.this.e.a(arz.this.f, (defpackage.asg.a) obj2);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                boolean z = false;
                if (message.arg1 == 1) {
                    int i2 = message.arg2 + 1;
                    if (i2 <= arz.this.d) {
                        Message obtain = Message.obtain(message);
                        obtain.arg2 = i2;
                        sendMessageDelayed(obtain, (long) Math.min((i2 - 1) * 1000, CrashReportManager.TIME_WINDOW));
                        z = true;
                    }
                }
                if (!z) {
                    obj = e;
                } else {
                    return;
                }
            }
            arz.this.g.obtainMessage(message.what, Pair.create(obj2, obj)).sendToTarget();
        }
    }

    /* renamed from: arz$b */
    class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                arz arz = arz.this;
                if (obj == arz.j && (arz.h == 2 || arz.i())) {
                    arz.j = null;
                    if (obj2 instanceof Exception) {
                        arz.c.a((Exception) obj2);
                    } else {
                        try {
                            arz.b.b((byte[]) obj2);
                            arz.c.a();
                        } catch (Exception e) {
                            arz.c.a(e);
                        }
                    }
                }
            } else if (i == 1) {
                arz.a(arz.this, obj, obj2);
            }
        }
    }

    /* renamed from: arz$c */
    public interface c<T extends asf> {
        void a();

        void a(arz<T> arz);

        void a(Exception exc);
    }

    public arz(UUID uuid, asg<T> asg, c<T> cVar, List<defpackage.asc.a> list, int i2, byte[] bArr, HashMap<String, String> hashMap, asj asj, Looper looper, bda<asa> bda, int i3) {
        this.f = uuid;
        this.c = cVar;
        this.b = asg;
        this.k = i2;
        this.s = bArr;
        this.a = bArr == null ? Collections.unmodifiableList(list) : null;
        this.l = hashMap;
        this.e = asj;
        this.d = i3;
        this.m = bda;
        this.h = 2;
        this.g = new b<>(looper);
        this.o = new HandlerThread("DrmRequestHandler");
        this.o.start();
        this.p = new a<>(this.o.getLooper());
    }

    public final void a() {
        int i2 = this.n + 1;
        this.n = i2;
        if (i2 == 1 && this.h != 1 && a(true)) {
            b(true);
        }
    }

    public final boolean b() {
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 != 0) {
            return false;
        }
        this.h = 0;
        this.g.removeCallbacksAndMessages(null);
        this.p.removeCallbacksAndMessages(null);
        this.p = null;
        this.o.quit();
        this.o = null;
        this.q = null;
        this.r = null;
        this.t = null;
        this.j = null;
        byte[] bArr = this.i;
        if (bArr != null) {
            this.b.a(bArr);
            this.i = null;
            this.m.a((defpackage.bda.a<T>) $$Lambda$lJNyu9QkcGj9oCV6I1VKR_z7Qx4.INSTANCE);
        }
        return true;
    }

    public final void a(int i2) {
        if (i()) {
            if (i2 == 1) {
                this.h = 3;
                this.c.a(this);
            } else if (i2 != 2) {
                if (i2 == 3 && this.h == 4) {
                    this.h = 3;
                    c(new KeysExpiredException());
                }
            } else {
                b(false);
            }
        }
    }

    public final void c() {
        this.j = this.b.b();
        this.p.a(0, this.j, true);
    }

    public final void d() {
        if (a(false)) {
            b(true);
        }
    }

    public final void a(Exception exc) {
        c(exc);
    }

    public final int e() {
        return this.h;
    }

    public final DrmSessionException f() {
        if (this.h == 1) {
            return this.r;
        }
        return null;
    }

    public final T g() {
        return this.q;
    }

    public final Map<String, String> h() {
        byte[] bArr = this.i;
        if (bArr == null) {
            return null;
        }
        return this.b.c(bArr);
    }

    private boolean a(boolean z) {
        if (i()) {
            return true;
        }
        try {
            this.i = this.b.a();
            this.m.a((defpackage.bda.a<T>) $$Lambda$dPWXZJRsJadagzdLXl9HXxWqBmY.INSTANCE);
            this.q = this.b.d(this.i);
            this.h = 3;
            return true;
        } catch (NotProvisionedException e2) {
            if (z) {
                this.c.a(this);
            } else {
                c(e2);
            }
            return false;
        } catch (Exception e3) {
            c(e3);
            return false;
        }
    }

    private void b(boolean z) {
        int i2 = this.k;
        if (i2 == 0 || i2 == 1) {
            if (this.s == null) {
                a(1, z);
            } else if (this.h == 4 || j()) {
                long k2 = k();
                if (this.k == 0 && k2 <= 60) {
                    StringBuilder sb = new StringBuilder("Offline license has expired or will expire soon. Remaining seconds: ");
                    sb.append(k2);
                    bdd.a("DefaultDrmSession", sb.toString());
                    a(2, z);
                } else if (k2 <= 0) {
                    c(new KeysExpiredException());
                } else {
                    this.h = 4;
                    this.m.a((defpackage.bda.a<T>) $$Lambda$rFwCHtjqloYUhHWvDpz_fPi2Xz8.INSTANCE);
                }
            }
        } else if (i2 != 2) {
            if (i2 == 3 && j()) {
                a(3, z);
            }
        } else if (this.s == null) {
            a(2, z);
        } else if (j()) {
            a(2, z);
        }
    }

    private boolean j() {
        try {
            this.b.b(this.i, this.s);
            return true;
        } catch (Exception e2) {
            bdd.b("DefaultDrmSession", "Error trying to restore Widevine keys.", e2);
            c(e2);
            return false;
        }
    }

    private long k() {
        if (!apv.d.equals(this.f)) {
            return Long.MAX_VALUE;
        }
        Pair a2 = ask.a(this);
        return Math.min(((Long) a2.first).longValue(), ((Long) a2.second).longValue());
    }

    private void a(int i2, boolean z) {
        try {
            this.t = this.b.a(i2 == 3 ? this.s : this.i, this.a, i2, this.l);
            this.p.a(1, this.t, z);
        } catch (Exception e2) {
            b(e2);
        }
    }

    private void b(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.c.a(this);
        } else {
            c(exc);
        }
    }

    private void c(Exception exc) {
        this.r = new DrmSessionException(exc);
        this.m.a((defpackage.bda.a<T>) new $$Lambda$arz$_uMFQLiPmCbYRhMs_0VsozjV0<T>(exc));
        if (this.h != 4) {
            this.h = 1;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        int i2 = this.h;
        return i2 == 3 || i2 == 4;
    }

    static /* synthetic */ void a(arz arz, Object obj, Object obj2) {
        if (obj == arz.t && arz.i()) {
            arz.t = null;
            if (obj2 instanceof Exception) {
                arz.b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (arz.k == 3) {
                    arz.b.a(arz.s, bArr);
                    arz.m.a((defpackage.bda.a<T>) $$Lambda$rFwCHtjqloYUhHWvDpz_fPi2Xz8.INSTANCE);
                } else {
                    byte[] a2 = arz.b.a(arz.i, bArr);
                    if (!((arz.k != 2 && (arz.k != 0 || arz.s == null)) || a2 == null || a2.length == 0)) {
                        arz.s = a2;
                    }
                    arz.h = 4;
                    arz.m.a((defpackage.bda.a<T>) $$Lambda$uADVYXFFZJYzJbfs9JF8WDvgXd8.INSTANCE);
                }
            } catch (Exception e2) {
                arz.b(e2);
            }
        }
    }
}
