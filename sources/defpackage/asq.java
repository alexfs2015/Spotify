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
import defpackage.asw;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: asq reason: default package */
public final class asq<T extends asw> implements DrmSession<T> {
    public final List<defpackage.ast.a> a;
    final asx<T> b;
    final c<T> c;
    final int d;
    final ata e;
    final UUID f;
    final b g;
    int h;
    public byte[] i;
    defpackage.asx.c j;
    private final int k;
    private final HashMap<String, String> l;
    private final bdr<asr> m;
    private int n;
    private HandlerThread o;
    private a p;
    private T q;
    private DrmSessionException r;
    private byte[] s;
    private defpackage.asx.a t;

    /* renamed from: asq$a */
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
                    obj = asq.this.e.a(asq.this.f, (defpackage.asx.c) obj2);
                } else if (i == 1) {
                    obj = asq.this.e.a(asq.this.f, (defpackage.asx.a) obj2);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                boolean z = false;
                if (message.arg1 == 1) {
                    int i2 = message.arg2 + 1;
                    if (i2 <= asq.this.d) {
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
            asq.this.g.obtainMessage(message.what, Pair.create(obj2, obj)).sendToTarget();
        }
    }

    /* renamed from: asq$b */
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
                asq asq = asq.this;
                if (obj == asq.j && (asq.h == 2 || asq.i())) {
                    asq.j = null;
                    if (obj2 instanceof Exception) {
                        asq.c.a((Exception) obj2);
                    } else {
                        try {
                            asq.b.b((byte[]) obj2);
                            asq.c.a();
                        } catch (Exception e) {
                            asq.c.a(e);
                        }
                    }
                }
            } else if (i == 1) {
                asq.a(asq.this, obj, obj2);
            }
        }
    }

    /* renamed from: asq$c */
    public interface c<T extends asw> {
        void a();

        void a(asq<T> asq);

        void a(Exception exc);
    }

    public asq(UUID uuid, asx<T> asx, c<T> cVar, List<defpackage.ast.a> list, int i2, byte[] bArr, HashMap<String, String> hashMap, ata ata, Looper looper, bdr<asr> bdr, int i3) {
        this.f = uuid;
        this.c = cVar;
        this.b = asx;
        this.k = i2;
        this.s = bArr;
        this.a = bArr == null ? Collections.unmodifiableList(list) : null;
        this.l = hashMap;
        this.e = ata;
        this.d = i3;
        this.m = bdr;
        this.h = 2;
        this.g = new b<>(looper);
        this.o = new HandlerThread("DrmRequestHandler");
        this.o.start();
        this.p = new a<>(this.o.getLooper());
    }

    private void a(int i2, boolean z) {
        try {
            this.t = this.b.a(i2 == 3 ? this.s : this.i, this.a, i2, this.l);
            this.p.a(1, this.t, z);
        } catch (Exception e2) {
            b(e2);
        }
    }

    static /* synthetic */ void a(asq asq, Object obj, Object obj2) {
        if (obj == asq.t && asq.i()) {
            asq.t = null;
            if (obj2 instanceof Exception) {
                asq.b((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (asq.k == 3) {
                    asq.b.a(asq.s, bArr);
                    asq.m.a((defpackage.bdr.a<T>) $$Lambda$0avrYZOp6dyvT1ok_bRRKbTe2M.INSTANCE);
                } else {
                    byte[] a2 = asq.b.a(asq.i, bArr);
                    if (!((asq.k != 2 && (asq.k != 0 || asq.s == null)) || a2 == null || a2.length == 0)) {
                        asq.s = a2;
                    }
                    asq.h = 4;
                    asq.m.a((defpackage.bdr.a<T>) $$Lambda$BNAoQd4SpJSrWc97aNk5_vWsuY.INSTANCE);
                }
            } catch (Exception e2) {
                asq.b(e2);
            }
        }
    }

    private boolean a(boolean z) {
        if (i()) {
            return true;
        }
        try {
            this.i = this.b.a();
            this.m.a((defpackage.bdr.a<T>) $$Lambda$cgFOt5LMbUA5Mf8ddzKYnteiTLM.INSTANCE);
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

    private void b(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.c.a(this);
        } else {
            c(exc);
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
                    bdu.a("DefaultDrmSession", sb.toString());
                    a(2, z);
                } else if (k2 <= 0) {
                    c(new KeysExpiredException());
                } else {
                    this.h = 4;
                    this.m.a((defpackage.bdr.a<T>) $$Lambda$0avrYZOp6dyvT1ok_bRRKbTe2M.INSTANCE);
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

    private void c(Exception exc) {
        this.r = new DrmSessionException(exc);
        this.m.a((defpackage.bdr.a<T>) new $$Lambda$asq$RR1x6PMGXUnPkTn4CvpzQw3h0<T>(exc));
        if (this.h != 4) {
            this.h = 1;
        }
    }

    private boolean j() {
        try {
            this.b.b(this.i, this.s);
            return true;
        } catch (Exception e2) {
            bdu.b("DefaultDrmSession", "Error trying to restore Widevine keys.", e2);
            c(e2);
            return false;
        }
    }

    private long k() {
        if (!aqm.d.equals(this.f)) {
            return Long.MAX_VALUE;
        }
        Pair a2 = atb.a(this);
        return Math.min(((Long) a2.first).longValue(), ((Long) a2.second).longValue());
    }

    public final void a() {
        int i2 = this.n + 1;
        this.n = i2;
        if (i2 == 1 && this.h != 1 && a(true)) {
            b(true);
        }
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

    public final void a(Exception exc) {
        c(exc);
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
            this.m.a((defpackage.bdr.a<T>) $$Lambda$urp8PVCDkuI6IwlHF6xpr2zNQk.INSTANCE);
        }
        return true;
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

    /* access modifiers changed from: 0000 */
    public boolean i() {
        int i2 = this.h;
        return i2 == 3 || i2 == 4;
    }
}
