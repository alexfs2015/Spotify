package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yd reason: default package */
public abstract class yd<K, A> {
    final List<a> a = new ArrayList();
    public boolean b = false;
    public float c = 0.0f;
    protected abz<A> d;
    private final List<? extends abx<K>> e;
    private abx<K> f;

    /* renamed from: yd$a */
    public interface a {
        void a();
    }

    /* access modifiers changed from: 0000 */
    public abstract A a(abx<K> abx, float f2);

    yd(List<? extends abx<K>> list) {
        this.e = list;
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }

    public void a(float f2) {
        if (f2 < f()) {
            f2 = f();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 != this.c) {
            this.c = f2;
            a();
        }
    }

    public void a() {
        for (int i = 0; i < this.a.size(); i++) {
            ((a) this.a.get(i)).a();
        }
    }

    private abx<K> e() {
        abx<K> abx = this.f;
        if (abx != null && abx.a(this.c)) {
            return this.f;
        }
        List<? extends abx<K>> list = this.e;
        abx<K> abx2 = (abx) list.get(list.size() - 1);
        if (this.c < abx2.a()) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                abx2 = (abx) this.e.get(size);
                if (abx2.a(this.c)) {
                    break;
                }
            }
        }
        this.f = abx2;
        return abx2;
    }

    /* access modifiers changed from: 0000 */
    public final float b() {
        if (this.b) {
            return 0.0f;
        }
        abx e2 = e();
        if (e2.c()) {
            return 0.0f;
        }
        return (this.c - e2.a()) / (e2.b() - e2.a());
    }

    private float f() {
        if (this.e.isEmpty()) {
            return 0.0f;
        }
        return ((abx) this.e.get(0)).a();
    }

    /* access modifiers changed from: 0000 */
    public float c() {
        if (this.e.isEmpty()) {
            return 1.0f;
        }
        List<? extends abx<K>> list = this.e;
        return ((abx) list.get(list.size() - 1)).b();
    }

    public A d() {
        float f2;
        abx e2 = e();
        abx e3 = e();
        if (e3.c()) {
            f2 = 0.0f;
        } else {
            f2 = e3.d.getInterpolation(b());
        }
        return a(e2, f2);
    }

    public final void a(abz<A> abz) {
        abz<A> abz2 = this.d;
        if (abz2 != null) {
            abz2.a = null;
        }
        this.d = abz;
        if (abz != null) {
            abz.a = this;
        }
    }
}
