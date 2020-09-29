package defpackage;

import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: aqv reason: default package */
public final class aqv implements defpackage.aqm.a, arb, arc, asa, awe, axq, defpackage.bbj.a, bef, beg {
    public final CopyOnWriteArraySet<aqw> a;
    public final c b;
    private final bcw c;
    private final defpackage.aqu.b d;
    private aqm e;

    /* renamed from: aqv$a */
    public static class a {
        public static aqv a(aqm aqm, bcw bcw) {
            return new aqv(aqm, bcw);
        }
    }

    /* renamed from: aqv$b */
    static final class b {
        public final defpackage.axp.a a;
        public final aqu b;
        public final int c;

        public b(defpackage.axp.a aVar, aqu aqu, int i) {
            this.a = aVar;
            this.b = aqu;
            this.c = i;
        }
    }

    /* renamed from: aqv$c */
    public static final class c {
        final ArrayList<b> a = new ArrayList<>();
        final HashMap<defpackage.axp.a, b> b = new HashMap<>();
        b c;
        b d;
        aqu e = aqu.a;
        public boolean f;
        private final defpackage.aqu.a g = new defpackage.aqu.a();

        public final b a() {
            if (this.a.isEmpty() || this.e.a() || this.f) {
                return null;
            }
            return (b) this.a.get(0);
        }

        public final b a(defpackage.axp.a aVar) {
            return (b) this.b.get(aVar);
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
        public void b() {
            if (!this.a.isEmpty()) {
                this.c = (b) this.a.get(0);
            }
        }

        /* access modifiers changed from: 0000 */
        public b a(b bVar, aqu aqu) {
            int a2 = aqu.a(bVar.a.a);
            if (a2 == -1) {
                return bVar;
            }
            return new b(bVar.a, aqu, aqu.a(a2, this.g, false).c);
        }
    }

    protected aqv(aqm aqm, bcw bcw) {
        if (aqm != null) {
            this.e = aqm;
        }
        this.c = (bcw) bcu.a(bcw);
        this.a = new CopyOnWriteArraySet<>();
        this.b = new c();
        this.d = new defpackage.aqu.b();
    }

    public final void b() {
        for (b bVar : new ArrayList(this.b.a)) {
            b(bVar.c, bVar.a);
        }
    }

    public final void a(awa awa) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c(aru aru) {
        g();
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

    public final void b(aqe aqe) {
        i();
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

    public final void d(aru aru) {
        h();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i) {
        i();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(aru aru) {
        g();
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

    public final void a(aqe aqe) {
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

    public final void b(aru aru) {
        h();
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

    public final void a(int i, int i2, int i3, float f) {
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

    public final void a(int i, defpackage.axp.a aVar) {
        c cVar = this.b;
        b bVar = new b(aVar, cVar.e.a(aVar.a) != -1 ? cVar.e : aqu.a, i);
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

    public final void b(int i, defpackage.axp.a aVar) {
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

    public final void a(int i, defpackage.axp.a aVar, defpackage.axq.b bVar, defpackage.axq.c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(int i, defpackage.axp.a aVar, defpackage.axq.b bVar, defpackage.axq.c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c(int i, defpackage.axp.a aVar, defpackage.axq.b bVar, defpackage.axq.c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, defpackage.axp.a aVar, defpackage.axq.b bVar, defpackage.axq.c cVar, IOException iOException, boolean z) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c(int i, defpackage.axp.a aVar) {
        c cVar = this.b;
        cVar.d = (b) cVar.b.get(aVar);
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int i, defpackage.axp.a aVar, defpackage.axq.c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void b(int i, defpackage.axp.a aVar, defpackage.axq.c cVar) {
        d(i, aVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(aqu aqu, int i) {
        c cVar = this.b;
        for (int i2 = 0; i2 < cVar.a.size(); i2++) {
            b a2 = cVar.a((b) cVar.a.get(i2), aqu);
            cVar.a.set(i2, a2);
            cVar.b.put(a2.a, a2);
        }
        if (cVar.d != null) {
            cVar.d = cVar.a(cVar.d, aqu);
        }
        cVar.e = aqu;
        cVar.b();
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(axx axx, bbe bbe) {
        g();
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

    public final void a(ExoPlaybackException exoPlaybackException) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
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

    public final void a(aql aql) {
        g();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
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

    public final void c() {
        i();
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

    public final void a(Exception exc) {
        i();
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

    @RequiresNonNull({"player"})
    private defpackage.aqw.a a(aqu aqu, int i, defpackage.axp.a aVar) {
        if (aqu.a()) {
            aVar = null;
        }
        defpackage.axp.a aVar2 = aVar;
        long a2 = this.c.a();
        boolean z = true;
        boolean z2 = aqu == this.e.k() && i == this.e.d();
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
        } else if (!aqu.a()) {
            j = apv.a(aqu.a(i, this.d, false).h);
        }
        defpackage.aqw.a aVar3 = new defpackage.aqw.a(a2, aqu, i, aVar2, j, this.e.f(), this.e.g());
        return aVar3;
    }

    private defpackage.aqw.a a(b bVar) {
        bcu.a(this.e);
        if (bVar == null) {
            int d2 = this.e.d();
            b a2 = this.b.a(d2);
            if (a2 == null) {
                aqu k = this.e.k();
                if (!(d2 < k.b())) {
                    k = aqu.a;
                }
                return a(k, d2, (defpackage.axp.a) null);
            }
            bVar = a2;
        }
        return a(bVar.b, bVar.c, bVar.a);
    }

    private defpackage.aqw.a h() {
        return a(this.b.c);
    }

    public defpackage.aqw.a g() {
        return a(this.b.a());
    }

    private defpackage.aqw.a i() {
        return a(this.b.d);
    }

    private defpackage.aqw.a d(int i, defpackage.axp.a aVar) {
        bcu.a(this.e);
        if (aVar != null) {
            b a2 = this.b.a(aVar);
            if (a2 != null) {
                return a(a2);
            }
            return a(aqu.a, i, aVar);
        }
        aqu k = this.e.k();
        if (!(i < k.b())) {
            k = aqu.a;
        }
        return a(k, i, (defpackage.axp.a) null);
    }

    public final void b(int i, long j, long j2) {
        b bVar;
        c cVar = this.b;
        if (cVar.a.isEmpty()) {
            bVar = null;
        } else {
            bVar = (b) cVar.a.get(cVar.a.size() - 1);
        }
        a(bVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
