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

/* renamed from: aqs reason: default package */
public final class aqs implements aqq {
    final arf[] a;
    final Handler b;
    public final aqt c;
    public final CopyOnWriteArraySet<defpackage.ard.a> d;
    final b e;
    boolean f;
    public int g;
    int h;
    boolean i;
    boolean j;
    public arc k;
    ExoPlaybackException l;
    arb m;
    int n;
    int o;
    long p;
    private bbx q;
    private final bbw r;
    private final Handler s;
    private final defpackage.arl.a t;
    private final ArrayDeque<a> u;
    private ayg v;
    private boolean w;
    private boolean x;
    private arj y;

    /* renamed from: aqs$a */
    static final class a {
        private final arb a;
        private final Set<defpackage.ard.a> b;
        private final bbw c;
        private final boolean d;
        private final int e;
        private final int f;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        private final boolean j;
        private final boolean k;
        private final boolean l;

        public a(arb arb, arb arb2, Set<defpackage.ard.a> set, bbw bbw, boolean z, int i2, int i3, boolean z2, boolean z3, boolean z4) {
            this.a = arb;
            this.b = set;
            this.c = bbw;
            this.d = z;
            this.e = i2;
            this.f = i3;
            this.g = z2;
            this.h = z3;
            boolean z5 = false;
            this.i = z4 || arb2.g != arb.g;
            this.j = (arb2.b == arb.b && arb2.c == arb.c) ? false : true;
            this.k = arb2.h != arb.h;
            if (arb2.j != arb.j) {
                z5 = true;
            }
            this.l = z5;
        }

        public final void a() {
            if (this.j || this.f == 0) {
                for (defpackage.ard.a a2 : this.b) {
                    a2.a(this.a.b, this.f);
                }
            }
            if (this.d) {
                for (defpackage.ard.a b2 : this.b) {
                    b2.b(this.e);
                }
            }
            if (this.l) {
                this.c.a(this.a.j.d);
                for (defpackage.ard.a a3 : this.b) {
                    a3.a(this.a.i, this.a.j.c);
                }
            }
            if (this.k) {
                for (defpackage.ard.a a4 : this.b) {
                    a4.a(this.a.h);
                }
            }
            if (this.i) {
                for (defpackage.ard.a a5 : this.b) {
                    a5.a(this.h, this.a.g);
                }
            }
            if (this.g) {
                for (defpackage.ard.a a6 : this.b) {
                    a6.a();
                }
            }
        }
    }

    public aqs(arf[] arfArr, bbw bbw, aqx aqx, bca bca, bdn bdn, Looper looper) {
        arf[] arfArr2 = arfArr;
        StringBuilder sb = new StringBuilder("Init ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [ExoPlayerLib/2.9.0");
        sb.append("] [");
        sb.append(ben.e);
        sb.append("]");
        bdu.b("ExoPlayerImpl", sb.toString());
        bdl.b(arfArr2.length > 0);
        this.a = (arf[]) bdl.a(arfArr);
        this.r = (bbw) bdl.a(bbw);
        this.f = false;
        this.g = 0;
        this.x = false;
        this.d = new CopyOnWriteArraySet<>();
        this.q = new bbx(new arh[arfArr2.length], new bbu[arfArr2.length], null);
        this.e = new b();
        this.t = new defpackage.arl.a();
        this.k = arc.a;
        this.y = arj.b;
        this.b = new Handler(looper) {
            public final void handleMessage(Message message) {
                aqs aqs = aqs.this;
                int i = message.what;
                boolean z = true;
                if (i == 0) {
                    arb arb = (arb) message.obj;
                    int i2 = message.arg1;
                    if (message.arg2 == -1) {
                        z = false;
                    }
                    int i3 = message.arg2;
                    aqs.h -= i2;
                    if (aqs.h == 0) {
                        arb a2 = arb.e == -9223372036854775807L ? arb.a(arb.d, 0, arb.f) : arb;
                        if ((!aqs.m.b.a() || aqs.i) && a2.b.a()) {
                            aqs.o = 0;
                            aqs.n = 0;
                            aqs.p = 0;
                        }
                        int i4 = aqs.i ? 0 : 2;
                        boolean z2 = aqs.j;
                        aqs.i = false;
                        aqs.j = false;
                        aqs.a(a2, z, i3, i4, z2, false);
                    }
                } else if (i == 1) {
                    arc arc = (arc) message.obj;
                    if (!aqs.k.equals(arc)) {
                        aqs.k = arc;
                        Iterator it = aqs.d.iterator();
                        while (it.hasNext()) {
                            ((defpackage.ard.a) it.next()).a(arc);
                        }
                    }
                } else if (i == 2) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) message.obj;
                    aqs.l = exoPlaybackException;
                    Iterator it2 = aqs.d.iterator();
                    while (it2.hasNext()) {
                        ((defpackage.ard.a) it2.next()).a(exoPlaybackException);
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        };
        this.m = arb.a(0, this.q);
        this.u = new ArrayDeque<>();
        aqt aqt = new aqt(arfArr, bbw, this.q, aqx, bca, this.f, this.g, false, this.b, this, bdn);
        this.c = aqt;
        this.s = new Handler(this.c.b.getLooper());
    }

    private arb a(boolean z, boolean z2, int i2) {
        if (z) {
            this.n = 0;
            this.o = 0;
            this.p = 0;
        } else {
            this.n = d();
            this.o = c();
            this.p = f();
        }
        arb arb = new arb(z2 ? arl.a : this.m.b, z2 ? null : this.m.c, this.m.d, this.m.e, this.m.f, i2, false, z2 ? ayo.a : this.m.i, z2 ? this.q : this.m.j, this.m.d, this.m.e, 0, this.m.e);
        return arb;
    }

    private boolean l() {
        return !m() && this.m.d.a();
    }

    private boolean m() {
        return this.m.b.a() || this.h > 0;
    }

    public final are a(b bVar) {
        are are = new are(this.c, bVar, this.m.b, d(), this.s);
        return are;
    }

    public final void a() {
        b(false);
    }

    public final void a(long j2) {
        int d2 = d();
        arl arl = this.m.b;
        if (d2 < 0 || (!arl.a() && d2 >= arl.b())) {
            throw new IllegalSeekPositionException(arl, d2, j2);
        }
        this.j = true;
        this.h++;
        if (l()) {
            bdu.c("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.b.obtainMessage(0, 1, -1, this.m).sendToTarget();
            return;
        }
        this.n = d2;
        if (arl.a()) {
            this.p = j2 == -9223372036854775807L ? 0 : j2;
            this.o = 0;
        } else {
            long b2 = j2 == -9223372036854775807L ? arl.a(d2, this.e, false).h : aqm.b(j2);
            Pair a2 = arl.a(this.e, this.t, d2, b2);
            this.p = aqm.a(b2);
            this.o = arl.a(a2.first);
        }
        this.c.a.a(3, (Object) new d(arl, d2, aqm.b(j2))).sendToTarget();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((defpackage.ard.a) it.next()).b(1);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(arb arb, boolean z, int i2, int i3, boolean z2, boolean z3) {
        boolean z4 = !this.u.isEmpty();
        ArrayDeque<a> arrayDeque = this.u;
        a aVar = new a(arb, this.m, this.d, this.r, z, i2, i3, z2, this.f, z3);
        arrayDeque.addLast(aVar);
        this.m = arb;
        if (!z4) {
            while (!this.u.isEmpty()) {
                ((a) this.u.peekFirst()).a();
                this.u.removeFirst();
            }
        }
    }

    public final void a(defpackage.ard.a aVar) {
        this.d.add(aVar);
    }

    public final void a(ayg ayg) {
        a(ayg, true, true);
    }

    public final void a(ayg ayg, boolean z, boolean z2) {
        this.l = null;
        this.v = ayg;
        arb a2 = a(z, z2, 2);
        this.i = true;
        this.h++;
        this.c.a(ayg, z, z2);
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

    public final void b() {
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [ExoPlayerLib/2.9.0");
        String str = "] [";
        sb.append(str);
        sb.append(ben.e);
        sb.append(str);
        sb.append(aqu.a());
        sb.append("]");
        bdu.b("ExoPlayerImpl", sb.toString());
        this.v = null;
        this.c.a();
        this.b.removeCallbacksAndMessages(null);
    }

    public final void b(defpackage.ard.a aVar) {
        this.d.remove(aVar);
    }

    public final void b(boolean z) {
        if (z) {
            this.l = null;
            this.v = null;
        }
        arb a2 = a(z, z, 1);
        this.h++;
        this.c.b(z);
        a(a2, false, 4, 1, false, false);
    }

    public final int c() {
        return m() ? this.o : this.m.b.a(this.m.d.a);
    }

    public final int d() {
        return m() ? this.n : this.m.b.a(this.m.d.a, this.t).c;
    }

    public final long e() {
        if (l()) {
            defpackage.ayg.a aVar = this.m.d;
            this.m.b.a(aVar.a, this.t);
            return aqm.a(this.t.c(aVar.b, aVar.c));
        } else if (this.m.b.a()) {
            return -9223372036854775807L;
        } else {
            return aqm.a(this.m.b.a(d(), this.e, false).i);
        }
    }

    public final long f() {
        if (m()) {
            return this.p;
        }
        if (this.m.d.a()) {
            return aqm.a(this.m.n);
        }
        defpackage.ayg.a aVar = this.m.d;
        long a2 = aqm.a(this.m.n);
        this.m.b.a(aVar.a, this.t);
        return a2 + aqm.a(this.t.e);
    }

    public final long g() {
        return Math.max(0, aqm.a(this.m.m));
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
        return aqm.a(this.t.e) + aqm.a(this.m.f);
    }

    public final arl k() {
        return this.m.b;
    }
}
