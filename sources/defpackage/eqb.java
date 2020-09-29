package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: eqb reason: default package */
public final class eqb {
    private static final Logger a = Logger.getLogger(eqb.class.getName());
    private static final Unsafe b = c();
    private static final Class<?> c = emi.b();
    private static final boolean d = d(Long.TYPE);
    private static final boolean e = d(Integer.TYPE);
    private static final d f;
    private static final boolean g = g();
    private static final boolean h = f();
    /* access modifiers changed from: private */
    public static final long i = ((long) b(byte[].class));
    private static final long j;
    /* access modifiers changed from: private */
    public static final boolean k = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: eqb$a */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return eqb.k ? eqb.k(obj, j) : eqb.l(obj, j);
        }

        public final void a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        public final void a(Object obj, long j, byte b) {
            if (eqb.k) {
                eqb.c(obj, j, b);
            } else {
                eqb.d(obj, j, b);
            }
        }

        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }

        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        public final void a(Object obj, long j, boolean z) {
            if (eqb.k) {
                eqb.c(obj, j, r3 ? (byte) 1 : 0);
            } else {
                eqb.d(obj, j, r3 ? (byte) 1 : 0);
            }
        }

        public final void a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }

        public final boolean b(Object obj, long j) {
            return eqb.k ? eqb.i(obj, j) : eqb.j(obj, j);
        }

        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }
    }

    /* renamed from: eqb$b */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return eqb.k ? eqb.k(obj, j) : eqb.l(obj, j);
        }

        public final void a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        public final void a(Object obj, long j, byte b) {
            if (eqb.k) {
                eqb.c(obj, j, b);
            } else {
                eqb.d(obj, j, b);
            }
        }

        public final void a(Object obj, long j, double d) {
            a(obj, j, Double.doubleToLongBits(d));
        }

        public final void a(Object obj, long j, float f) {
            a(obj, j, Float.floatToIntBits(f));
        }

        public final void a(Object obj, long j, boolean z) {
            if (eqb.k) {
                eqb.c(obj, j, r3 ? (byte) 1 : 0);
            } else {
                eqb.d(obj, j, r3 ? (byte) 1 : 0);
            }
        }

        public final void a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }

        public final boolean b(Object obj, long j) {
            return eqb.k ? eqb.i(obj, j) : eqb.j(obj, j);
        }

        public final float c(Object obj, long j) {
            return Float.intBitsToFloat(e(obj, j));
        }

        public final double d(Object obj, long j) {
            return Double.longBitsToDouble(f(obj, j));
        }
    }

    /* renamed from: eqb$c */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        public final void a(long j, byte b) {
            this.a.putByte(j, b);
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

        public final void a(byte[] bArr, long j, long j2, long j3) {
            this.a.copyMemory(bArr, eqb.i + j, null, j2, j3);
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

    /* renamed from: eqb$d */
    static abstract class d {
        Unsafe a;

        d(Unsafe unsafe) {
            this.a = unsafe;
        }

        public abstract byte a(Object obj, long j);

        public abstract void a(long j, byte b);

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

        public abstract void a(byte[] bArr, long j, long j2, long j3);

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

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bc  */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            java.lang.Class<eqb> r5 = defpackage.eqb.class
            java.lang.String r5 = r5.getName()
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r5)
            a = r5
            sun.misc.Unsafe r5 = c()
            b = r5
            java.lang.Class r5 = defpackage.emi.b()
            c = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = d(r5)
            d = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r5 = d(r5)
            e = r5
            sun.misc.Unsafe r5 = b
            r6 = 0
            if (r5 != 0) goto L_0x0038
            goto L_0x005d
        L_0x0038:
            boolean r5 = defpackage.emi.a()
            if (r5 == 0) goto L_0x0056
            boolean r5 = d
            if (r5 == 0) goto L_0x004a
            eqb$b r6 = new eqb$b
            sun.misc.Unsafe r5 = b
            r6.<init>(r5)
            goto L_0x005d
        L_0x004a:
            boolean r5 = e
            if (r5 == 0) goto L_0x005d
            eqb$a r6 = new eqb$a
            sun.misc.Unsafe r5 = b
            r6.<init>(r5)
            goto L_0x005d
        L_0x0056:
            eqb$c r6 = new eqb$c
            sun.misc.Unsafe r5 = b
            r6.<init>(r5)
        L_0x005d:
            f = r6
            boolean r5 = g()
            g = r5
            boolean r5 = f()
            h = r5
            java.lang.Class<byte[]> r5 = byte[].class
            int r5 = b(r5)
            long r5 = (long) r5
            i = r5
            b(r4)
            c(r4)
            b(r3)
            c(r3)
            b(r2)
            c(r2)
            b(r1)
            c(r1)
            b(r0)
            c(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            b(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            c(r0)
            java.lang.reflect.Field r0 = h()
            if (r0 == 0) goto L_0x00ae
            eqb$d r1 = f
            if (r1 != 0) goto L_0x00a7
            goto L_0x00ae
        L_0x00a7:
            sun.misc.Unsafe r1 = r1.a
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00b0
        L_0x00ae:
            r0 = -1
        L_0x00b0:
            j = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00bc
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqb.<clinit>():void");
    }

    private eqb() {
    }

    static byte a(byte[] bArr, long j2) {
        return f.a((Object) bArr, i + j2);
    }

    static int a(Object obj, long j2) {
        return f.e(obj, j2);
    }

    public static long a(ByteBuffer byteBuffer) {
        return f.f(byteBuffer, j);
    }

    static <T> T a(Class<T> cls) {
        try {
            return b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
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

    public static void a(long j2, byte b2) {
        f.a(j2, b2);
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

    public static void a(byte[] bArr, long j2, long j3, long j4) {
        f.a(bArr, j2, j3, j4);
    }

    public static boolean a() {
        return h;
    }

    private static int b(Class<?> cls) {
        if (h) {
            return f.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    static long b(Object obj, long j2) {
        return f.f(obj, j2);
    }

    public static boolean b() {
        return g;
    }

    private static int c(Class<?> cls) {
        if (h) {
            return f.a.arrayIndexScale(cls);
        }
        return -1;
    }

    static Unsafe c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new eqc());
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

    private static boolean d(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!emi.a()) {
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

    static double e(Object obj, long j2) {
        return f.d(obj, j2);
    }

    static Object f(Object obj, long j2) {
        return f.a.getObject(obj, j2);
    }

    private static boolean f() {
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
            if (emi.a()) {
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

    private static boolean g() {
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
            if (h() == null) {
                return false;
            }
            if (emi.a()) {
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

    private static Field h() {
        if (emi.a()) {
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

    static /* synthetic */ boolean i(Object obj, long j2) {
        return k(obj, j2) != 0;
    }

    static /* synthetic */ boolean j(Object obj, long j2) {
        return l(obj, j2) != 0;
    }

    /* access modifiers changed from: private */
    public static byte k(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) (((j2 ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte l(Object obj, long j2) {
        return (byte) (a(obj, -4 & j2) >>> ((int) ((j2 & 3) << 3)));
    }
}
