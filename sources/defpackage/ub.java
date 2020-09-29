package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ub reason: default package */
public abstract class ub<T> implements tv<T> {
    public final List<String> a = new ArrayList();
    public T b;
    private uk<T> c;
    private a d;

    /* renamed from: ub$a */
    public interface a {
        void b(List<String> list);

        void c(List<String> list);
    }

    ub(uk<T> ukVar) {
        this.c = ukVar;
    }

    private void b() {
        if (!this.a.isEmpty() && this.d != null) {
            T t = this.b;
            if (t == null || b(t)) {
                this.d.c(this.a);
            } else {
                this.d.b(this.a);
            }
        }
    }

    public final void a() {
        if (!this.a.isEmpty()) {
            this.a.clear();
            this.c.b(this);
        }
    }

    public final void a(T t) {
        this.b = t;
        b();
    }

    public final void a(List<ux> list) {
        this.a.clear();
        for (ux uxVar : list) {
            if (a(uxVar)) {
                this.a.add(uxVar.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.b(this);
        } else {
            this.c.a((tv<T>) this);
        }
        b();
    }

    public final void a(a aVar) {
        if (this.d != aVar) {
            this.d = aVar;
            b();
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean a(ux uxVar);

    public abstract boolean b(T t);
}
