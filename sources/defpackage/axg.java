package defpackage;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: axg reason: default package */
public abstract class axg<T> extends axe {
    private final HashMap<T, b> a = new HashMap<>();
    private apz b;
    private Handler c;
    private bcd d;

    /* renamed from: axg$a */
    final class a implements axq {
        private final T a;
        private defpackage.axq.a b;

        public a(T t) {
            this.b = axg.this.a((defpackage.axp.a) null);
            this.a = t;
        }

        public final void a(int i, defpackage.axp.a aVar) {
            if (d(i, aVar)) {
                this.b.a();
            }
        }

        public final void b(int i, defpackage.axp.a aVar) {
            if (d(i, aVar)) {
                this.b.b();
            }
        }

        public final void a(int i, defpackage.axp.a aVar, defpackage.axq.b bVar, c cVar) {
            if (d(i, aVar)) {
                this.b.a(bVar, a(cVar));
            }
        }

        public final void b(int i, defpackage.axp.a aVar, defpackage.axq.b bVar, c cVar) {
            if (d(i, aVar)) {
                this.b.b(bVar, a(cVar));
            }
        }

        public final void c(int i, defpackage.axp.a aVar, defpackage.axq.b bVar, c cVar) {
            if (d(i, aVar)) {
                this.b.c(bVar, a(cVar));
            }
        }

        public final void a(int i, defpackage.axp.a aVar, defpackage.axq.b bVar, c cVar, IOException iOException, boolean z) {
            if (d(i, aVar)) {
                this.b.a(bVar, a(cVar), iOException, z);
            }
        }

        public final void c(int i, defpackage.axp.a aVar) {
            if (d(i, aVar)) {
                this.b.c();
            }
        }

        public final void a(int i, defpackage.axp.a aVar, c cVar) {
            if (d(i, aVar)) {
                this.b.a(a(cVar));
            }
        }

        public final void b(int i, defpackage.axp.a aVar, c cVar) {
            if (d(i, aVar)) {
                this.b.b(a(cVar));
            }
        }

        private boolean d(int i, defpackage.axp.a aVar) {
            if (aVar == null) {
                aVar = null;
            } else if (aVar == null) {
                return false;
            }
            if (this.b.a != i || !bdw.a((Object) this.b.b, (Object) aVar)) {
                this.b = axg.this.a(i, aVar, 0);
            }
            return true;
        }

        private c a(c cVar) {
            long j = cVar.f;
            long j2 = cVar.g;
            if (j == cVar.f && j2 == cVar.g) {
                return cVar;
            }
            c cVar2 = new c(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, j, j2);
            return cVar2;
        }
    }

    /* renamed from: axg$b */
    static final class b {
        public final axp a;
        public final defpackage.axp.b b;
        public final axq c;

        public b(axp axp, defpackage.axp.b bVar, axq axq) {
            this.a = axp;
            this.b = bVar;
            this.c = axq;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void b(T t, axp axp, aqu aqu, Object obj);

    protected axg() {
    }

    public void a(apz apz, boolean z, bcd bcd) {
        this.b = apz;
        this.d = bcd;
        this.c = new Handler();
    }

    public final void b() {
        for (b bVar : this.a.values()) {
            bVar.a.b();
        }
    }

    public final void ao_() {
        for (b bVar : this.a.values()) {
            bVar.a.a(bVar.b);
            bVar.a.a(bVar.c);
        }
        this.a.clear();
        this.b = null;
    }

    /* access modifiers changed from: protected */
    public final void a(T t, axp axp) {
        bcu.a(!this.a.containsKey(null));
        $$Lambda$axg$ERVzTIAZjo4bPMYlKAPv8FDqRxI r5 = new $$Lambda$axg$ERVzTIAZjo4bPMYlKAPv8FDqRxI(this, null);
        a aVar = new a(null);
        this.a.put(null, new b(axp, r5, aVar));
        axp.a((Handler) bcu.a(this.c), (axq) aVar);
        axp.a((apz) bcu.a(this.b), false, r5, this.d);
    }
}
