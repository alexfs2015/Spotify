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

/* renamed from: boo reason: default package */
public final class boo implements defpackage.bnh.e {
    public bsh a;
    public final List<b> b = new CopyOnWriteArrayList();
    final List<a> c = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */
    public final Object d = new Object();
    private final Handler e = new eig(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public final ehv f;
    private final e g = new e();
    /* access modifiers changed from: private */
    public final defpackage.bnh.b h;
    private final bok i;
    private final Map<Object, i> j = new ConcurrentHashMap();
    private final Map<Long, i> k = new ConcurrentHashMap();

    /* renamed from: boo$a */
    public static abstract class a {
        public void a() {
        }

        public void a(int[] iArr) {
        }

        public void a(int[] iArr, int i) {
        }

        public void a(bno[] bnoArr) {
        }

        public void b(int[] iArr) {
        }

        public void c(int[] iArr) {
        }
    }

    @Deprecated
    /* renamed from: boo$b */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    /* renamed from: boo$c */
    public interface c extends bsl {
    }

    /* renamed from: boo$d */
    public interface d {
        boolean a();

        List<bne> b();
    }

    /* renamed from: boo$e */
    class e implements ehz {
        bsh a;
        private long c = 0;

        public e() {
        }

        public final void a(String str, String str2, long j) {
            if (this.a != null) {
                boo.this.h.a(this.a, str, str2).a((bsm<? super R>) new boy<Object>(this, j));
                return;
            }
            throw new IllegalStateException("No GoogleApiClient available");
        }

        public final long a() {
            long j = this.c + 1;
            this.c = j;
            return j;
        }
    }

    /* renamed from: boo$f */
    static class f extends BasePendingResult<c> {
        f() {
            super(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final c a(Status status) {
            return new boz(status);
        }
    }

    /* renamed from: boo$g */
    abstract class g extends egv<c> {
        eib a;
        private final boolean e;

        g(boo boo, bsh bsh) {
            this(bsh, false);
        }

        /* access modifiers changed from: 0000 */
        public abstract void a();

        g(bsh bsh, boolean z) {
            super(bsh);
            this.e = z;
            this.a = new bpa(this, boo.this);
        }

        public final /* synthetic */ void a(defpackage.bsc.b bVar) {
            if (!this.e) {
                Iterator it = boo.this.b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                Iterator it2 = boo.this.c.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
            try {
                synchronized (boo.this.d) {
                    a();
                }
            } catch (zzds unused) {
                a((c) a(new Status(2100)));
            }
        }

        public final /* synthetic */ bsl a(Status status) {
            return new bpb(status);
        }
    }

    /* renamed from: boo$h */
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

    /* renamed from: boo$i */
    class i {
        final Set<Object> a;
        final long b;
        final Runnable c;
        boolean d;
        final /* synthetic */ boo e;
    }

    public boo(ehv ehv, defpackage.bnh.b bVar) {
        this.h = bVar;
        this.f = (ehv) bwx.a(ehv);
        this.f.i = new bpo(this);
        ehv ehv2 = this.f;
        ehv2.d = this.g;
        if (ehv2.d == null) {
            ehv2.a();
        }
        this.i = new bok(this);
    }

    static /* synthetic */ d c(boo boo) {
        return null;
    }

    public final void a(bsh bsh) {
        bsh bsh2 = this.a;
        if (bsh2 != bsh) {
            if (bsh2 != null) {
                this.f.a();
                try {
                    this.h.b(this.a, m());
                } catch (IOException unused) {
                }
                this.g.a = null;
                this.e.removeCallbacksAndMessages(null);
            }
            this.a = bsh;
            bsh bsh3 = this.a;
            if (bsh3 != null) {
                this.g.a = bsh3;
            }
        }
    }

    public final void a() {
        bsh bsh = this.a;
        if (bsh != null) {
            this.h.a(bsh, m(), (defpackage.bnh.e) this);
        }
    }

    @Deprecated
    public final bsi<c> a(long j2, int i2, JSONObject jSONObject) {
        defpackage.bnp.a aVar = new defpackage.bnp.a();
        aVar.a = j2;
        aVar.b = 0;
        aVar.c = null;
        return a(aVar.a());
    }

    private bsi<c> a(bnp bnp) {
        bwx.b("Must be called from the main thread.");
        if (!n()) {
            return a(17, (String) null);
        }
        return a((g) new box(this, this.a, bnp));
    }

    public final bsi<c> c() {
        bwx.b("Must be called from the main thread.");
        if (!n()) {
            return a(17, (String) null);
        }
        return a((g) new bpp(this, this.a));
    }

    public final long d() {
        long j2;
        synchronized (this.d) {
            bwx.b("Must be called from the main thread.");
            ehv ehv = this.f;
            MediaInfo d2 = ehv.d();
            j2 = 0;
            if (d2 != null) {
                if (ehv.h != null) {
                    if (ehv.h.equals(Long.valueOf(4294967296000L))) {
                        if (ehv.g.l != null) {
                            long longValue = ehv.h.longValue();
                            if (ehv.g != null) {
                                bnk bnk = ehv.g.l;
                                if (bnk != null) {
                                    long j3 = bnk.a;
                                    j2 = !bnk.b ? ehv.a(1.0d, j3, -1) : j3;
                                }
                            }
                            j2 = Math.min(longValue, j2);
                        } else if (ehv.c() >= 0) {
                            j2 = Math.min(ehv.h.longValue(), ehv.c());
                        }
                    }
                    j2 = ehv.h.longValue();
                } else if (ehv.f != 0) {
                    double d3 = ehv.g.d;
                    long j4 = ehv.g.g;
                    int i2 = ehv.g.e;
                    if (d3 != 0.0d) {
                        if (i2 == 2) {
                            j2 = ehv.a(d3, j4, d2.c);
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
            bwx.b("Must be called from the main thread.");
            c2 = this.f.c();
        }
        return c2;
    }

    public final bnq f() {
        bnq bnq;
        synchronized (this.d) {
            bwx.b("Must be called from the main thread.");
            bnq = this.f.g;
        }
        return bnq;
    }

    public final bok g() {
        bok bok;
        synchronized (this.d) {
            bwx.b("Must be called from the main thread.");
            bok = this.i;
        }
        return bok;
    }

    public final MediaInfo h() {
        MediaInfo d2;
        synchronized (this.d) {
            bwx.b("Must be called from the main thread.");
            d2 = this.f.d();
        }
        return d2;
    }

    public final int i() {
        int i2;
        synchronized (this.d) {
            bwx.b("Must be called from the main thread.");
            bnq f2 = f();
            if (f2 != null) {
                i2 = f2.e;
            } else {
                i2 = 1;
            }
        }
        return i2;
    }

    private int q() {
        int i2;
        synchronized (this.d) {
            bwx.b("Must be called from the main thread.");
            bnq f2 = f();
            if (f2 != null) {
                i2 = f2.f;
            } else {
                i2 = 0;
            }
        }
        return i2;
    }

    public final boolean j() {
        bwx.b("Must be called from the main thread.");
        MediaInfo h2 = h();
        return h2 != null && h2.a == 2;
    }

    private boolean r() {
        bwx.b("Must be called from the main thread.");
        bnq f2 = f();
        return f2 != null && f2.e == 2;
    }

    private boolean s() {
        bwx.b("Must be called from the main thread.");
        bnq f2 = f();
        return f2 != null && (f2.e == 3 || (j() && q() == 2));
    }

    private boolean t() {
        bwx.b("Must be called from the main thread.");
        bnq f2 = f();
        return f2 != null && f2.e == 4;
    }

    private boolean u() {
        bwx.b("Must be called from the main thread.");
        bnq f2 = f();
        return (f2 == null || f2.h == 0) ? false : true;
    }

    public final void k() {
        bwx.b("Must be called from the main thread.");
        int i2 = i();
        if (i2 == 4 || i2 == 2) {
            o();
        } else {
            p();
        }
    }

    private boolean v() {
        bwx.b("Must be called from the main thread.");
        return t() || r() || s() || u();
    }

    public final void a(a aVar) {
        bwx.b("Must be called from the main thread.");
        if (aVar != null) {
            this.c.add(aVar);
        }
    }

    public final boolean l() {
        bwx.b("Must be called from the main thread.");
        bnq f2 = f();
        return f2 != null && f2.k;
    }

    public final String m() {
        bwx.b("Must be called from the main thread.");
        return this.f.c;
    }

    public final void a(CastDevice castDevice, String str) {
        this.f.a(str);
    }

    public final boolean n() {
        return this.a != null;
    }

    public static bsi<c> a(int i2, String str) {
        f fVar = new f();
        fVar.a(fVar.a(new Status(17, null)));
        return fVar;
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

    static {
        String str = ehv.e;
    }

    private bsi<c> o() {
        bwx.b("Must be called from the main thread.");
        if (!n()) {
            return a(17, (String) null);
        }
        return a((g) new bou(this, this.a, null));
    }

    public final bsi<c> b() {
        bwx.b("Must be called from the main thread.");
        if (!n()) {
            return a(17, (String) null);
        }
        return a((g) new bow(this, this.a, null));
    }

    private bsi<c> p() {
        bwx.b("Must be called from the main thread.");
        if (!n()) {
            return a(17, (String) null);
        }
        return a((g) new bov(this, this.a, null));
    }

    static /* synthetic */ void a(boo boo) {
        bno bno;
        for (i iVar : boo.k.values()) {
            if (boo.v() && !iVar.d) {
                iVar.e.e.removeCallbacks(iVar.c);
                iVar.d = true;
                iVar.e.e.postDelayed(iVar.c, iVar.b);
            } else if (!boo.v() && iVar.d) {
                iVar.e.e.removeCallbacks(iVar.c);
                iVar.d = false;
            }
            if (iVar.d && (boo.t() || boo.s() || boo.u())) {
                HashSet hashSet = new HashSet(iVar.a);
                if (boo.r() || boo.s() || boo.t()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        it.next();
                        boo.d();
                        boo.e();
                    }
                } else if (boo.u()) {
                    bwx.b("Must be called from the main thread.");
                    bnq f2 = boo.f();
                    if (f2 == null) {
                        bno = null;
                    } else {
                        bno = f2.a(f2.h);
                    }
                    if (!(bno == null || bno.a == null)) {
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
}
