package defpackage;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wzv reason: default package */
public final class wzv {
    private static final wzv a = new wzv();
    private static wzr g = new wzr() {
    };
    private final AtomicReference<wzr> b = new AtomicReference<>();
    private final AtomicReference<wzt> c = new AtomicReference<>();
    private final AtomicReference<wzx> d = new AtomicReference<>();
    private final AtomicReference<wzq> e = new AtomicReference<>();
    private final AtomicReference<wzw> f = new AtomicReference<>();

    @Deprecated
    public static wzv a() {
        return a;
    }

    wzv() {
    }

    public final wzr b() {
        if (this.b.get() == null) {
            Object a2 = a(wzr.class, g());
            if (a2 == null) {
                this.b.compareAndSet(null, g);
            } else {
                this.b.compareAndSet(null, (wzr) a2);
            }
        }
        return (wzr) this.b.get();
    }

    public final wzt c() {
        if (this.c.get() == null) {
            Object a2 = a(wzt.class, g());
            if (a2 == null) {
                this.c.compareAndSet(null, wzu.a());
            } else {
                this.c.compareAndSet(null, (wzt) a2);
            }
        }
        return (wzt) this.c.get();
    }

    public final wzx d() {
        if (this.d.get() == null) {
            Object a2 = a(wzx.class, g());
            if (a2 == null) {
                this.d.compareAndSet(null, wzy.a());
            } else {
                this.d.compareAndSet(null, (wzx) a2);
            }
        }
        return (wzx) this.d.get();
    }

    public final wzq e() {
        if (this.e.get() == null) {
            Object a2 = a(wzq.class, g());
            if (a2 == null) {
                this.e.compareAndSet(null, new wzq() {
                });
            } else {
                this.e.compareAndSet(null, (wzq) a2);
            }
        }
        return (wzq) this.e.get();
    }

    private static Properties g() {
        try {
            return System.getProperties();
        } catch (SecurityException unused) {
            return new Properties();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0060, code lost:
        r3 = r7.substring(0, r7.length() - 6).substring(14);
        r5 = new java.lang.StringBuilder();
        r5.append(r2);
        r5.append(r3);
        r5.append(r4);
        r2 = r5.toString();
        r11 = r11.getProperty(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0087, code lost:
        if (r11 == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0089, code lost:
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3 = new java.lang.StringBuilder("Implementing class declaration for ");
        r3.append(r0);
        r3.append(" missing: ");
        r3.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a6, code lost:
        throw new java.lang.IllegalStateException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a8, code lost:
        r9 = r1;
        r1 = r11;
        r11 = r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b2 A[SYNTHETIC, Splitter:B:24:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object a(java.lang.Class<?> r10, java.util.Properties r11) {
        /*
            java.lang.Object r11 = r11.clone()
            java.util.Properties r11 = (java.util.Properties) r11
            java.lang.String r0 = r10.getSimpleName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "rxjava.plugin."
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = ".implementation"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r11.getProperty(r1)
            if (r1 != 0) goto L_0x00b0
            java.lang.String r3 = ".class"
            java.lang.String r4 = ".impl"
            java.util.Set r5 = r11.entrySet()     // Catch:{ SecurityException -> 0x00ac }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ SecurityException -> 0x00ac }
        L_0x0032:
            boolean r6 = r5.hasNext()     // Catch:{ SecurityException -> 0x00ac }
            if (r6 == 0) goto L_0x00b0
            java.lang.Object r6 = r5.next()     // Catch:{ SecurityException -> 0x00ac }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ SecurityException -> 0x00ac }
            java.lang.Object r7 = r6.getKey()     // Catch:{ SecurityException -> 0x00ac }
            java.lang.String r7 = r7.toString()     // Catch:{ SecurityException -> 0x00ac }
            boolean r8 = r7.startsWith(r2)     // Catch:{ SecurityException -> 0x00ac }
            if (r8 == 0) goto L_0x0032
            boolean r8 = r7.endsWith(r3)     // Catch:{ SecurityException -> 0x00ac }
            if (r8 == 0) goto L_0x0032
            java.lang.Object r6 = r6.getValue()     // Catch:{ SecurityException -> 0x00ac }
            java.lang.String r6 = r6.toString()     // Catch:{ SecurityException -> 0x00ac }
            boolean r6 = r0.equals(r6)     // Catch:{ SecurityException -> 0x00ac }
            if (r6 == 0) goto L_0x0032
            r3 = 0
            int r5 = r7.length()     // Catch:{ SecurityException -> 0x00ac }
            int r5 = r5 + -6
            java.lang.String r3 = r7.substring(r3, r5)     // Catch:{ SecurityException -> 0x00ac }
            r5 = 14
            java.lang.String r3 = r3.substring(r5)     // Catch:{ SecurityException -> 0x00ac }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00ac }
            r5.<init>()     // Catch:{ SecurityException -> 0x00ac }
            r5.append(r2)     // Catch:{ SecurityException -> 0x00ac }
            r5.append(r3)     // Catch:{ SecurityException -> 0x00ac }
            r5.append(r4)     // Catch:{ SecurityException -> 0x00ac }
            java.lang.String r2 = r5.toString()     // Catch:{ SecurityException -> 0x00ac }
            java.lang.String r11 = r11.getProperty(r2)     // Catch:{ SecurityException -> 0x00ac }
            if (r11 == 0) goto L_0x008b
            r1 = r11
            goto L_0x00b0
        L_0x008b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x00a7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00a7 }
            java.lang.String r4 = "Implementing class declaration for "
            r3.<init>(r4)     // Catch:{ SecurityException -> 0x00a7 }
            r3.append(r0)     // Catch:{ SecurityException -> 0x00a7 }
            java.lang.String r4 = " missing: "
            r3.append(r4)     // Catch:{ SecurityException -> 0x00a7 }
            r3.append(r2)     // Catch:{ SecurityException -> 0x00a7 }
            java.lang.String r2 = r3.toString()     // Catch:{ SecurityException -> 0x00a7 }
            r1.<init>(r2)     // Catch:{ SecurityException -> 0x00a7 }
            throw r1     // Catch:{ SecurityException -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            r9 = r1
            r1 = r11
            r11 = r9
            goto L_0x00ad
        L_0x00ac:
            r11 = move-exception
        L_0x00ad:
            r11.printStackTrace()
        L_0x00b0:
            if (r1 == 0) goto L_0x0133
            java.lang.Class r11 = java.lang.Class.forName(r1)     // Catch:{ ClassCastException -> 0x0110, ClassNotFoundException -> 0x00f5, InstantiationException -> 0x00da, IllegalAccessException -> 0x00bf }
            java.lang.Class r10 = r11.asSubclass(r10)     // Catch:{ ClassCastException -> 0x0110, ClassNotFoundException -> 0x00f5, InstantiationException -> 0x00da, IllegalAccessException -> 0x00bf }
            java.lang.Object r10 = r10.newInstance()     // Catch:{ ClassCastException -> 0x0110, ClassNotFoundException -> 0x00f5, InstantiationException -> 0x00da, IllegalAccessException -> 0x00bf }
            return r10
        L_0x00bf:
            r10 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " implementation not able to be accessed: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r11.<init>(r0, r10)
            throw r11
        L_0x00da:
            r10 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " implementation not able to be instantiated: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r11.<init>(r0, r10)
            throw r11
        L_0x00f5:
            r10 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " implementation class not found: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r11.<init>(r0, r10)
            throw r11
        L_0x0110:
            r10 = move-exception
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = " implementation is not an instance of "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r11.<init>(r0, r10)
            throw r11
        L_0x0133:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzv.a(java.lang.Class, java.util.Properties):java.lang.Object");
    }

    public final wzw f() {
        if (this.f.get() == null) {
            Object a2 = a(wzw.class, g());
            if (a2 == null) {
                this.f.compareAndSet(null, wzw.d());
            } else {
                this.f.compareAndSet(null, (wzw) a2);
            }
        }
        return (wzw) this.f.get();
    }
}
