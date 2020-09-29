package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* renamed from: wxr reason: default package */
public final class wxr {
    private static final wyc a = wyd.a(wxr.class);
    private static Unsafe b;
    private static final long c;
    private static final long d;
    private static final Constructor<?> e;
    private static final boolean f;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0082 A[SYNTHETIC, Splitter:B:18:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0144  */
    static {
        /*
            java.lang.Class<wxr> r0 = defpackage.wxr.class
            wyc r0 = defpackage.wyd.a(r0)
            a = r0
            r0 = 1
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r0)
            wxr$1 r2 = new wxr$1
            r2.<init>(r1)
            java.lang.Object r2 = java.security.AccessController.doPrivileged(r2)
            boolean r3 = r2 instanceof java.lang.reflect.Field
            r4 = 0
            if (r3 == 0) goto L_0x0025
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            wyc r3 = a
            java.lang.String r5 = "java.nio.Buffer.address: available"
            r3.b(r5)
            goto L_0x002f
        L_0x0025:
            wyc r3 = a
            java.lang.Exception r2 = (java.lang.Exception) r2
            java.lang.String r5 = "java.nio.Buffer.address: unavailable"
            r3.b(r5, r2)
            r2 = r4
        L_0x002f:
            if (r2 == 0) goto L_0x0070
            wxr$2 r3 = new wxr$2
            r3.<init>()
            java.lang.Object r3 = java.security.AccessController.doPrivileged(r3)
            boolean r5 = r3 instanceof java.lang.Exception
            if (r5 == 0) goto L_0x0049
            wyc r5 = a
            java.lang.Exception r3 = (java.lang.Exception) r3
            java.lang.String r6 = "sun.misc.Unsafe.theUnsafe: unavailable"
            r5.b(r6, r3)
            r3 = r4
            goto L_0x0052
        L_0x0049:
            sun.misc.Unsafe r3 = (sun.misc.Unsafe) r3
            wyc r5 = a
            java.lang.String r6 = "sun.misc.Unsafe.theUnsafe: available"
            r5.b(r6)
        L_0x0052:
            if (r3 == 0) goto L_0x0071
            wxr$3 r5 = new wxr$3
            r5.<init>(r3)
            java.lang.Object r5 = java.security.AccessController.doPrivileged(r5)
            if (r5 != 0) goto L_0x0067
            wyc r5 = a
            java.lang.String r6 = "sun.misc.Unsafe.copyMemory: available"
            r5.b(r6)
            goto L_0x0071
        L_0x0067:
            wyc r3 = a
            java.lang.Exception r5 = (java.lang.Exception) r5
            java.lang.String r6 = "sun.misc.Unsafe.copyMemory: unavailable"
            r3.b(r6, r5)
        L_0x0070:
            r3 = r4
        L_0x0071:
            b = r3
            r5 = 0
            r6 = -1
            if (r3 != 0) goto L_0x0082
            c = r6
            d = r6
            f = r5
            e = r4
            goto L_0x012a
        L_0x0082:
            wxr$4 r3 = new wxr$4     // Catch:{ all -> 0x013e }
            r3.<init>(r1)     // Catch:{ all -> 0x013e }
            java.lang.Object r3 = java.security.AccessController.doPrivileged(r3)     // Catch:{ all -> 0x013e }
            boolean r8 = r3 instanceof java.lang.reflect.Constructor     // Catch:{ all -> 0x013e }
            if (r8 == 0) goto L_0x00bd
            sun.misc.Unsafe r8 = b     // Catch:{ all -> 0x013e }
            r9 = 1
            long r8 = r8.allocateMemory(r9)     // Catch:{ all -> 0x013e }
            r10 = r3
            java.lang.reflect.Constructor r10 = (java.lang.reflect.Constructor) r10     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00bb, all -> 0x00b8 }
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00bb, all -> 0x00b8 }
            java.lang.Long r12 = java.lang.Long.valueOf(r8)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00bb, all -> 0x00b8 }
            r11[r5] = r12     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00bb, all -> 0x00b8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00bb, all -> 0x00b8 }
            r11[r0] = r5     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00bb, all -> 0x00b8 }
            r10.newInstance(r11)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00bb, all -> 0x00b8 }
            r0 = r3
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00bb, all -> 0x00b8 }
            wyc r3 = a     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00bb, all -> 0x00b8 }
            java.lang.String r5 = "direct buffer constructor: available"
            r3.b(r5)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x00bb, all -> 0x00b8 }
            r4 = r0
            goto L_0x00c7
        L_0x00b8:
            r0 = move-exception
            goto L_0x0140
        L_0x00bb:
            goto L_0x00c7
        L_0x00bd:
            wyc r0 = a     // Catch:{ all -> 0x013e }
            java.lang.String r5 = "direct buffer constructor: unavailable"
            java.lang.Exception r3 = (java.lang.Exception) r3     // Catch:{ all -> 0x013e }
            r0.b(r5, r3)     // Catch:{ all -> 0x013e }
            r8 = r6
        L_0x00c7:
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            sun.misc.Unsafe r0 = b
            r0.freeMemory(r8)
        L_0x00d0:
            e = r4
            sun.misc.Unsafe r0 = b
            long r2 = r0.objectFieldOffset(r2)
            c = r2
            sun.misc.Unsafe r0 = b
            java.lang.Class<byte[]> r2 = byte[].class
            int r0 = r0.arrayBaseOffset(r2)
            long r2 = (long) r0
            d = r2
            wxr$5 r0 = new wxr$5
            r0.<init>()
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 == 0) goto L_0x0104
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            wyc r2 = a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.lang.String r4 = "java.nio.Bits.unaligned: available, {}"
            r2.b(r4, r3)
            goto L_0x0128
        L_0x0104:
            java.lang.String r2 = "os.arch"
            java.lang.String r3 = ""
            java.lang.String r2 = defpackage.wxu.a(r2, r3)
            java.lang.String r3 = "^(i[3-6]86|x86(_64)?|x64|amd64)$"
            boolean r2 = r2.matches(r3)
            java.lang.Exception r0 = (java.lang.Exception) r0
            wyc r3 = a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "java.nio.Bits.unaligned: unavailable, "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.b(r4, r0)
            r0 = r2
        L_0x0128:
            f = r0
        L_0x012a:
            wyc r0 = a
            java.lang.reflect.Constructor<?> r2 = e
            if (r2 == 0) goto L_0x0133
            java.lang.String r2 = "available"
            goto L_0x0135
        L_0x0133:
            java.lang.String r2 = "unavailable"
        L_0x0135:
            java.lang.String r3 = "java.nio.DirectByteBuffer.<init>(long, int): {}"
            r0.b(r3, r2)
            defpackage.wxf.a(r1)
            return
        L_0x013e:
            r0 = move-exception
            r8 = r6
        L_0x0140:
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0149
            sun.misc.Unsafe r1 = b
            r1.freeMemory(r8)
        L_0x0149:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxr.<clinit>():void");
    }

    private wxr() {
    }

    public static byte a(long j) {
        return b.getByte(j);
    }

    public static byte a(byte[] bArr, int i) {
        return b.getByte(bArr, d + ((long) i));
    }

    public static int a(byte b2) {
        return b2 & 31;
    }

    public static int a(short s) {
        return s & 7967;
    }

    static long a(Field field) {
        return b.objectFieldOffset(field);
    }

    public static ClassLoader a(final Class<?> cls) {
        return System.getSecurityManager() == null ? cls.getClassLoader() : (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
            public final /* synthetic */ Object run() {
                return cls.getClassLoader();
            }
        });
    }

    static Object a(Object obj, long j) {
        return b.getObject(obj, j);
    }

    public static ByteBuffer a(int i) {
        return c(b.allocateMemory((long) i), i);
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        return c(b.reallocateMemory(b((Object) byteBuffer, c), (long) i), i);
    }

    public static <U, W> AtomicReferenceFieldUpdater<U, W> a(Class<? super U> cls, String str) {
        return new wya(b, cls, str);
    }

    public static void a(long j, byte b2) {
        b.putByte(j, b2);
    }

    public static void a(long j, int i) {
        b.putInt(j, i);
    }

    public static void a(long j, long j2) {
        b.putLong(j, j2);
    }

    public static void a(long j, long j2, byte b2) {
        b.setMemory(j, j2, b2);
    }

    public static void a(long j, long j2, long j3) {
        while (j3 > 0) {
            long min = Math.min(j3, 1048576);
            b.copyMemory(j, j2, min);
            j3 -= min;
            j += min;
            j2 += min;
        }
    }

    public static void a(long j, short s) {
        b.putShort(j, s);
    }

    public static void a(Object obj, long j, long j2, byte b2) {
        b.setMemory(obj, j, j2, b2);
    }

    public static void a(Object obj, long j, Object obj2, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        while (j6 > 0) {
            long min = Math.min(j6, 1048576);
            b.copyMemory(obj, j4, obj2, j5, min);
            j6 -= min;
            j4 += min;
            j5 += min;
        }
    }

    public static void a(Throwable th) {
        b.throwException((Throwable) wxq.a(th, "cause"));
    }

    public static void a(ByteBuffer byteBuffer) {
        wxf.a(byteBuffer);
    }

    public static void a(byte[] bArr, int i, byte b2) {
        b.putByte(bArr, d + ((long) i), b2);
    }

    public static void a(byte[] bArr, int i, int i2) {
        b.putInt(bArr, d + ((long) i), i2);
    }

    public static void a(byte[] bArr, int i, long j) {
        b.putLong(bArr, ((long) i) + d, j);
    }

    public static void a(byte[] bArr, int i, short s) {
        b.putShort(bArr, d + ((long) i), s);
    }

    public static boolean a() {
        return f;
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        byte[] bArr3 = bArr;
        int i4 = i;
        byte[] bArr4 = bArr2;
        int i5 = i2;
        int i6 = i3;
        if (i6 == 0) {
            return true;
        }
        long j = d;
        long j2 = ((long) i4) + j;
        long j3 = j + ((long) i5);
        int i7 = i6 & 7;
        long j4 = ((long) i7) + j2;
        long j5 = (long) i6;
        long j6 = (j3 - 8) + j5;
        long j7 = (j2 - 8) + j5;
        long j8 = j6;
        while (j7 >= j4) {
            long j9 = j4;
            if (b.getLong(bArr3, j7) != b.getLong(bArr4, j8)) {
                return false;
            }
            j7 -= 8;
            j8 -= 8;
            j4 = j9;
        }
        if (i7 >= 4) {
            i7 -= 4;
            long j10 = (long) i7;
            if (b.getInt(bArr3, j2 + j10) != b.getInt(bArr4, j10 + j3)) {
                return false;
            }
        }
        return i7 >= 2 ? b.getChar(bArr3, j2) == b.getChar(bArr4, j3) && (i7 == 2 || bArr3[i4 + 2] == bArr4[i5 + 2]) : bArr3[i4] == bArr4[i5];
    }

    public static int b(int i) {
        return i & 522133279;
    }

    public static int b(long j, int i) {
        return (i * 461845907) + ((((int) j) & 522133279) * 461845907) + ((int) ((j & 2242545357458243584L) >>> 32));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        return r12 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009b, code lost:
        r10 = r10 & 7967;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004f, code lost:
        r10 = r10 & 522133279;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(byte[] r10, int r11, int r12) {
        /*
            long r0 = d
            long r2 = (long) r11
            long r0 = r0 + r2
            r11 = r12 & 7
            long r2 = (long) r11
            long r2 = r2 + r0
            r4 = 8
            long r6 = r0 - r4
            long r8 = (long) r12
            long r6 = r6 + r8
            r12 = -1028477387(0xffffffffc2b2ae35, float:-89.34025)
        L_0x0011:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x0021
            sun.misc.Unsafe r8 = b
            long r8 = r8.getLong(r10, r6)
            int r12 = b(r8, r12)
            long r6 = r6 - r4
            goto L_0x0011
        L_0x0021:
            r2 = 1
            r4 = 522133279(0x1f1f1f1f, float:3.3695302E-20)
            r5 = 461845907(0x1b873593, float:2.2368498E-22)
            switch(r11) {
                case 1: goto L_0x00a7;
                case 2: goto L_0x009e;
                case 3: goto L_0x0087;
                case 4: goto L_0x007e;
                case 5: goto L_0x0069;
                case 6: goto L_0x0052;
                case 7: goto L_0x002d;
                default: goto L_0x002c;
            }
        L_0x002c:
            return r12
        L_0x002d:
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            byte r11 = r11.getByte(r10, r0)
            r11 = r11 & 31
            int r12 = r12 + r11
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            long r2 = r2 + r0
            short r11 = r11.getShort(r10, r2)
            r11 = r11 & 7967(0x1f1f, float:1.1164E-41)
            int r12 = r12 + r11
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            r2 = 3
            long r0 = r0 + r2
            int r10 = r11.getInt(r10, r0)
        L_0x004f:
            r10 = r10 & r4
        L_0x0050:
            int r12 = r12 + r10
            return r12
        L_0x0052:
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            short r11 = r11.getShort(r10, r0)
            r11 = r11 & 7967(0x1f1f, float:1.1164E-41)
            int r12 = r12 + r11
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            r2 = 2
            long r0 = r0 + r2
            int r10 = r11.getInt(r10, r0)
            goto L_0x004f
        L_0x0069:
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            byte r11 = r11.getByte(r10, r0)
            r11 = r11 & 31
            int r12 = r12 + r11
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            long r0 = r0 + r2
            int r10 = r11.getInt(r10, r0)
            goto L_0x004f
        L_0x007e:
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            int r10 = r11.getInt(r10, r0)
            goto L_0x004f
        L_0x0087:
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            byte r11 = r11.getByte(r10, r0)
            r11 = r11 & 31
            int r12 = r12 + r11
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            long r0 = r0 + r2
            short r10 = r11.getShort(r10, r0)
        L_0x009b:
            r10 = r10 & 7967(0x1f1f, float:1.1164E-41)
            goto L_0x0050
        L_0x009e:
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            short r10 = r11.getShort(r10, r0)
            goto L_0x009b
        L_0x00a7:
            int r12 = r12 * r5
            sun.misc.Unsafe r11 = b
            byte r10 = r11.getByte(r10, r0)
            r10 = r10 & 31
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxr.b(byte[], int, int):int");
    }

    private static long b(Object obj, long j) {
        return b.getLong(obj, j);
    }

    public static long b(ByteBuffer byteBuffer) {
        return b((Object) byteBuffer, c);
    }

    public static <T> AtomicIntegerFieldUpdater<T> b(Class<? super T> cls, String str) {
        return new wxy(b, cls, str);
    }

    public static short b(long j) {
        return b.getShort(j);
    }

    public static short b(byte[] bArr, int i) {
        return b.getShort(bArr, d + ((long) i));
    }

    public static boolean b() {
        return b != null;
    }

    public static int c(long j) {
        return b.getInt(j);
    }

    public static int c(byte[] bArr, int i) {
        return b.getInt(bArr, d + ((long) i));
    }

    private static ByteBuffer c(long j, int i) {
        String str = " (expected: >= 0)";
        String str2 = ": ";
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("address");
            sb.append(str2);
            sb.append(j);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            try {
                return (ByteBuffer) e.newInstance(new Object[]{Long.valueOf(j), Integer.valueOf(i)});
            } catch (Throwable th) {
                if (th instanceof Error) {
                    throw th;
                }
                throw new Error(th);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("capacity");
            sb2.append(str2);
            sb2.append(i);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static <T> AtomicLongFieldUpdater<T> c(Class<? super T> cls, String str) {
        return new wxz(b, cls, str);
    }

    public static boolean c() {
        return f;
    }

    public static long d(long j) {
        return b.getLong(j);
    }

    public static long d(byte[] bArr, int i) {
        return b.getLong(bArr, d + ((long) i));
    }

    public static boolean d() {
        return e != null;
    }

    public static long e() {
        return d;
    }

    public static void e(long j) {
        b.freeMemory(j);
    }

    public static ClassLoader f() {
        return System.getSecurityManager() == null ? Thread.currentThread().getContextClassLoader() : (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
            public final /* synthetic */ Object run() {
                return Thread.currentThread().getContextClassLoader();
            }
        });
    }

    public static ClassLoader g() {
        return System.getSecurityManager() == null ? ClassLoader.getSystemClassLoader() : (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
            public final /* synthetic */ Object run() {
                return ClassLoader.getSystemClassLoader();
            }
        });
    }

    public static int h() {
        return b.addressSize();
    }
}
