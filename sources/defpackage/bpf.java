package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.zzds;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: bpf reason: default package */
public final class bpf implements defpackage.bny.e {
    public bsy a;
    public final List<b> b = new CopyOnWriteArrayList();
    final List<a> c = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */
    public final Object d = new Object();
    private final Handler e = new eix(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final eim f;
    private final e g = new e();
    /* access modifiers changed from: private */
    public final defpackage.bny.b h;
    private final bpb i;
    private final Map<Object, i> j = new ConcurrentHashMap();
    private final Map<Long, i> k = new ConcurrentHashMap();

    /* renamed from: bpf$a */
    public static abstract class a {
        public void a() {
        }

        public void a(int[] iArr) {
        }

        public void a(int[] iArr, int i) {
        }

        public void a(bof[] bofArr) {
        }

        public void b(int[] iArr) {
        }

        public void c(int[] iArr) {
        }
    }

    @Deprecated
    /* renamed from: bpf$b */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    /* renamed from: bpf$c */
    public interface c extends btc {
    }

    /* renamed from: bpf$d */
    public interface d {
        boolean a();

        List<bnv> b();
    }

    /* renamed from: bpf$e */
    class e implements eiq {
        bsy a;
        private long c = 0;

        public e() {
        }

        public final long a() {
            long j = this.c + 1;
            this.c = j;
            return j;
        }

        public final void a(String str, String str2, long j) {
            if (this.a != null) {
                bpf.this.h.a(this.a, str, str2).a((btd<? super R>) new bpp<Object>(this, j));
                return;
            }
            throw new IllegalStateException("No GoogleApiClient available");
        }
    }

    /* renamed from: bpf$f */
    static class f extends BasePendingResult<c> {
        f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final c a(Status status) {
            return new bpq(status);
        }
    }

    /* renamed from: bpf$g */
    abstract class g extends ehm<c> {
        eis a;
        private final boolean e;

        g(bpf bpf, bsy bsy) {
            this(bsy, false);
        }

        g(bsy bsy, boolean z) {
            super(bsy);
            this.e = z;
            this.a = new bpr(this, bpf.this);
        }

        public final /* synthetic */ btc a(Status status) {
            return new bps(status);
        }

        /* access modifiers changed from: 0000 */
        public abstract void a();

        public final /* synthetic */ void a(defpackage.bst.b bVar) {
            if (!this.e) {
                Iterator it = bpf.this.b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                Iterator it2 = bpf.this.c.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
            try {
                synchronized (bpf.this.d) {
                    a();
                }
            } catch (zzds unused) {
                a((c) a(new Status(2100)));
            }
        }
    }

    /* renamed from: bpf$h */
    static final class h implements c {
        private final Status a;
        private final JSONObject b;

        h(Status status, JSONObject jSONObject) {
            this.a = status;
            this.b = jSONObject;
        }

        public final Status B_() {
            return this.a;
        }
    }

    /* renamed from: bpf$i */
    class i {
        final Set<Object> a;
        final long b;
        final Runnable c;
        boolean d;
        final /* synthetic */ bpf e;
    }

    static {
        String str = eim.e;
    }

    public bpf(eim eim, defpackage.bny.b bVar) {
        this.h = bVar;
        this.f = (eim) bxo.a(eim);
        this.f.i = new bqf(this);
        eim eim2 = this.f;
        eim2.d = this.g;
        if (eim2.d == null) {
            eim2.a();
        }
        this.i = new bpb(this);
    }

    public static bsz<c> a(int i2, String str) {
        f fVar = new f();
        fVar.a(fVar.a(new Status(17, null)));
        return fVar;
    }

    private bsz<c> a(bog bog) {
        bxo.b("Must be called from the main thread.");
        return !n() ? a(17, (String) null) : a((g) new bpo(this, this.a, bog));
    }

    static /* synthetic */ void a(bpf bpf) {
        for (i iVar : bpf.k.values()) {
            if (bpf.v() && !iVar.d) {
                iVar.e.e.removeCallbacks(iVar.c);
                iVar.d = true;
                iVar.e.e.postDelayed(iVar.c, iVar.b);
            } else if (!bpf.v() && iVar.d) {
                iVar.e.e.removeCallbacks(iVar.c);
                iVar.d = false;
            }
            if (iVar.d && (bpf.t() || bpf.s() || bpf.u())) {
                HashSet hashSet = new HashSet(iVar.a);
                if (bpf.r() || bpf.s() || bpf.t()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        it.next();
                        bpf.d();
                        bpf.e();
                    }
                } else if (bpf.u()) {
                    bxo.b("Must be called from the main thread.");
                    boh f2 = bpf.f();
                    bof a2 = f2 == null ? null : f2.a(f2.h);
                    if (!(a2 == null || a2.a == null)) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                    }
                } else {
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                }
            }
        }
    }

    static /* synthetic */ d c(bpf bpf) {
        return null;
    }

    private bsz<c> o() {
        bxo.b("Must be called from the main thread.");
        return !n() ? a(17, (String) null) : a((g) new bpl(this, this.a, null));
    }

    private bsz<c> p() {
        bxo.b("Must be called from the main thread.");
        return !n() ? a(17, (String) null) : a((g) new bpm(this, this.a, null));
    }

    private int q() {
        int i2;
        synchronized (this.d) {
            bxo.b("Must be called from the main thread.");
            boh f2 = f();
            i2 = f2 != null ? f2.f : 0;
        }
        return i2;
    }

    private boolean r() {
        bxo.b("Must be called from the main thread.");
        boh f2 = f();
        return f2 != null && f2.e == 2;
    }

    private boolean s() {
        bxo.b("Must be called from the main thread.");
        boh f2 = f();
        return f2 != null && (f2.e == 3 || (j() && q() == 2));
    }

    private boolean t() {
        bxo.b("Must be called from the main thread.");
        boh f2 = f();
        return f2 != null && f2.e == 4;
    }

    private boolean u() {
        bxo.b("Must be called from the main thread.");
        boh f2 = f();
        return (f2 == null || f2.h == 0) ? false : true;
    }

    private boolean v() {
        bxo.b("Must be called from the main thread.");
        return t() || r() || s() || u();
    }

    public final g a(g gVar) {
        try {
            this.a.b(gVar);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Throwable unused) {
            gVar.a((c) gVar.a(new Status(2100)));
        }
        return gVar;
    }

    @Deprecated
    public final bsz<c> a(long j2, int i2, JSONObject jSONObject) {
        defpackage.bog.a aVar = new defpackage.bog.a();
        aVar.a = j2;
        aVar.b = 0;
        aVar.c = null;
        return a(aVar.a());
    }

    public final void a() {
        bsy bsy = this.a;
        if (bsy != null) {
            this.h.a(bsy, m(), (defpackage.bny.e) this);
        }
    }

    public final void a(a aVar) {
        bxo.b("Must be called from the main thread.");
        if (aVar != null) {
            this.c.add(aVar);
        }
    }

    public final void a(bsy bsy) {
        bsy bsy2 = this.a;
        if (bsy2 != bsy) {
            if (bsy2 != null) {
                this.f.a();
                try {
                    this.h.b(this.a, m());
                } catch (IOException unused) {
                }
                this.g.a = null;
                this.e.removeCallbacksAndMessages(null);
            }
            this.a = bsy;
            bsy bsy3 = this.a;
            if (bsy3 != null) {
                this.g.a = bsy3;
            }
        }
    }

    public final void a(CastDevice castDevice, String str) {
        this.f.a(str);
    }

    public final bsz<c> b() {
        bxo.b("Must be called from the main thread.");
        return !n() ? a(17, (String) null) : a((g) new bpn(this, this.a, null));
    }

    public final bsz<c> c() {
        bxo.b("Must be called from the main thread.");
        return !n() ? a(17, (String) null) : a((g) new bqg(this, this.a));
    }

    public final long d() {
        long j2;
        synchronized (this.d) {
            bxo.b("Must be called from the main thread.");
            eim eim = this.f;
            MediaInfo d2 = eim.d();
            j2 = 0;
            if (d2 != null) {
                if (eim.h != null) {
                    if (eim.h.equals(Long.valueOf(4294967296000L))) {
                        if (eim.g.l != null) {
                            long longValue = eim.h.longValue();
                            if (eim.g != null) {
                                bob bob = eim.g.l;
                                if (bob != null) {
                                    long j3 = bob.a;
                                    j2 = !bob.b ? eim.a(1.0d, j3, -1) : j3;
                                }
                            }
                            j2 = Math.min(longValue, j2);
                        } else if (eim.c() >= 0) {
                            j2 = Math.min(eim.h.longValue(), eim.c());
                        }
                    }
                    j2 = eim.h.longValue();
                } else if (eim.f != 0) {
                    double d3 = eim.g.d;
                    long j4 = eim.g.g;
                    int i2 = eim.g.e;
                    if (d3 != 0.0d) {
                        if (i2 == 2) {
                            j2 = eim.a(d3, j4, d2.c);
                        }
                    }
                    j2 = j4;
                }
            }
        }
        return j2;
    }

    public final long e() {
        long c2;
        synchronized (this.d) {
            bxo.b("Must be called from the main thread.");
            c2 = this.f.c();
        }
        return c2;
    }

    public final boh f() {
        boh boh;
        synchronized (this.d) {
            bxo.b("Must be called from the main thread.");
            boh = this.f.g;
        }
        return boh;
    }

    public final bpb g() {
        bpb bpb;
        synchronized (this.d) {
            bxo.b("Must be called from the main thread.");
            bpb = this.i;
        }
        return bpb;
    }

    public final MediaInfo h() {
        MediaInfo d2;
        synchronized (this.d) {
            bxo.b("Must be called from the main thread.");
            d2 = this.f.d();
        }
        return d2;
    }

    public final int i() {
        int i2;
        synchronized (this.d) {
            bxo.b("Must be called from the main thread.");
            boh f2 = f();
            i2 = f2 != null ? f2.e : 1;
        }
        return i2;
    }

    public final boolean j() {
        bxo.b("Must be called from the main thread.");
        MediaInfo h2 = h();
        return h2 != null && h2.a == 2;
    }

    public final void k() {
        bxo.b("Must be called from the main thread.");
        int i2 = i();
        if (i2 == 4 || i2 == 2) {
            o();
        } else {
            p();
        }
    }

    public final boolean l() {
        bxo.b("Must be called from the main thread.");
        boh f2 = f();
        return f2 != null && f2.k;
    }

    public final String m() {
        bxo.b("Must be called from the main thread.");
        return this.f.c;
    }

    public final boolean n() {
        return this.a != null;
    }
}
