package defpackage;

import io.netty.util.internal.PlatformDependent;
import javassist.ClassClassPath;
import javassist.ClassPool;

/* renamed from: wjd reason: default package */
public final class wjd {
    private static final wjw a = wjx.a(wjd.class);
    private static final ClassPool b;

    static {
        ClassPool classPool = new ClassPool(true);
        b = classPool;
        classPool.appendClassPath(new ClassClassPath(wjj.class));
    }

    public static wjq a(Class<?> cls) {
        ClassLoader n = PlatformDependent.n();
        if (n == null) {
            n = PlatformDependent.o();
        }
        return a(cls, n);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00ad, code lost:
        return (defpackage.wjq) r12.newInstance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b5, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3 = b.getAndRename(defpackage.wjj.class.getName(), r1);
        r3.setModifiers(r3.getModifiers() | 16);
        r4 = r3.getDeclaredMethod("match");
        r5 = new java.lang.StringBuilder("{ return $1 instanceof ");
        r5.append(r0);
        r5.append("; }");
        r4.setBody(r5.toString());
        r0 = r3.toBytecode();
        r3.detach();
        r3 = java.lang.ClassLoader.class.getDeclaredMethod("defineClass", new java.lang.Class[]{java.lang.String.class, byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
        r3.setAccessible(true);
        r12 = (java.lang.Class) r3.invoke(r12, new java.lang.Object[]{r1, r0, java.lang.Integer.valueOf(0), java.lang.Integer.valueOf(r0.length)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x009a, code lost:
        if (r11 != java.lang.Object.class) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x009c, code lost:
        a.b("Generated: {}", (java.lang.Object) r12.getName());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0026 */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023 A[ExcHandler: RuntimeException (r11v5 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0018] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.wjq a(java.lang.Class<?> r11, java.lang.ClassLoader r12) {
        /*
            java.lang.String r0 = b(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "io.netty.util.internal.__matchers__."
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = "Matcher"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            java.lang.Class r3 = java.lang.Class.forName(r1, r2, r12)     // Catch:{ Exception -> 0x0026, RuntimeException -> 0x0023 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x0026, RuntimeException -> 0x0023 }
            wjq r3 = (defpackage.wjq) r3     // Catch:{ Exception -> 0x0026, RuntimeException -> 0x0023 }
            return r3
        L_0x0023:
            r11 = move-exception
            goto L_0x00b5
        L_0x0026:
            javassist.ClassPool r3 = b     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Class<wjj> r4 = defpackage.wjj.class
            java.lang.String r4 = r4.getName()     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            javassist.CtClass r3 = r3.getAndRename(r4, r1)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            int r4 = r3.getModifiers()     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r4 = r4 | 16
            r3.setModifiers(r4)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.String r4 = "match"
            javassist.CtMethod r4 = r3.getDeclaredMethod(r4)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.String r6 = "{ return $1 instanceof "
            r5.<init>(r6)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r5.append(r0)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.String r0 = "; }"
            r5.append(r0)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.String r0 = r5.toString()     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r4.setBody(r0)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            byte[] r0 = r3.toBytecode()     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r3.detach()     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Class<java.lang.ClassLoader> r3 = java.lang.ClassLoader.class
            java.lang.String r4 = "defineClass"
            r5 = 4
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r8 = 0
            r6[r8] = r7     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Class<byte[]> r7 = byte[].class
            r6[r2] = r7     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r9 = 2
            r6[r9] = r7     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r10 = 3
            r6[r10] = r7     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r6)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r3.setAccessible(r2)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r4[r8] = r1     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r4[r2] = r0     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r4[r9] = r1     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            int r0 = r0.length     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r4[r10] = r0     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Object r12 = r3.invoke(r12, r4)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Class r12 = (java.lang.Class) r12     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r11 == r0) goto L_0x00a7
            wjw r11 = a     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            java.lang.String r0 = "Generated: {}"
            java.lang.String r1 = r12.getName()     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            r11.b(r0, r1)     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
        L_0x00a7:
            java.lang.Object r11 = r12.newInstance()     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            wjq r11 = (defpackage.wjq) r11     // Catch:{ RuntimeException -> 0x0023, Exception -> 0x00ae }
            return r11
        L_0x00ae:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            r12.<init>(r11)
            throw r12
        L_0x00b5:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjd.a(java.lang.Class, java.lang.ClassLoader):wjq");
    }

    private static String b(Class<?> cls) {
        if (!cls.isArray()) {
            return cls.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(b(cls.getComponentType()));
        sb.append("[]");
        return sb.toString();
    }

    private wjd() {
    }
}
