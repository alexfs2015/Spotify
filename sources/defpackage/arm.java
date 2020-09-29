package defpackage;

import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: arm reason: default package */
public final class arm implements defpackage.ard.a, ars, art, asr, awv, ayh, defpackage.bca.a, bew, bex {
    public final CopyOnWriteArraySet<arn> a;
    public final c b;
    private final bdn c;
    private final defpackage.arl.b d;
    private ard e;

    /* renamed from: arm$a */
    public static class a {
        public static arm a(ard ard, bdn bdn) {
            return new arm(ard, bdn);
        }
    }

    /* renamed from: arm$b */
    static final class b {
        public final defpackage.ayg.a a;
        public final arl b;
        public final int c;

        public b(defpackage.ayg.a aVar, arl arl, int i) {
            this.a = aVar;
            this.b = arl;
            this.c = i;
        }
    }

    /* renamed from: arm$c */
    public static final class c {
        final ArrayList<b> a = new ArrayList<>();
        final HashMap<defpackage.ayg.a, b> b = new HashMap<>();
        b c;
        b d;
        arl e = arl.a;
        public boolean f;
        private final defpackage.arl.a g = new defpackage.arl.a();

        public final b a() {
            if (this.a.isEmpty() || this.e.a() || this.f) {
                return null;
            }
            return (b) this.a.get(0);
        }

        public final b a(int i) {
            b bVar = null;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                b bVar2 = (b) this.a.get(i2);
                int a2 = this.e.a(bVar2.a.a);
                if (a2 != -1 && this.e.a(a2, this.g, false).c == i) {
                    if (bVar != null) {
                        return null;
                    }
                    bVar = bVar2;
                }
            }
            return bVar;
        }

        /* access modifiers changed from: 0000 */
        public b a(b bVar, arl arl) {
            int a2 = arl.a(bVar.a.a);
            if (a2 == -1) {
                return bVar;
            }
            return new b(bVar.a, arl, arl.a(a2, this.g, false).c);
        }

        public final b a(defpackage.ayg.a aVar) {
            return (b) this.b.get(aVar);
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            if (!this.a.isEmpty()) {
                this.c = (b) this.a.get(0);
            }
        }
    }

    protected arm(ard ard, bdn bdn) {
        if (ard != null) {
            this.e = ard;
        }
        this.c = (bdn) bdl.a(bdn);
        this.a = new CopyOnWriteArraySet<>();
        this.b = new c();
        this.d = new defpackage.arl.b();
    }

    @RequiresNonNull({"player"})
    private defpackage.arn.a a(arl arl, int i, defpackage.ayg.a aVar) {
        if (arl.a()) {
            aVar = null;
        }
        defpackage.ayg.a aVar2 = aVar;
        long a2 = this.c.a();
        boolean z = true;
        boolean z2 = arl == this.e.k() && i == this.e.d();
        long j = 0;
        if (aVar2 != null && aVar2.a()) {
            if (!(z2 && this.e.h() == aVar2.b && this.e.i() == aVar2.c)) {
                z = false;
            }
            if (z) {
                j = this.e.f();
            }
        } else if (z2) {
            j = this.e.j();
        } else if (!arl.a()) {
            j = aqm.a(arl.a(i, this.d, false).h);
        }
        defpackage.arn.a aVar3 = new defpackage.arn.a(a2, arl, i, aVar2, j, this.e.f(), this.e.g());
        return aVar3;
    }

    private defpackage.arn.a a(b bVar) {
        bdl.a(this.e);
        if (bVar == null) {
            int d2 = this.e.d();
            b a2 = this.b.a(d2);
            if (a2 == null) {
                arl k = this.e.k();
                if (!(d2 < k.b())) {
                    k = arl.a;
                }
                return a(k, d2, (defpackage.ayg.a) null);
            }
            bVar = a2;
        }
        return a(bVar.b, bVar.c, bVar.a);
    }

    private defpackage.arn.a d(int i, defpackage.ayg.a aVar) {
        bdl.a(this.e);
        if (aVar != null) {
            b a2 = this.b.a(aVar);
            return a2 != null ? a(a2) : a(arl.a, i, aVar);
        }
        arl k = this.e.k();
        if (!(i < k.b())) {
            k = arl.a;
        }
        return a(k, i, (defpackage.ayg.a) null);
    }

    private defpackage.arn.a h() {
        return a(this.b.c);
    }

    private defpackage.arn.a i() {
        return a(this.b.d);
    }

    public final void a() {
        if (this.b.f) {
            c cVar = this.b;
            cVar.f = false;
            cVar.b();
            g();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void a(int i) {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, int i2) {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, int i2, int i3, float f) {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, long j) {
        h();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, long j, long j2) {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, defpackage.ayg.a aVar) {
        c cVar = this.b;
        b bVar = new b(aVar, cVar.e.a(aVar.a) != -1 ? cVar.e : arl.a, i);
        cVar.a.add(bVar);
        cVar.b.put(aVar, bVar);
        if (cVar.a.size() == 1 && !cVar.e.a()) {
            cVar.b();
        }
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, defpackage.ayg.a aVar, defpackage.ayh.b bVar, defpackage.ayh.c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, defpackage.ayg.a aVar, defpackage.ayh.b bVar, defpackage.ayh.c cVar, IOException iOException, boolean z) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, defpackage.ayg.a aVar, defpackage.ayh.c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(Surface surface) {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(aqv aqv) {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(arc arc) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(arl arl, int i) {
        c cVar = this.b;
        for (int i2 = 0; i2 < cVar.a.size(); i2++) {
            b a2 = cVar.a((b) cVar.a.get(i2), arl);
            cVar.a.set(i2, a2);
            cVar.b.put(a2.a, a2);
        }
        if (cVar.d != null) {
            cVar.d = cVar.a(cVar.d, arl);
        }
        cVar.e = arl;
        cVar.b();
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(asl asl) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(awr awr) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(ayo ayo, bbv bbv) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(ExoPlaybackException exoPlaybackException) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(Exception exc) {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(String str, long j, long j2) {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(boolean z) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(boolean z, int i) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a_(int i) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b() {
        for (b bVar : new ArrayList(this.b.a)) {
            b(bVar.c, bVar.a);
        }
    }

    public final void b(int i) {
        this.b.b();
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(int i, long j, long j2) {
        c cVar = this.b;
        a(cVar.a.isEmpty() ? null : (b) cVar.a.get(cVar.a.size() - 1));
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(int i, defpackage.ayg.a aVar) {
        d(i, aVar);
        c cVar = this.b;
        b bVar = (b) cVar.b.remove(aVar);
        boolean z = false;
        if (bVar != null) {
            cVar.a.remove(bVar);
            if (cVar.d != null && aVar.equals(cVar.d.a)) {
                cVar.d = cVar.a.isEmpty() ? null : (b) cVar.a.get(0);
            }
            z = true;
        }
        if (z) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void b(int i, defpackage.ayg.a aVar, defpackage.ayh.b bVar, defpackage.ayh.c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(int i, defpackage.ayg.a aVar, defpackage.ayh.c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(aqv aqv) {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(asl asl) {
        h();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(String str, long j, long j2) {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c() {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c(int i, defpackage.ayg.a aVar) {
        c cVar = this.b;
        cVar.d = (b) cVar.b.get(aVar);
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c(int i, defpackage.ayg.a aVar, defpackage.ayh.b bVar, defpackage.ayh.c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c(asl asl) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void d() {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void d(asl asl) {
        h();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void e() {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void f() {
        h();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public defpackage.arn.a g() {
        return a(this.b.a());
    }
}
