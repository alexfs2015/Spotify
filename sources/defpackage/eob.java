package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: eob reason: default package */
final class eob extends eoa {
    private static final Class<?> a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private eob() {
        super(0);
    }

    /* synthetic */ eob(byte b) {
        this();
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [eny, emh, java.lang.Object] */
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
            boolean r1 = r0 instanceof defpackage.enz
            if (r1 == 0) goto L_0x0014
            eny r0 = new eny
            r0.<init>(r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof defpackage.eoz
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof defpackage.ent
            if (r1 == 0) goto L_0x0024
            ent r0 = (defpackage.ent) r0
            ent r6 = r0.a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            defpackage.eqb.a(r3, r4, r0)
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
            defpackage.eqb.a(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof defpackage.epy
            if (r1 == 0) goto L_0x0062
            eny r1 = new eny
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            epy r0 = (defpackage.epy) r0
            r1.addAll(r0)
            defpackage.eqb.a(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof defpackage.eoz
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof defpackage.ent
            if (r1 == 0) goto L_0x007f
            r1 = r0
            ent r1 = (defpackage.ent) r1
            boolean r2 = r1.a()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            ent r0 = r1.a(r0)
            defpackage.eqb.a(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eob.a(java.lang.Object, long, int):java.util.List");
    }

    private static <E> List<E> c(Object obj, long j) {
        return (List) eqb.f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final <L> List<L> a(Object obj, long j) {
        return a(obj, j, 10);
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
        eqb.a(obj, j, (Object) c);
    }

    /* access modifiers changed from: 0000 */
    public final void b(Object obj, long j) {
        Object obj2;
        List list = (List) eqb.f(obj, j);
        if (list instanceof enz) {
            obj2 = ((enz) list).e();
        } else if (!a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof eoz) || !(list instanceof ent)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                ent ent = (ent) list;
                if (ent.a()) {
                    ent.b();
                }
                return;
            }
        } else {
            return;
        }
        eqb.a(obj, j, obj2);
    }
}
