package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yr reason: default package */
public abstract class yr<K, A> {
    final List<a> a = new ArrayList();
    public boolean b = false;
    public float c = 0.0f;
    protected acn<A> d;
    private final List<? extends acl<K>> e;
    private acl<K> f;

    /* renamed from: yr$a */
    public interface a {
        void a();
    }

    yr(List<? extends acl<K>> list) {
        this.e = list;
    }

    private acl<K> e() {
        acl<K> acl = this.f;
        if (acl != null && acl.a(this.c)) {
            return this.f;
        }
        List<? extends acl<K>> list = this.e;
        acl<K> acl2 = (acl) list.get(list.size() - 1);
        if (this.c < acl2.a()) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                acl2 = (acl) this.e.get(size);
                if (acl2.a(this.c)) {
                    break;
                }
            }
        }
        this.f = acl2;
        return acl2;
    }

    private float f() {
        if (this.e.isEmpty()) {
            return 0.0f;
        }
        return ((acl) this.e.get(0)).a();
    }

    /* access modifiers changed from: 0000 */
    public abstract A a(acl<K> acl, float f2);

    public void a() {
        for (int i = 0; i < this.a.size(); i++) {
            ((a) this.a.get(i)).a();
        }
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

    public final void a(acn<A> acn) {
        acn<A> acn2 = this.d;
        if (acn2 != null) {
            acn2.a = null;
        }
        this.d = acn;
        if (acn != null) {
            acn.a = this;
        }
    }

    public final void a(a aVar) {
        this.a.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    public final float b() {
        if (this.b) {
            return 0.0f;
        }
        acl e2 = e();
        if (e2.c()) {
            return 0.0f;
        }
        return (this.c - e2.a()) / (e2.b() - e2.a());
    }

    /* access modifiers changed from: 0000 */
    public float c() {
        if (this.e.isEmpty()) {
            return 1.0f;
        }
        List<? extends acl<K>> list = this.e;
        return ((acl) list.get(list.size() - 1)).b();
    }

    public A d() {
        acl e2 = e();
        acl e3 = e();
        return a(e2, e3.c() ? 0.0f : e3.d.getInterpolation(b()));
    }
}
