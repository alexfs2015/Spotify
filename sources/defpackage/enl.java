package defpackage;

import java.util.List;

/* renamed from: enl reason: default package */
final class enl extends enj {
    private enl() {
        super(0);
    }

    /* access modifiers changed from: 0000 */
    public final <L> List<L> a(Object obj, long j) {
        enc c = c(obj, j);
        if (c.a()) {
            return c;
        }
        int size = c.size();
        enc a = c.a(size == 0 ? 10 : size << 1);
        epk.a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final void b(Object obj, long j) {
        c(obj, j).b();
    }

    /* access modifiers changed from: 0000 */
    public final <E> void a(Object obj, Object obj2, long j) {
        enc c = c(obj, j);
        enc c2 = c(obj2, j);
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
        epk.a(obj, j, (Object) c2);
    }

    private static <E> enc<E> c(Object obj, long j) {
        return (enc) epk.f(obj, j);
    }

    /* synthetic */ enl(byte b) {
        this();
    }
}
