package defpackage;

import java.util.List;

/* renamed from: dee reason: default package */
final class dee extends dec {
    private dee() {
        super(0);
    }

    /* synthetic */ dee(byte b) {
        this();
    }

    private static <E> ddu<E> c(Object obj, long j) {
        return (ddu) dgh.f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final <L> List<L> a(Object obj, long j) {
        ddu c = c(obj, j);
        if (c.a()) {
            return c;
        }
        int size = c.size();
        ddu a = c.a(size == 0 ? 10 : size << 1);
        dgh.a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final <E> void a(Object obj, Object obj2, long j) {
        ddu c = c(obj, j);
        ddu c2 = c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.a()) {
                c = c.a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        dgh.a(obj, j, (Object) c2);
    }

    /* access modifiers changed from: 0000 */
    public final void b(Object obj, long j) {
        c(obj, j).b();
    }
}
