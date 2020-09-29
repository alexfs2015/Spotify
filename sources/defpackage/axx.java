package defpackage;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: axx reason: default package */
public abstract class axx<T> extends axv {
    private final HashMap<T, b> a = new HashMap<>();
    private aqq b;
    private Handler c;
    private bcu d;

    /* renamed from: axx$a */
    final class a implements ayh {
        private final T a;
        private defpackage.ayh.a b;

        public a(T t) {
            this.b = axx.this.a((defpackage.ayg.a) null);
            this.a = t;
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

        private boolean d(int i, defpackage.ayg.a aVar) {
            if (aVar == null) {
                aVar = null;
            } else if (aVar == null) {
                return false;
            }
            if (this.b.a != i || !ben.a((Object) this.b.b, (Object) aVar)) {
                this.b = axx.this.a(i, aVar, 0);
            }
            return true;
        }

        public final void a(int i, defpackage.ayg.a aVar) {
            if (d(i, aVar)) {
                this.b.a();
            }
        }

        public final void a(int i, defpackage.ayg.a aVar, defpackage.ayh.b bVar, c cVar) {
            if (d(i, aVar)) {
                this.b.a(bVar, a(cVar));
            }
        }

        public final void a(int i, defpackage.ayg.a aVar, defpackage.ayh.b bVar, c cVar, IOException iOException, boolean z) {
            if (d(i, aVar)) {
                this.b.a(bVar, a(cVar), iOException, z);
            }
        }

        public final void a(int i, defpackage.ayg.a aVar, c cVar) {
            if (d(i, aVar)) {
                this.b.a(a(cVar));
            }
        }

        public final void b(int i, defpackage.ayg.a aVar) {
            if (d(i, aVar)) {
                this.b.b();
            }
        }

        public final void b(int i, defpackage.ayg.a aVar, defpackage.ayh.b bVar, c cVar) {
            if (d(i, aVar)) {
                this.b.b(bVar, a(cVar));
            }
        }

        public final void b(int i, defpackage.ayg.a aVar, c cVar) {
            if (d(i, aVar)) {
                this.b.b(a(cVar));
            }
        }

        public final void c(int i, defpackage.ayg.a aVar) {
            if (d(i, aVar)) {
                this.b.c();
            }
        }

        public final void c(int i, defpackage.ayg.a aVar, defpackage.ayh.b bVar, c cVar) {
            if (d(i, aVar)) {
                this.b.c(bVar, a(cVar));
            }
        }
    }

    /* renamed from: axx$b */
    static final class b {
        public final ayg a;
        public final defpackage.ayg.b b;
        public final ayh c;

        public b(ayg ayg, defpackage.ayg.b bVar, ayh ayh) {
            this.a = ayg;
            this.b = bVar;
            this.c = ayh;
        }
    }

    protected axx() {
    }

    public void a(aqq aqq, boolean z, bcu bcu) {
        this.b = aqq;
        this.d = bcu;
        this.c = new Handler();
    }

    /* access modifiers changed from: protected */
    public final void a(T t, ayg ayg) {
        bdl.a(!this.a.containsKey(null));
        $$Lambda$axx$BnkH20TOwezr2EcEMXLygslgm0 r5 = new $$Lambda$axx$BnkH20TOwezr2EcEMXLygslgm0(this, null);
        a aVar = new a(null);
        this.a.put(null, new b(ayg, r5, aVar));
        ayg.a((Handler) bdl.a(this.c), (ayh) aVar);
        ayg.a((aqq) bdl.a(this.b), false, r5, this.d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void b(T t, ayg ayg, arl arl, Object obj);

    public final void an_() {
        for (b bVar : this.a.values()) {
            bVar.a.a(bVar.b);
            bVar.a.a(bVar.c);
        }
        this.a.clear();
        this.b = null;
    }

    public final void b() {
        for (b bVar : this.a.values()) {
            bVar.a.b();
        }
    }
}
