package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: enk reason: default package */
final class enk extends enj {
    private static final Class<?> a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private enk() {
        super(0);
    }

    /* access modifiers changed from: 0000 */
    public final <L> List<L> a(Object obj, long j) {
        return a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    public final void b(Object obj, long j) {
        Object obj2;
        List list = (List) epk.f(obj, j);
        if (list instanceof eni) {
            obj2 = ((eni) list).e();
        } else if (!a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof eoi) || !(list instanceof enc)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                enc enc = (enc) list;
                if (enc.a()) {
                    enc.b();
                }
                return;
            }
        } else {
            return;
        }
        epk.a(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, elq, enh] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof defpackage.eni
            if (r1 == 0) goto L_0x0014
            enh r0 = new enh
            r0.<init>(r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof defpackage.eoi
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof defpackage.enc
            if (r1 == 0) goto L_0x0024
            enc r0 = (defpackage.enc) r0
            enc r6 = r0.a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            defpackage.epk.a(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            defpackage.epk.a(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof defpackage.eph
            if (r1 == 0) goto L_0x0062
            enh r1 = new enh
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            eph r0 = (defpackage.eph) r0
            r1.addAll(r0)
            defpackage.epk.a(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof defpackage.eoi
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof defpackage.enc
            if (r1 == 0) goto L_0x007f
            r1 = r0
            enc r1 = (defpackage.enc) r1
            boolean r2 = r1.a()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            enc r0 = r1.a(r0)
            defpackage.epk.a(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enk.a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    public final <E> void a(Object obj, Object obj2, long j) {
        List c = c(obj2, j);
        List a2 = a(obj, j, c.size());
        int size = a2.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a2.addAll(c);
        }
        if (size > 0) {
            c = a2;
        }
        epk.a(obj, j, (Object) c);
    }

    private static <E> List<E> c(Object obj, long j) {
        return (List) epk.f(obj, j);
    }

    /* synthetic */ enk(byte b) {
        this();
    }
}
