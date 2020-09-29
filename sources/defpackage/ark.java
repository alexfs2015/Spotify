package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ark reason: default package */
public final class ark implements aqq {
    private ayg A;
    private boolean B;
    public final aqs a;
    final CopyOnWriteArraySet<bew> b;
    final CopyOnWriteArraySet<ars> c;
    public final CopyOnWriteArraySet<bah> d;
    final CopyOnWriteArraySet<awv> e;
    public final CopyOnWriteArraySet<bex> f;
    final CopyOnWriteArraySet<art> g;
    public final arm h;
    public aqv i;
    public aqv j;
    Surface k;
    asl l;
    asl m;
    int n;
    public List<azz> o;
    private arf[] p;
    private final Handler q;
    private final a r;
    private final bca s;
    private final arr t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private arp y;
    private float z;

    /* renamed from: ark$a */
    final class a implements Callback, SurfaceTextureListener, b, art, awv, bah, bex {
        private a() {
        }

        /* synthetic */ a(ark ark, byte b) {
            this();
        }

        public final void a() {
            ark.a(ark.this);
        }

        public final void a(int i) {
            if (ark.this.n != i) {
                ark ark = ark.this;
                ark.n = i;
                Iterator it = ark.c.iterator();
                while (it.hasNext()) {
                    ars ars = (ars) it.next();
                    if (!ark.this.g.contains(ars)) {
                        ars.a(i);
                    }
                }
                Iterator it2 = ark.this.g.iterator();
                while (it2.hasNext()) {
                    ((art) it2.next()).a(i);
                }
            }
        }

        public final void a(int i, int i2, int i3, float f) {
            Iterator it = ark.this.b.iterator();
            while (it.hasNext()) {
                bew bew = (bew) it.next();
                if (!ark.this.f.contains(bew)) {
                    bew.a(i, i2, i3, f);
                }
            }
            Iterator it2 = ark.this.f.iterator();
            while (it2.hasNext()) {
                ((bex) it2.next()).a(i, i2, i3, f);
            }
        }

        public final void a(int i, long j) {
            Iterator it = ark.this.f.iterator();
            while (it.hasNext()) {
                ((bex) it.next()).a(i, j);
            }
        }

        public final void a(int i, long j, long j2) {
            Iterator it = ark.this.g.iterator();
            while (it.hasNext()) {
                ((art) it.next()).a(i, j, j2);
            }
        }

        public final void a(Surface surface) {
            if (ark.this.k == surface) {
                Iterator it = ark.this.b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            Iterator it2 = ark.this.f.iterator();
            while (it2.hasNext()) {
                ((bex) it2.next()).a(surface);
            }
        }

        public final void a(aqv aqv) {
            ark ark = ark.this;
            ark.i = aqv;
            Iterator it = ark.f.iterator();
            while (it.hasNext()) {
                ((bex) it.next()).a(aqv);
            }
        }

        public final void a(asl asl) {
            ark ark = ark.this;
            ark.l = asl;
            Iterator it = ark.f.iterator();
            while (it.hasNext()) {
                ((bex) it.next()).a(asl);
            }
        }

        public final void a(awr awr) {
            Iterator it = ark.this.e.iterator();
            while (it.hasNext()) {
                ((awv) it.next()).a(awr);
            }
        }

        public final void a(String str, long j, long j2) {
            Iterator it = ark.this.f.iterator();
            while (it.hasNext()) {
                ((bex) it.next()).a(str, j, j2);
            }
        }

        public final void a(List<azz> list) {
            ark ark = ark.this;
            ark.o = list;
            Iterator it = ark.d.iterator();
            while (it.hasNext()) {
                ((bah) it.next()).a(list);
            }
        }

        public final void b(int i) {
            ark ark = ark.this;
            ark.a(ark.l(), i);
        }

        public final void b(aqv aqv) {
            ark ark = ark.this;
            ark.j = aqv;
            Iterator it = ark.g.iterator();
            while (it.hasNext()) {
                ((art) it.next()).b(aqv);
            }
        }

        public final void b(asl asl) {
            Iterator it = ark.this.f.iterator();
            while (it.hasNext()) {
                ((bex) it.next()).b(asl);
            }
            ark ark = ark.this;
            ark.i = null;
            ark.l = null;
        }

        public final void b(String str, long j, long j2) {
            Iterator it = ark.this.g.iterator();
            while (it.hasNext()) {
                ((art) it.next()).b(str, j, j2);
            }
        }

        public final void c(asl asl) {
            ark ark = ark.this;
            ark.m = asl;
            Iterator it = ark.g.iterator();
            while (it.hasNext()) {
                ((art) it.next()).c(asl);
            }
        }

        public final void d(asl asl) {
            Iterator it = ark.this.g.iterator();
            while (it.hasNext()) {
                ((art) it.next()).d(asl);
            }
            ark ark = ark.this;
            ark.j = null;
            ark.m = null;
            ark.n = 0;
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            ark.a(ark.this, new Surface(surfaceTexture), true);
            ark.a(ark.this, i, i2);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ark.a(ark.this, (Surface) null, true);
            ark.a(ark.this, 0, 0);
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            ark.a(ark.this, i, i2);
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            ark.a(ark.this, i2, i3);
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            ark.a(ark.this, surfaceHolder.getSurface(), false);
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            ark.a(ark.this, (Surface) null, false);
            ark.a(ark.this, 0, 0);
        }
    }

    protected ark(Context context, ari ari, bbw bbw, aqx aqx, asu<asy> asu, bca bca, defpackage.arm.a aVar, Looper looper) {
        this(context, ari, bbw, aqx, asu, bca, aVar, bdn.a, looper);
    }

    private ark(Context context, ari ari, bbw bbw, aqx aqx, asu<asy> asu, bca bca, defpackage.arm.a aVar, bdn bdn, Looper looper) {
        asu<asy> asu2 = asu;
        bca bca2 = bca;
        this.s = bca2;
        this.r = new a(this, 0);
        this.b = new CopyOnWriteArraySet<>();
        this.c = new CopyOnWriteArraySet<>();
        this.d = new CopyOnWriteArraySet<>();
        this.e = new CopyOnWriteArraySet<>();
        this.f = new CopyOnWriteArraySet<>();
        this.g = new CopyOnWriteArraySet<>();
        this.q = new Handler(looper);
        Handler handler = this.q;
        a aVar2 = this.r;
        this.p = ari.a(handler, aVar2, aVar2, aVar2, aVar2, asu);
        this.z = 1.0f;
        this.n = 0;
        this.y = arp.a;
        this.v = 1;
        this.o = Collections.emptyList();
        aqs aqs = new aqs(this.p, bbw, aqx, bca, bdn, looper);
        this.a = aqs;
        this.h = defpackage.arm.a.a(this.a, bdn);
        a((defpackage.ard.a) this.h);
        this.f.add(this.h);
        this.b.add(this.h);
        this.g.add(this.h);
        this.c.add(this.h);
        this.e.add(this.h);
        bca2.a(this.q, this.h);
        if (asu2 instanceof DefaultDrmSessionManager) {
            ((DefaultDrmSessionManager) asu2).a(this.q, (asr) this.h);
        }
        Context context2 = context;
        this.t = new arr(context, this.r);
    }

    static /* synthetic */ void a(ark ark) {
        arf[] arfArr;
        float f2 = ark.z * ark.t.d;
        for (arf arf : ark.p) {
            if (arf.a() == 1) {
                ark.a.a((b) arf).a(2).a((Object) Float.valueOf(f2)).a();
            }
        }
    }

    static /* synthetic */ void a(ark ark, int i2, int i3) {
        if (i2 != ark.w || i3 != ark.x) {
            ark.w = i2;
            ark.x = i3;
            Iterator it = ark.b.iterator();
            while (it.hasNext()) {
                ((bew) it.next()).a(i2, i3);
            }
        }
    }

    static /* synthetic */ void a(ark ark, Surface surface, boolean z2) {
        arf[] arfArr;
        ArrayList<are> arrayList = new ArrayList<>();
        for (arf arf : ark.p) {
            if (arf.a() == 2) {
                arrayList.add(ark.a.a((b) arf).a(1).a((Object) surface).a());
            }
        }
        Surface surface2 = ark.k;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (are c2 : arrayList) {
                    c2.c();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (ark.u) {
                ark.k.release();
            }
        }
        ark.k = surface;
        ark.u = z2;
    }

    private Looper q() {
        return this.a.b.getLooper();
    }

    public final int a(int i2) {
        p();
        return this.a.a[i2].a();
    }

    public final are a(b bVar) {
        p();
        return this.a.a(bVar);
    }

    public final void a() {
        p();
        this.a.b(false);
        ayg ayg = this.A;
        if (ayg != null) {
            ayg.a((ayh) this.h);
            this.h.b();
        }
        this.t.a();
        this.o = Collections.emptyList();
    }

    public final void a(long j2) {
        p();
        arm arm = this.h;
        if (!arm.b.f) {
            arm.g();
            arm.b.f = true;
            Iterator it = arm.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.a.a(j2);
    }

    public final void a(defpackage.ard.a aVar) {
        p();
        this.a.a(aVar);
    }

    public final void a(ayg ayg) {
        a(ayg, true, true);
    }

    public final void a(ayg ayg, boolean z2, boolean z3) {
        p();
        ayg ayg2 = this.A;
        if (ayg2 != null) {
            ayg2.a((ayh) this.h);
            this.h.b();
        }
        this.A = ayg;
        ayg.a(this.q, (ayh) this.h);
        a(l(), this.t.a(l()));
        this.a.a(ayg, z2, z3);
    }

    public final void a(bah bah) {
        this.d.remove(bah);
    }

    public final void a(boolean z2) {
        p();
        arr arr = this.t;
        int c2 = c();
        int i2 = 1;
        if (arr.a != null) {
            if (!z2) {
                arr.b(false);
                i2 = -1;
            } else if (c2 != 1) {
                i2 = arr.b();
            }
        }
        a(z2, i2);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z2, int i2) {
        aqs aqs = this.a;
        boolean z3 = false;
        boolean z4 = z2 && i2 != -1;
        if (i2 != 1) {
            z3 = true;
        }
        aqs.a(z4, z3);
    }

    @Deprecated
    public final void a(defpackage.aqq.a... aVarArr) {
        aqs aqs = this.a;
        ArrayList<are> arrayList = new ArrayList<>();
        for (defpackage.aqq.a aVar : aVarArr) {
            arrayList.add(aqs.a(aVar.a).a(aVar.b).a(aVar.c).a());
        }
        boolean z2 = false;
        for (are are : arrayList) {
            boolean z3 = z2;
            boolean z4 = true;
            while (z4) {
                try {
                    are.c();
                    z4 = false;
                } catch (InterruptedException unused) {
                    z3 = true;
                }
            }
            z2 = z3;
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public final void b() {
        this.t.a();
        this.a.b();
        Surface surface = this.k;
        if (surface != null) {
            if (this.u) {
                surface.release();
            }
            this.k = null;
        }
        ayg ayg = this.A;
        if (ayg != null) {
            ayg.a((ayh) this.h);
            this.A = null;
        }
        this.s.a(this.h);
        this.o = Collections.emptyList();
    }

    public final void b(defpackage.ard.a aVar) {
        p();
        this.a.b(aVar);
    }

    public final int c() {
        p();
        return this.a.m.g;
    }

    public final int d() {
        p();
        return this.a.d();
    }

    public final long e() {
        p();
        return this.a.e();
    }

    public final long f() {
        p();
        return this.a.f();
    }

    public final long g() {
        p();
        return this.a.g();
    }

    public final int h() {
        p();
        return this.a.h();
    }

    public final int i() {
        p();
        return this.a.i();
    }

    public final long j() {
        p();
        return this.a.j();
    }

    public final arl k() {
        p();
        return this.a.m.b;
    }

    public final boolean l() {
        p();
        return this.a.f;
    }

    public final int m() {
        p();
        return this.a.a.length;
    }

    public final int n() {
        p();
        return this.a.c();
    }

    public final boolean o() {
        p();
        aqs aqs = this.a;
        arl arl = aqs.m.b;
        return !arl.a() && arl.a(aqs.d(), aqs.e, false).e;
    }

    public void p() {
        if (Looper.myLooper() != q()) {
            bdu.a("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://google.github.io/ExoPlayer/faqs.html#what-do-player-is-accessed-on-the-wrong-thread-warnings-mean", this.B ? null : new IllegalStateException());
            this.B = true;
        }
    }
}
