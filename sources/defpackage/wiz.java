package defpackage;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: wiz reason: default package */
final class wiz {
    private static final long a;
    private static final Method b;
    private static final boolean c;
    private static final wjw d;
    private static /* synthetic */ boolean e;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r2 = r1.getClass().getDeclaredMethod("clean", new java.lang.Class[0]);
        r2.invoke(r1, new java.lang.Object[0]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    static {
        /*
            java.lang.Class<wiz> r0 = defpackage.wiz.class
            boolean r1 = r0.desiredAssertionStatus()
            r2 = 1
            r1 = r1 ^ r2
            e = r1
            wjw r0 = defpackage.wjx.a(r0)
            d = r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r2)
            boolean r1 = defpackage.wjl.b()
            r3 = 0
            r4 = -1
            r6 = 0
            if (r1 == 0) goto L_0x004e
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x004e }
            java.lang.String r7 = "cleaner"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r7)     // Catch:{ all -> 0x004e }
            r1.setAccessible(r2)     // Catch:{ all -> 0x004e }
            long r7 = defpackage.wjl.a(r1)     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x004e }
            r9 = r1
            java.lang.Runnable r9 = (java.lang.Runnable) r9     // Catch:{ ClassCastException -> 0x003b }
            r9.run()     // Catch:{ ClassCastException -> 0x003b }
            r6 = 1
            goto L_0x004f
        L_0x003b:
            java.lang.Class r2 = r1.getClass()     // Catch:{ all -> 0x004e }
            java.lang.String r9 = "clean"
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x004e }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r9, r10)     // Catch:{ all -> 0x004e }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x004e }
            r2.invoke(r1, r9)     // Catch:{ all -> 0x004e }
            r3 = r2
            goto L_0x004f
        L_0x004e:
            r7 = r4
        L_0x004f:
            wjw r1 = d
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0058
            java.lang.String r2 = "available"
            goto L_0x005a
        L_0x0058:
            java.lang.String r2 = "unavailable"
        L_0x005a:
            java.lang.String r4 = "java.nio.ByteBuffer.cleaner(): {}"
            r1.b(r4, r2)
            a = r7
            b = r3
            c = r6
            a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiz.<clinit>():void");
    }

    static void a(ByteBuffer byteBuffer) {
        if (a != -1 && byteBuffer.isDirect()) {
            if (e || b != null || c) {
                try {
                    Object a2 = wjl.a((Object) byteBuffer, a);
                    if (a2 == null) {
                        return;
                    }
                    if (c) {
                        ((Runnable) a2).run();
                    } else {
                        b.invoke(a2, new Object[0]);
                    }
                } catch (Throwable unused) {
                }
            } else {
                throw new AssertionError("CLEANER_FIELD_OFFSET != -1 implies CLEAN_METHOD != null or CLEANER_IS_RUNNABLE == true");
            }
        }
    }

    private wiz() {
    }
}
