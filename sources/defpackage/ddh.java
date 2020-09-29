package defpackage;

import java.util.Map.Entry;

/* renamed from: ddh reason: default package */
final class ddh extends ddg<Object> {
    ddh() {
    }

    /* access modifiers changed from: 0000 */
    public final int a(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final ddj<Object> a(Object obj) {
        return ((c) obj).zzdtz;
    }

    /* access modifiers changed from: 0000 */
    public final <UT, UB> UB a() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final Object a(dde dde, deq deq, int i) {
        return (d) dde.b.get(new ddf(deq, i));
    }

    /* access modifiers changed from: 0000 */
    public final void a(Object obj, ddj<Object> ddj) {
        ((c) obj).zzdtz = ddj;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(deq deq) {
        return deq instanceof c;
    }

    /* access modifiers changed from: 0000 */
    public final ddj<Object> b(Object obj) {
        ddj<Object> a = a(obj);
        if (!a.b) {
            return a;
        }
        ddj<Object> ddj = (ddj) a.clone();
        a(obj, ddj);
        return ddj;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void b(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void c(Object obj) {
        a(obj).b();
    }
}
