package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ap reason: default package */
public final class ap {
    final ArrayList<is> a = new ArrayList<>();
    it b;
    boolean c;
    private long d = -1;
    private Interpolator e;
    private final iu f = new iu() {
        private boolean a = false;
        private int b = 0;

        public final void a(View view) {
            if (!this.a) {
                this.a = true;
                if (ap.this.b != null) {
                    ap.this.b.a(null);
                }
            }
        }

        public final void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == ap.this.a.size()) {
                if (ap.this.b != null) {
                    ap.this.b.b(null);
                }
                this.b = 0;
                this.a = false;
                ap.this.c = false;
            }
        }
    };

    public final ap a(is isVar) {
        if (!this.c) {
            this.a.add(isVar);
        }
        return this;
    }

    public final ap a(is isVar, is isVar2) {
        this.a.add(isVar);
        isVar2.b(isVar.a());
        this.a.add(isVar2);
        return this;
    }

    public final void a() {
        if (!this.c) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                is isVar = (is) it.next();
                long j = this.d;
                if (j >= 0) {
                    isVar.a(j);
                }
                Interpolator interpolator = this.e;
                if (interpolator != null) {
                    isVar.a(interpolator);
                }
                if (this.b != null) {
                    isVar.a((it) this.f);
                }
                isVar.c();
            }
            this.c = true;
        }
    }

    public final void b() {
        if (this.c) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((is) it.next()).b();
            }
            this.c = false;
        }
    }

    public final ap a(long j) {
        if (!this.c) {
            this.d = 250;
        }
        return this;
    }

    public final ap a(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
        return this;
    }

    public final ap a(it itVar) {
        if (!this.c) {
            this.b = itVar;
        }
        return this;
    }
}
