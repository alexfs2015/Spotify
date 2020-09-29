package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aqb reason: default package */
public final class aqb implements apz {
    final aqo[] a;
    final Handler b;
    public final aqc c;
    public final CopyOnWriteArraySet<defpackage.aqm.a> d;
    final b e;
    boolean f;
    public int g;
    int h;
    boolean i;
    boolean j;
    public aql k;
    ExoPlaybackException l;
    aqk m;
    int n;
    int o;
    long p;
    private bbg q;
    private final bbf r;
    private final Handler s;
    private final defpackage.aqu.a t;
    private final ArrayDeque<a> u;
    private axp v;
    private boolean w;
    private boolean x;
    private aqs y;

    /* renamed from: aqb$a */
    static final class a {
        private final aqk a;
        private final Set<defpackage.aqm.a> b;
        private final bbf c;
        private final boolean d;
        private final int e;
        private final int f;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        private final boolean j;
        private final boolean k;
        private final boolean l;

        public a(aqk aqk, aqk aqk2, Set<defpackage.aqm.a> set, bbf bbf, boolean z, int i2, int i3, boolean z2, boolean z3, boolean z4) {
            this.a = aqk;
            this.b = set;
            this.c = bbf;
            this.d = z;
            this.e = i2;
            this.f = i3;
            this.g = z2;
            this.h = z3;
            boolean z5 = false;
            this.i = z4 || aqk2.g != aqk.g;
            this.j = (aqk2.b == aqk.b && aqk2.c == aqk.c) ? false : true;
            this.k = aqk2.h != aqk.h;
            if (aqk2.j != aqk.j) {
                z5 = true;
            }
            this.l = z5;
        }

        public final void a() {
            if (this.j || this.f == 0) {
                for (defpackage.aqm.a a2 : this.b) {
                    a2.a(this.a.b, this.f);
                }
            }
            if (this.d) {
                for (defpackage.aqm.a b2 : this.b) {
                    b2.b(this.e);
                }
            }
            if (this.l) {
                this.c.a(this.a.j.d);
                for (defpackage.aqm.a a3 : this.b) {
                    a3.a(this.a.i, this.a.j.c);
                }
            }
            if (this.k) {
                for (defpackage.aqm.a a4 : this.b) {
                    a4.a(this.a.h);
                }
            }
            if (this.i) {
                for (defpackage.aqm.a a5 : this.b) {
                    a5.a(this.h, this.a.g);
                }
            }
            if (this.g) {
                for (defpackage.aqm.a a6 : this.b) {
                    a6.a();
                }
            }
        }
    }

    public aqb(aqo[] aqoArr, bbf bbf, aqg aqg, bbj bbj, bcw bcw, Looper looper) {
        aqo[] aqoArr2 = aqoArr;
        StringBuilder sb = new StringBuilder("Init ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [ExoPlayerLib/2.9.0");
        sb.append("] [");
        sb.append(bdw.e);
        sb.append("]");
        bdd.b("ExoPlayerImpl", sb.toString());
        bcu.b(aqoArr2.length > 0);
        this.a = (aqo[]) bcu.a(aqoArr);
        this.r = (bbf) bcu.a(bbf);
        this.f = false;
        this.g = 0;
        this.x = false;
        this.d = new CopyOnWriteArraySet<>();
        this.q = new bbg(new aqq[aqoArr2.length], new bbd[aqoArr2.length], null);
        this.e = new b();
        this.t = new defpackage.aqu.a();
        this.k = aql.a;
        this.y = aqs.b;
        this.b = new Handler(looper) {
            public final void handleMessage(Message message) {
                aqb aqb = aqb.this;
                int i = message.what;
                boolean z = true;
                if (i == 0) {
                    aqk aqk = (aqk) message.obj;
                    int i2 = message.arg1;
                    if (message.arg2 == -1) {
                        z = false;
                    }
                    int i3 = message.arg2;
                    aqb.h -= i2;
                    if (aqb.h == 0) {
                        aqk a2 = aqk.e == -9223372036854775807L ? aqk.a(aqk.d, 0, aqk.f) : aqk;
                        if ((!aqb.m.b.a() || aqb.i) && a2.b.a()) {
                            aqb.o = 0;
                            aqb.n = 0;
                            aqb.p = 0;
                        }
                        int i4 = aqb.i ? 0 : 2;
                        boolean z2 = aqb.j;
                        aqb.i = false;
                        aqb.j = false;
                        aqb.a(a2, z, i3, i4, z2, false);
                    }
                } else if (i == 1) {
                    aql aql = (aql) message.obj;
                    if (!aqb.k.equals(aql)) {
                        aqb.k = aql;
                        Iterator it = aqb.d.iterator();
                        while (it.hasNext()) {
                            ((defpackage.aqm.a) it.next()).a(aql);
                        }
                    }
                } else if (i == 2) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) message.obj;
                    aqb.l = exoPlaybackException;
                    Iterator it2 = aqb.d.iterator();
                    while (it2.hasNext()) {
                        ((defpackage.aqm.a) it2.next()).a(exoPlaybackException);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        };
        this.m = aqk.a(0, this.q);
        this.u = new ArrayDeque<>();
        aqc aqc = new aqc(aqoArr, bbf, this.q, aqg, bbj, this.f, this.g, false, this.b, this, bcw);
        this.c = aqc;
        this.s = new Handler(this.c.b.getLooper());
    }

    public final void a(defpackage.aqm.a aVar) {
        this.d.add(aVar);
    }

    public final void b(defpackage.aqm.a aVar) {
        this.d.remove(aVar);
    }

    public final void a(axp axp) {
        a(axp, true, true);
    }

    public final void a(axp axp, boolean z, boolean z2) {
        this.l = null;
        this.v = axp;
        aqk a2 = a(z, z2, 2);
        this.i = true;
        this.h++;
        this.c.a(axp, z, z2);
        a(a2, false, 4, 1, false, false);
    }

    public final void a(boolean z) {
        a(z, false);
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = z && !z2;
        if (this.w != z3) {
            this.w = z3;
            this.c.a(z3);
        }
        if (this.f != z) {
            this.f = z;
            a(this.m, false, 4, 1, false, true);
        }
    }

    public final void a(long j2) {
        long j3;
        int d2 = d();
        aqu aqu = this.m.b;
        if (d2 < 0 || (!aqu.a() && d2 >= aqu.b())) {
            throw new IllegalSeekPositionException(aqu, d2, j2);
        }
        this.j = true;
        this.h++;
        if (l()) {
            bdd.c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.b.obtainMessage(0, 1, -1, this.m).sendToTarget();
            return;
        }
        this.n = d2;
        if (aqu.a()) {
            this.p = j2 == -9223372036854775807L ? 0 : j2;
            this.o = 0;
        } else {
            if (j2 == -9223372036854775807L) {
                j3 = aqu.a(d2, this.e, false).h;
            } else {
                j3 = apv.b(j2);
            }
            long j4 = j3;
            Pair a2 = aqu.a(this.e, this.t, d2, j4);
            this.p = apv.a(j4);
            this.o = aqu.a(a2.first);
        }
        this.c.a.a(3, (Object) new d(aqu, d2, apv.b(j2))).sendToTarget();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((defpackage.aqm.a) it.next()).b(1);
        }
    }

    public final void a() {
        b(false);
    }

    public final void b(boolean z) {
        if (z) {
            this.l = null;
            this.v = null;
        }
        aqk a2 = a(z, z, 1);
        this.h++;
        this.c.b(z);
        a(a2, false, 4, 1, false, false);
    }

    public final void b() {
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [ExoPlayerLib/2.9.0");
        String str = "] [";
        sb.append(str);
        sb.append(bdw.e);
        sb.append(str);
        sb.append(aqd.a());
        sb.append("]");
        bdd.b("ExoPlayerImpl", sb.toString());
        this.v = null;
        this.c.a();
        this.b.removeCallbacksAndMessages(null);
    }

    public final aqn a(b bVar) {
        aqn aqn = new aqn(this.c, bVar, this.m.b, d(), this.s);
        return aqn;
    }

    public final int c() {
        if (m()) {
            return this.o;
        }
        return this.m.b.a(this.m.d.a);
    }

    public final int d() {
        if (m()) {
            return this.n;
        }
        return this.m.b.a(this.m.d.a, this.t).c;
    }

    public final long e() {
        if (l()) {
            defpackage.axp.a aVar = this.m.d;
            this.m.b.a(aVar.a, this.t);
            return apv.a(this.t.c(aVar.b, aVar.c));
        } else if (this.m.b.a()) {
            return -9223372036854775807L;
        } else {
            return apv.a(this.m.b.a(d(), this.e, false).i);
        }
    }

    public final long f() {
        if (m()) {
            return this.p;
        }
        if (this.m.d.a()) {
            return apv.a(this.m.n);
        }
        defpackage.axp.a aVar = this.m.d;
        long a2 = apv.a(this.m.n);
        this.m.b.a(aVar.a, this.t);
        return a2 + apv.a(this.t.e);
    }

    public final long g() {
        return Math.max(0, apv.a(this.m.m));
    }

    private boolean l() {
        return !m() && this.m.d.a();
    }

    public final int h() {
        if (l()) {
            return this.m.d.b;
        }
        return -1;
    }

    public final int i() {
        if (l()) {
            return this.m.d.c;
        }
        return -1;
    }

    public final long j() {
        if (!l()) {
            return f();
        }
        this.m.b.a(this.m.d.a, this.t);
        return apv.a(this.t.e) + apv.a(this.m.f);
    }

    public final aqu k() {
        return this.m.b;
    }

    private aqk a(boolean z, boolean z2, int i2) {
        if (z) {
            this.n = 0;
            this.o = 0;
            this.p = 0;
        } else {
            this.n = d();
            this.o = c();
            this.p = f();
        }
        aqk aqk = new aqk(z2 ? aqu.a : this.m.b, z2 ? null : this.m.c, this.m.d, this.m.e, this.m.f, i2, false, z2 ? axx.a : this.m.i, z2 ? this.q : this.m.j, this.m.d, this.m.e, 0, this.m.e);
        return aqk;
    }

    /* access modifiers changed from: 0000 */
    public void a(aqk aqk, boolean z, int i2, int i3, boolean z2, boolean z3) {
        boolean z4 = !this.u.isEmpty();
        ArrayDeque<a> arrayDeque = this.u;
        a aVar = new a(aqk, this.m, this.d, this.r, z, i2, i3, z2, this.f, z3);
        arrayDeque.addLast(aVar);
        this.m = aqk;
        if (!z4) {
            while (!this.u.isEmpty()) {
                ((a) this.u.peekFirst()).a();
                this.u.removeFirst();
            }
        }
    }

    private boolean m() {
        return this.m.b.a() || this.h > 0;
    }
}
