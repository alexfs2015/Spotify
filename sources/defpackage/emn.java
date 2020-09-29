package defpackage;

import java.util.Map.Entry;

/* renamed from: emn reason: default package */
final class emn extends emm<Object> {
    emn() {
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(enx enx) {
        return enx instanceof c;
    }

    /* access modifiers changed from: 0000 */
    public final emp<Object> a(Object obj) {
        return ((c) obj).zzbzn;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Object obj, emp<Object> emp) {
        ((c) obj).zzbzn = emp;
    }

    /* access modifiers changed from: 0000 */
    public final emp<Object> b(Object obj) {
        emp<Object> a = a(obj);
        if (!a.b) {
            return a;
        }
        emp<Object> emp = (emp) a.clone();
        a(obj, emp);
        return emp;
    }

    /* access modifiers changed from: 0000 */
    public final void c(Object obj) {
        a(obj).b();
    }

    /* access modifiers changed from: 0000 */
    public final <UT, UB> UB a() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final int a(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void b(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final Object a(eml eml, enx enx, int i) {
        return (d) eml.b.get(new a(enx, i));
    }
}
