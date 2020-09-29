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

/* renamed from: aqt reason: default package */
public final class aqt implements apz {
    private axp A;
    private boolean B;
    public final aqb a;
    final CopyOnWriteArraySet<bef> b;
    final CopyOnWriteArraySet<arb> c;
    public final CopyOnWriteArraySet<azq> d;
    final CopyOnWriteArraySet<awe> e;
    public final CopyOnWriteArraySet<beg> f;
    final CopyOnWriteArraySet<arc> g;
    public final aqv h;
    public aqe i;
    public aqe j;
    Surface k;
    aru l;
    aru m;
    int n;
    public List<azi> o;
    private aqo[] p;
    private final Handler q;
    private final a r;
    private final bbj s;
    private final ara t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private aqy y;
    private float z;

    /* renamed from: aqt$a */
    final class a implements Callback, SurfaceTextureListener, b, arc, awe, azq, beg {
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private a() {
        }

        /* synthetic */ a(aqt aqt, byte b) {
            this();
        }

        public final void a(aru aru) {
            aqt aqt = aqt.this;
            aqt.l = aru;
            Iterator it = aqt.f.iterator();
            while (it.hasNext()) {
                ((beg) it.next()).a(aru);
            }
        }

        public final void a(String str, long j, long j2) {
            Iterator it = aqt.this.f.iterator();
            while (it.hasNext()) {
                ((beg) it.next()).a(str, j, j2);
            }
        }

        public final void a(aqe aqe) {
            aqt aqt = aqt.this;
            aqt.i = aqe;
            Iterator it = aqt.f.iterator();
            while (it.hasNext()) {
                ((beg) it.next()).a(aqe);
            }
        }

        public final void a(int i, long j) {
            Iterator it = aqt.this.f.iterator();
            while (it.hasNext()) {
                ((beg) it.next()).a(i, j);
            }
        }

        public final void a(int i, int i2, int i3, float f) {
            Iterator it = aqt.this.b.iterator();
            while (it.hasNext()) {
                bef bef = (bef) it.next();
                if (!aqt.this.f.contains(bef)) {
                    bef.a(i, i2, i3, f);
                }
            }
            Iterator it2 = aqt.this.f.iterator();
            while (it2.hasNext()) {
                ((beg) it2.next()).a(i, i2, i3, f);
            }
        }

        public final void a(Surface surface) {
            if (aqt.this.k == surface) {
                Iterator it = aqt.this.b.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            Iterator it2 = aqt.this.f.iterator();
            while (it2.hasNext()) {
                ((beg) it2.next()).a(surface);
            }
        }

        public final void b(aru aru) {
            Iterator it = aqt.this.f.iterator();
            while (it.hasNext()) {
                ((beg) it.next()).b(aru);
            }
            aqt aqt = aqt.this;
            aqt.i = null;
            aqt.l = null;
        }

        public final void c(aru aru) {
            aqt aqt = aqt.this;
            aqt.m = aru;
            Iterator it = aqt.g.iterator();
            while (it.hasNext()) {
                ((arc) it.next()).c(aru);
            }
        }

        public final void a(int i) {
            if (aqt.this.n != i) {
                aqt aqt = aqt.this;
                aqt.n = i;
                Iterator it = aqt.c.iterator();
                while (it.hasNext()) {
                    arb arb = (arb) it.next();
                    if (!aqt.this.g.contains(arb)) {
                        arb.a(i);
                    }
                }
                Iterator it2 = aqt.this.g.iterator();
                while (it2.hasNext()) {
                    ((arc) it2.next()).a(i);
                }
            }
        }

        public final void b(String str, long j, long j2) {
            Iterator it = aqt.this.g.iterator();
            while (it.hasNext()) {
                ((arc) it.next()).b(str, j, j2);
            }
        }

        public final void b(aqe aqe) {
            aqt aqt = aqt.this;
            aqt.j = aqe;
            Iterator it = aqt.g.iterator();
            while (it.hasNext()) {
                ((arc) it.next()).b(aqe);
            }
        }

        public final void a(int i, long j, long j2) {
            Iterator it = aqt.this.g.iterator();
            while (it.hasNext()) {
                ((arc) it.next()).a(i, j, j2);
            }
        }

        public final void d(aru aru) {
            Iterator it = aqt.this.g.iterator();
            while (it.hasNext()) {
                ((arc) it.next()).d(aru);
            }
            aqt aqt = aqt.this;
            aqt.j = null;
            aqt.m = null;
            aqt.n = 0;
        }

        public final void a(List<azi> list) {
            aqt aqt = aqt.this;
            aqt.o = list;
            Iterator it = aqt.d.iterator();
            while (it.hasNext()) {
                ((azq) it.next()).a(list);
            }
        }

        public final void a(awa awa) {
            Iterator it = aqt.this.e.iterator();
            while (it.hasNext()) {
                ((awe) it.next()).a(awa);
            }
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            aqt.a(aqt.this, surfaceHolder.getSurface(), false);
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            aqt.a(aqt.this, i2, i3);
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            aqt.a(aqt.this, (Surface) null, false);
            aqt.a(aqt.this, 0, 0);
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            aqt.a(aqt.this, new Surface(surfaceTexture), true);
            aqt.a(aqt.this, i, i2);
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            aqt.a(aqt.this, i, i2);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            aqt.a(aqt.this, (Surface) null, true);
            aqt.a(aqt.this, 0, 0);
            return true;
        }

        public final void a() {
            aqt.a(aqt.this);
        }

        public final void b(int i) {
            aqt aqt = aqt.this;
            aqt.a(aqt.l(), i);
        }
    }

    protected aqt(Context context, aqr aqr, bbf bbf, aqg aqg, asd<ash> asd, bbj bbj, defpackage.aqv.a aVar, Looper looper) {
        this(context, aqr, bbf, aqg, asd, bbj, aVar, bcw.a, looper);
    }

    private aqt(Context context, aqr aqr, bbf bbf, aqg aqg, asd<ash> asd, bbj bbj, defpackage.aqv.a aVar, bcw bcw, Looper looper) {
        asd<ash> asd2 = asd;
        bbj bbj2 = bbj;
        this.s = bbj2;
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
        this.p = aqr.a(handler, aVar2, aVar2, aVar2, aVar2, asd);
        this.z = 1.0f;
        this.n = 0;
        this.y = aqy.a;
        this.v = 1;
        this.o = Collections.emptyList();
        aqb aqb = new aqb(this.p, bbf, aqg, bbj, bcw, looper);
        this.a = aqb;
        this.h = defpackage.aqv.a.a(this.a, bcw);
        a((defpackage.aqm.a) this.h);
        this.f.add(this.h);
        this.b.add(this.h);
        this.g.add(this.h);
        this.c.add(this.h);
        this.e.add(this.h);
        bbj2.a(this.q, this.h);
        if (asd2 instanceof DefaultDrmSessionManager) {
            ((DefaultDrmSessionManager) asd2).a(this.q, (asa) this.h);
        }
        Context context2 = context;
        this.t = new ara(context, this.r);
    }

    public final void a(azq azq) {
        this.d.remove(azq);
    }

    private Looper q() {
        return this.a.b.getLooper();
    }

    public final void a(defpackage.aqm.a aVar) {
        p();
        this.a.a(aVar);
    }

    public final void b(defpackage.aqm.a aVar) {
        p();
        this.a.b(aVar);
    }

    public final int c() {
        p();
        return this.a.m.g;
    }

    public final void a(axp axp) {
        a(axp, true, true);
    }

    public final void a(axp axp, boolean z2, boolean z3) {
        p();
        axp axp2 = this.A;
        if (axp2 != null) {
            axp2.a((axq) this.h);
            this.h.b();
        }
        this.A = axp;
        axp.a(this.q, (axq) this.h);
        a(l(), this.t.a(l()));
        this.a.a(axp, z2, z3);
    }

    public final void a(boolean z2) {
        p();
        ara ara = this.t;
        int c2 = c();
        int i2 = 1;
        if (ara.a != null) {
            if (!z2) {
                ara.b(false);
                i2 = -1;
            } else if (c2 != 1) {
                i2 = ara.b();
            }
        }
        a(z2, i2);
    }

    public final boolean l() {
        p();
        return this.a.f;
    }

    public final void a(long j2) {
        p();
        aqv aqv = this.h;
        if (!aqv.b.f) {
            aqv.g();
            aqv.b.f = true;
            Iterator it = aqv.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.a.a(j2);
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
        axp axp = this.A;
        if (axp != null) {
            axp.a((axq) this.h);
            this.A = null;
        }
        this.s.a(this.h);
        this.o = Collections.emptyList();
    }

    public final aqn a(b bVar) {
        p();
        return this.a.a(bVar);
    }

    @Deprecated
    public final void a(defpackage.apz.a... aVarArr) {
        aqb aqb = this.a;
        ArrayList<aqn> arrayList = new ArrayList<>();
        for (defpackage.apz.a aVar : aVarArr) {
            arrayList.add(aqb.a(aVar.a).a(aVar.b).a(aVar.c).a());
        }
        boolean z2 = false;
        for (aqn aqn : arrayList) {
            boolean z3 = z2;
            boolean z4 = true;
            while (z4) {
                try {
                    aqn.c();
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

    public final int m() {
        p();
        return this.a.a.length;
    }

    public final int a(int i2) {
        p();
        return this.a.a[i2].a();
    }

    public final aqu k() {
        p();
        return this.a.m.b;
    }

    public final int n() {
        p();
        return this.a.c();
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

    public final boolean o() {
        p();
        aqb aqb = this.a;
        aqu aqu = aqb.m.b;
        if (aqu.a() || !aqu.a(aqb.d(), aqb.e, false).e) {
            return false;
        }
        return true;
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

    /* access modifiers changed from: 0000 */
    public void a(boolean z2, int i2) {
        aqb aqb = this.a;
        boolean z3 = false;
        boolean z4 = z2 && i2 != -1;
        if (i2 != 1) {
            z3 = true;
        }
        aqb.a(z4, z3);
    }

    public void p() {
        if (Looper.myLooper() != q()) {
            bdd.a("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://google.github.io/ExoPlayer/faqs.html#what-do-player-is-accessed-on-the-wrong-thread-warnings-mean", this.B ? null : new IllegalStateException());
            this.B = true;
        }
    }

    public final void a() {
        p();
        this.a.b(false);
        axp axp = this.A;
        if (axp != null) {
            axp.a((axq) this.h);
            this.h.b();
        }
        this.t.a();
        this.o = Collections.emptyList();
    }

    static /* synthetic */ void a(aqt aqt, Surface surface, boolean z2) {
        aqo[] aqoArr;
        ArrayList<aqn> arrayList = new ArrayList<>();
        for (aqo aqo : aqt.p) {
            if (aqo.a() == 2) {
                arrayList.add(aqt.a.a((b) aqo).a(1).a((Object) surface).a());
            }
        }
        Surface surface2 = aqt.k;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (aqn c2 : arrayList) {
                    c2.c();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (aqt.u) {
                aqt.k.release();
            }
        }
        aqt.k = surface;
        aqt.u = z2;
    }

    static /* synthetic */ void a(aqt aqt, int i2, int i3) {
        if (i2 != aqt.w || i3 != aqt.x) {
            aqt.w = i2;
            aqt.x = i3;
            Iterator it = aqt.b.iterator();
            while (it.hasNext()) {
                ((bef) it.next()).a(i2, i3);
            }
        }
    }

    static /* synthetic */ void a(aqt aqt) {
        aqo[] aqoArr;
        float f2 = aqt.z * aqt.t.d;
        for (aqo aqo : aqt.p) {
            if (aqo.a() == 1) {
                aqt.a.a((b) aqo).a(2).a((Object) Float.valueOf(f2)).a();
            }
        }
    }
}
