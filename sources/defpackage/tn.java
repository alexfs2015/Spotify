package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tn reason: default package */
public abstract class tn<T> implements th<T> {
    public final List<String> a = new ArrayList();
    public T b;
    private tw<T> c;
    private a d;

    /* renamed from: tn$a */
    public interface a {
        void b(List<String> list);

        void c(List<String> list);
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean a(uj ujVar);

    public abstract boolean b(T t);

    tn(tw<T> twVar) {
        this.c = twVar;
    }

    public final void a(a aVar) {
        if (this.d != aVar) {
            this.d = aVar;
            b();
        }
    }

    public final void a(List<uj> list) {
        this.a.clear();
        for (uj ujVar : list) {
            if (a(ujVar)) {
                this.a.add(ujVar.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.b(this);
        } else {
            this.c.a((th<T>) this);
        }
        b();
    }

    public final void a() {
        if (!this.a.isEmpty()) {
            this.a.clear();
            this.c.b(this);
        }
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

    public final void a(T t) {
        this.b = t;
        b();
    }
}
