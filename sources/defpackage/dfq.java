package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: dfq reason: default package */
public final class dfq {
    private static final Logger a = Logger.getLogger(dfq.class.getName());
    private static final Unsafe b = c();
    private static final Class<?> c = dbu.b();
    private static final boolean d = c(Long.TYPE);
    private static final boolean e = c(Integer.TYPE);
    private static final d f;
    private static final boolean g = f();
    private static final boolean h = e();
    private static final long i = ((long) a(byte[].class));
    /* access modifiers changed from: private */
    public static final boolean j = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: dfq$a */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return dfq.j ? dfq.k(obj, j) : dfq.l(obj, j);
        }

        public final void a(Object obj, long j, byte b) {
            if (dfq.j) {
                dfq.c(obj, j, b);
            } else {
                dfq.d(obj, j, b);
            }
        }

        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }

        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        public final void a(Object obj, long j, boolean z) {
            if (dfq.j) {
                dfq.c(obj, j, r3 ? (byte) 1 : 0);
            } else {
                dfq.d(obj, j, r3 ? (byte) 1 : 0);
            }
        }

        public final boolean b(Object obj, long j) {
            return dfq.j ? dfq.i(obj, j) : dfq.j(obj, j);
        }

        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }
    }

    /* renamed from: dfq$b */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return dfq.j ? dfq.k(obj, j) : dfq.l(obj, j);
        }

        public final void a(Object obj, long j, byte b) {
            if (dfq.j) {
                dfq.c(obj, j, b);
            } else {
                dfq.d(obj, j, b);
            }
        }

        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }

        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        public final void a(Object obj, long j, boolean z) {
            if (dfq.j) {
                dfq.c(obj, j, r3 ? (byte) 1 : 0);
            } else {
                dfq.d(obj, j, r3 ? (byte) 1 : 0);
            }
        }

        public final boolean b(Object obj, long j) {
            return dfq.j ? dfq.i(obj, j) : dfq.j(obj, j);
        }

        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }
    }

    /* renamed from: dfq$c */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        public final void a(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        public final void a(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        public final void a(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        public final void a(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        public final boolean b(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        public final float c(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        public final double d(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }
    }

    /* renamed from: dfq$d */
    static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public final long a(Field field) {
            return this.a.objectFieldOffset(field);
        }

        public abstract void a(Object obj, long j, byte b);

        public abstract void a(Object obj, long j, double d);

        public abstract void a(Object obj, long j, float f);

        public final void a(Object obj, long j, int i) {
            this.a.putInt(obj, j, i);
        }

        public final void a(Object obj, long j, long j2) {
            this.a.putLong(obj, j, j2);
        }

        public abstract void a(Object obj, long j, boolean z);

        public abstract boolean b(Object obj, long j);

        public abstract float c(Object obj, long j);

        public abstract double d(Object obj, long j);

        public final int e(Object obj, long j) {
            return this.a.getInt(obj, j);
        }

        public final long f(Object obj, long j) {
            return this.a.getLong(obj, j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c5  */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            java.lang.Class<dfq> r5 = defpackage.dfq.class
            java.lang.String r5 = r5.getName()
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r5)
            a = r5
            sun.misc.Unsafe r5 = c()
            b = r5
            java.lang.Class r5 = defpackage.dbu.b()
            c = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = c(r5)
            d = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r5 = c(r5)
            e = r5
            sun.misc.Unsafe r5 = b
            r6 = 0
            if (r5 != 0) goto L_0x0039
        L_0x0037:
            r5 = r6
            goto L_0x005e
        L_0x0039:
            boolean r5 = defpackage.dbu.a()
            if (r5 == 0) goto L_0x0057
            boolean r5 = d
            if (r5 == 0) goto L_0x004b
            dfq$b r5 = new dfq$b
            sun.misc.Unsafe r7 = b
            r5.<init>(r7)
            goto L_0x005e
        L_0x004b:
            boolean r5 = e
            if (r5 == 0) goto L_0x0037
            dfq$a r5 = new dfq$a
            sun.misc.Unsafe r7 = b
            r5.<init>(r7)
            goto L_0x005e
        L_0x0057:
            dfq$c r5 = new dfq$c
            sun.misc.Unsafe r7 = b
            r5.<init>(r7)
        L_0x005e:
            f = r5
            boolean r5 = f()
            g = r5
            boolean r5 = e()
            h = r5
            java.lang.Class<byte[]> r5 = byte[].class
            int r5 = a(r5)
            long r7 = (long) r5
            i = r7
            a(r4)
            b(r4)
            a(r3)
            b(r3)
            a(r2)
            b(r2)
            a(r1)
            b(r1)
            a(r0)
            b(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            a(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            b(r0)
            java.lang.reflect.Field r0 = g()
            b(r0)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "value"
            java.lang.reflect.Field r0 = a(r0, r1)
            if (r0 == 0) goto L_0x00b7
            java.lang.Class r1 = r0.getType()
            java.lang.Class<char[]> r2 = char[].class
            if (r1 != r2) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r0 = r6
        L_0x00b8:
            b(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00c5
            r0 = 1
            goto L_0x00c6
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfq.<clinit>():void");
    }

    private dfq() {
    }

    static byte a(byte[] bArr, long j2) {
        return f.a(bArr, i + j2);
    }

    private static int a(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static int a(Object obj, long j2) {
        return f.e(obj, j2);
    }

    static long a(Field field) {
        return f.a(field);
    }

    private static Field a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    static void a(Object obj, long j2, double d2) {
        f.a(obj, j2, d2);
    }

    static void a(Object obj, long j2, float f2) {
        f.a(obj, j2, f2);
    }

    static void a(Object obj, long j2, int i2) {
        f.a(obj, j2, i2);
    }

    static void a(Object obj, long j2, long j3) {
        f.a(obj, j2, j3);
    }

    static void a(Object obj, long j2, Object obj2) {
        f.a.putObject(obj, j2, obj2);
    }

    static void a(Object obj, long j2, boolean z) {
        f.a(obj, j2, z);
    }

    public static void a(byte[] bArr, long j2, byte b2) {
        f.a((Object) bArr, i + j2, b2);
    }

    public static boolean a() {
        return h;
    }

    private static int b(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static long b(Object obj, long j2) {
        return f.f(obj, j2);
    }

    private static long b(Field field) {
        if (field != null) {
            d dVar = f;
            if (dVar != null) {
                return dVar.a(field);
            }
        }
        return -1;
    }

    static boolean b() {
        return g;
    }

    static Unsafe c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new dfr());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void c(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = ((((int) j2) ^ -1) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & ((255 << i2) ^ -1)));
    }

    private static boolean c(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!dbu.a()) {
            return false;
        }
        try {
            Class<?> cls3 = c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean c(Object obj, long j2) {
        return f.b(obj, j2);
    }

    static float d(Object obj, long j2) {
        return f.c(obj, j2);
    }

    /* access modifiers changed from: private */
    public static void d(Object obj, long j2, byte b2) {
        long j3 = -4 & j2;
        int i2 = (((int) j2) & 3) << 3;
        a(obj, j3, ((255 & b2) << i2) | (a(obj, j3) & ((255 << i2) ^ -1)));
    }

    static double e(Object obj, long j2) {
        return f.d(obj, j2);
    }

    private static boolean e() {
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (dbu.a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    static Object f(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    private static boolean f() {
        String str = "copyMemory";
        String str2 = "getLong";
        Unsafe unsafe = b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod(str2, new Class[]{Object.class, Long.TYPE});
            if (g() == null) {
                return false;
            }
            if (dbu.a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod(str2, new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod(str, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod(str, new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field g() {
        if (dbu.a()) {
            Field a2 = a(Buffer.class, "effectiveDirectAddress");
            if (a2 != null) {
                return a2;
            }
        }
        Field a3 = a(Buffer.class, "address");
        if (a3 == null || a3.getType() != Long.TYPE) {
            return null;
        }
        return a3;
    }

    /* access modifiers changed from: private */
    public static byte k(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte l(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    static /* synthetic */ boolean i(Object obj, long j2) {
        return k(obj, j2) != 0;
    }

    static /* synthetic */ boolean j(Object obj, long j2) {
        return l(obj, j2) != 0;
    }
}
