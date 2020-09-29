package defpackage;

/* renamed from: koa reason: default package */
public final class koa {
    /* JADX WARNING: Incorrect type for immutable var: ssa=I, code=I<java.lang.Object>, for r2v0, types: [I<java.lang.Object>, I, java.lang.Object, java.lang.Iterable] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <I extends java.lang.Iterable<T>, T> I a(I<java.lang.Object> r2) {
        /*
            a((T) r2)
            java.util.Iterator r0 = r2.iterator()
        L_0x0007:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0015
            java.lang.Object r1 = r0.next()
            a((T) r1)
            goto L_0x0007
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koa.a(java.lang.Iterable):java.lang.Iterable");
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static <T> T[] a(T[] tArr) {
        a((T) tArr);
        for (T a : tArr) {
            a(a);
        }
        return tArr;
    }
}
