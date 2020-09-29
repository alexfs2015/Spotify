package io.netty.util.internal;

import io.netty.util.internal.chmv8.ConcurrentHashMapV8;
import io.netty.util.internal.chmv8.LongAdderV8;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Pattern;

public final class PlatformDependent {
    public static final boolean a = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);
    /* access modifiers changed from: private */
    public static final wyc b;
    private static final Pattern c = Pattern.compile("\\s*-XX:MaxDirectMemorySize\\s*=\\s*([0-9]+)\\s*([kKmMgG]?)\\s*$");
    private static final boolean d = q();
    private static final boolean e;
    private static final int f;
    private static final boolean g = (!d);
    private static final boolean h;
    private static final boolean i;
    private static final boolean j;
    private static final boolean k = (!i && !wxu.a("io.netty.noPreferDirect", false));
    private static final long l = t();
    private static final long m = wxr.e();
    private static final boolean n = u();
    private static final boolean o;
    private static final AtomicLong p;
    private static final long q;
    private static /* synthetic */ boolean r;

    static final class AtomicLongCounter extends AtomicLong implements wxk {
        private static final long serialVersionUID = 4074772784610639305L;

        private AtomicLongCounter() {
        }

        /* synthetic */ AtomicLongCounter(byte b) {
            this();
        }

        public final void a() {
            incrementAndGet();
        }

        public final void a(long j) {
            addAndGet(j);
        }
    }

    static final class a {
        private static final boolean a;

        static {
            if ((PlatformDependent.e() ? AccessController.doPrivileged(new PrivilegedAction<Object>() {
                public final Object run() {
                    return wzg.a;
                }
            }) : null) == null) {
                PlatformDependent.b.b("org.jctools-core.MpscChunkedArrayQueue: unavailable");
                a = false;
                return;
            }
            PlatformDependent.b.b("org.jctools-core.MpscChunkedArrayQueue: available");
            a = true;
        }

        static <T> Queue<T> a(int i) {
            return a ? new wyr(1024, Math.max(Math.min(i, 1073741824), 2048), true) : new wzd();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a1  */
    static {
        /*
            java.lang.Class<io.netty.util.internal.PlatformDependent> r0 = io.netty.util.internal.PlatformDependent.class
            boolean r1 = r0.desiredAssertionStatus()
            r2 = 1
            r1 = r1 ^ r2
            r = r1
            wyc r0 = defpackage.wyd.a(r0)
            b = r0
            java.lang.String r0 = "\\s*-XX:MaxDirectMemorySize\\s*=\\s*([0-9]+)\\s*([kKmMgG]?)\\s*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            c = r0
            boolean r0 = q()
            d = r0
            java.lang.String r0 = ""
            java.lang.String r1 = "os.name"
            java.lang.String r1 = defpackage.wxu.a(r1, r0)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r3)
            java.lang.String r3 = "win"
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L_0x003b
            wyc r3 = b
            java.lang.String r4 = "Platform: Windows"
            r3.b(r4)
        L_0x003b:
            e = r1
            boolean r1 = d
            if (r1 == 0) goto L_0x0043
            r1 = 6
            goto L_0x0047
        L_0x0043:
            int r1 = r()
        L_0x0047:
            wyc r3 = b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = "Java version: {}"
            r3.b(r5, r4)
            f = r1
            boolean r1 = d
            r1 = r1 ^ r2
            g = r1
            r1 = 0
            java.lang.String r3 = "io.netty.noUnsafe"
            boolean r3 = defpackage.wxu.a(r3, r1)
            wyc r4 = b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            java.lang.String r6 = "-Dio.netty.noUnsafe: {}"
            r4.b(r6, r5)
            if (r3 == 0) goto L_0x0076
            wyc r3 = b
            java.lang.String r4 = "sun.misc.Unsafe: unavailable (io.netty.noUnsafe)"
            r3.b(r4)
        L_0x0074:
            r3 = 1
            goto L_0x0094
        L_0x0076:
            java.lang.String r3 = "io.netty.tryUnsafe"
            boolean r4 = defpackage.wxu.a(r3)
            if (r4 == 0) goto L_0x0083
            boolean r3 = defpackage.wxu.a(r3, r2)
            goto L_0x0089
        L_0x0083:
            java.lang.String r3 = "org.jboss.netty.tryUnsafe"
            boolean r3 = defpackage.wxu.a(r3, r2)
        L_0x0089:
            if (r3 != 0) goto L_0x0093
            wyc r3 = b
            java.lang.String r4 = "sun.misc.Unsafe: unavailable (io.netty.tryUnsafe/org.jboss.netty.tryUnsafe)"
            r3.b(r4)
            goto L_0x0074
        L_0x0093:
            r3 = 0
        L_0x0094:
            h = r3
            boolean r3 = s()
            i = r3
            if (r3 == 0) goto L_0x00a6
            int r3 = f
            r4 = 8
            if (r3 >= r4) goto L_0x00a6
            r3 = 1
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            j = r3
            boolean r3 = i
            if (r3 == 0) goto L_0x00b7
            java.lang.String r3 = "io.netty.noPreferDirect"
            boolean r3 = defpackage.wxu.a(r3, r1)
            if (r3 != 0) goto L_0x00b7
            r3 = 1
            goto L_0x00b8
        L_0x00b7:
            r3 = 0
        L_0x00b8:
            k = r3
            long r3 = t()
            l = r3
            long r3 = defpackage.wxr.e()
            m = r3
            boolean r3 = u()
            n = r3
            v()
            java.lang.String r3 = "io.netty.bitMode"
            int r3 = defpackage.wxu.a(r3, r1)
            if (r3 <= 0) goto L_0x00e4
            wyc r0 = b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "-Dio.netty.bitMode: {}"
            r0.b(r4, r3)
            goto L_0x0184
        L_0x00e4:
            java.lang.String r3 = "sun.arch.data.model"
            int r3 = defpackage.wxu.a(r3, r1)
            if (r3 <= 0) goto L_0x00f9
            wyc r0 = b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "-Dio.netty.bitMode: {} (sun.arch.data.model)"
            r0.b(r4, r3)
            goto L_0x0184
        L_0x00f9:
            java.lang.String r3 = "com.ibm.vm.bitmode"
            int r3 = defpackage.wxu.a(r3, r1)
            if (r3 <= 0) goto L_0x010e
            wyc r0 = b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "-Dio.netty.bitMode: {} (com.ibm.vm.bitmode)"
            r0.b(r4, r3)
            goto L_0x0184
        L_0x010e:
            java.lang.String r4 = "os.arch"
            java.lang.String r4 = defpackage.wxu.a(r4, r0)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r4 = r4.trim()
            java.lang.String r5 = "amd64"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x0152
            java.lang.String r5 = "x86_64"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x012f
            goto L_0x0152
        L_0x012f:
            java.lang.String r5 = "i386"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x014f
            java.lang.String r5 = "i486"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x014f
            java.lang.String r5 = "i586"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x014f
            java.lang.String r5 = "i686"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0154
        L_0x014f:
            r3 = 32
            goto L_0x0154
        L_0x0152:
            r3 = 64
        L_0x0154:
            if (r3 <= 0) goto L_0x0161
            wyc r5 = b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r6 = "-Dio.netty.bitMode: {} (os.arch: {})"
            r5.b(r6, r3, r4)
        L_0x0161:
            java.lang.String r3 = "java.vm.name"
            java.lang.String r0 = defpackage.wxu.a(r3, r0)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "([1-9][0-9]+)-?bit"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r0 = r3.matcher(r0)
            boolean r3 = r0.find()
            if (r3 == 0) goto L_0x0184
            java.lang.String r0 = r0.group(r2)
            java.lang.Integer.parseInt(r0)
        L_0x0184:
            boolean r0 = i
            if (r0 != 0) goto L_0x0189
            goto L_0x018c
        L_0x0189:
            defpackage.wxr.h()
        L_0x018c:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r3) goto L_0x0196
            r0 = 1
            goto L_0x0197
        L_0x0196:
            r0 = 0
        L_0x0197:
            a = r0
            wyc r0 = b
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x01af
            wyc r0 = b
            boolean r3 = k
            r3 = r3 ^ r2
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "-Dio.netty.noPreferDirect: {}"
            r0.b(r4, r3)
        L_0x01af:
            boolean r0 = i
            if (r0 != 0) goto L_0x01c2
            boolean r0 = d
            if (r0 != 0) goto L_0x01c2
            boolean r0 = h
            if (r0 != 0) goto L_0x01c2
            wyc r0 = b
            java.lang.String r3 = "Your platform does not provide complete low-level API for accessing direct buffers reliably. Unless explicitly requested, heap buffer will always be preferred to avoid potential system unstability."
            r0.c(r3)
        L_0x01c2:
            r3 = -1
            java.lang.String r0 = "io.netty.maxDirectMemory"
            long r3 = defpackage.wxu.a(r0, r3)
            r0 = 0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x01fd
            boolean r7 = i
            if (r7 == 0) goto L_0x01fd
            boolean r7 = defpackage.wxr.d()
            if (r7 != 0) goto L_0x01dc
            goto L_0x01fd
        L_0x01dc:
            o = r2
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x01f5
            long r3 = t()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x01ed
            p = r0
            goto L_0x0201
        L_0x01ed:
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            p = r0
            goto L_0x0201
        L_0x01f5:
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            p = r0
            goto L_0x0201
        L_0x01fd:
            o = r1
            p = r0
        L_0x0201:
            q = r3
            wyc r0 = b
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r2 = "io.netty.maxDirectMemory: {} bytes"
            r0.b(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.PlatformDependent.<clinit>():void");
    }

    private PlatformDependent() {
    }

    public static byte a(long j2) {
        return wxr.a(j2);
    }

    public static byte a(byte[] bArr, int i2) {
        return wxr.a(bArr, i2);
    }

    public static int a(CharSequence charSequence) {
        int i2;
        int charAt;
        int length = charSequence.length() & 7;
        int i3 = -1028477387;
        switch (charSequence.length()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i3 = a(charSequence, charSequence.length() - 8, -1028477387);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i3 = a(charSequence, charSequence.length() - 16, a(charSequence, charSequence.length() - 8, -1028477387));
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                i3 = a(charSequence, charSequence.length() - 24, a(charSequence, charSequence.length() - 16, a(charSequence, charSequence.length() - 8, -1028477387)));
                break;
            default:
                for (int length2 = charSequence.length() - 8; length2 >= length; length2 -= 8) {
                    i3 = a(charSequence, length2, i3);
                }
                break;
        }
        switch (length) {
            case 1:
                i2 = i3 * 461845907;
                charAt = charSequence.charAt(0) & 31;
                break;
            case 2:
                i2 = i3 * 461845907;
                charAt = b(charSequence, 0);
                break;
            case 3:
                i2 = ((i3 * 461845907) + (charSequence.charAt(0) & 31)) * 461845907;
                charAt = b(charSequence, 1);
                break;
            case 4:
                i2 = i3 * 461845907;
                charAt = a(charSequence, 0);
                break;
            case 5:
                i2 = ((i3 * 461845907) + (charSequence.charAt(0) & 31)) * 461845907;
                charAt = a(charSequence, 1);
                break;
            case 6:
                i2 = ((i3 * 461845907) + b(charSequence, 0)) * 461845907;
                charAt = a(charSequence, 2);
                break;
            case 7:
                i2 = ((((i3 * 461845907) + (charSequence.charAt(0) & 31)) * 461845907) + b(charSequence, 1)) * 461845907;
                charAt = a(charSequence, 3);
                break;
            default:
                return i3;
        }
        return i2 + charAt;
    }

    private static int a(CharSequence charSequence, int i2) {
        char charAt;
        int charAt2;
        if (a) {
            charAt = (charSequence.charAt(i2) & 31) | ((charSequence.charAt(i2 + 2) & 31) << 8) | ((charSequence.charAt(i2 + 1) & 31) << 16);
            charAt2 = (charSequence.charAt(i2) & 31) << 24;
        } else {
            charAt = ((charSequence.charAt(i2 + 3) & 31) << 24) | ((charSequence.charAt(i2 + 2) & 31) << 16) | ((charSequence.charAt(i2 + 1) & 31) << 8);
            charAt2 = charSequence.charAt(i2) & 31;
        }
        return charAt2 | charAt;
    }

    private static int a(CharSequence charSequence, int i2, int i3) {
        return (i3 * 461845907) + (a(charSequence, i2) * 461845907) + a(charSequence, i2 + 4);
    }

    private static File a(String str) {
        if (str == null) {
            return null;
        }
        File file = new File(str);
        file.mkdirs();
        if (!file.isDirectory()) {
            return null;
        }
        try {
            return file.getAbsoluteFile();
        } catch (Exception unused) {
            return file;
        }
    }

    public static ClassLoader a(Class<?> cls) {
        return wxr.a(cls);
    }

    public static ByteBuffer a(int i2) {
        if (r || o) {
            d(i2);
            try {
                return wxr.a(i2);
            } catch (Throwable th) {
                e(i2);
                a(th);
                return null;
            }
        } else {
            throw new AssertionError();
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i2) {
        if (r || o) {
            int capacity = i2 - byteBuffer.capacity();
            d(capacity);
            try {
                return wxr.a(byteBuffer, i2);
            } catch (Throwable th) {
                e(capacity);
                a(th);
                return null;
            }
        } else {
            throw new AssertionError();
        }
    }

    public static <U, W> AtomicReferenceFieldUpdater<U, W> a(Class<? super U> cls, String str) {
        if (i) {
            try {
                return wxr.a(cls, str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static void a(long j2, byte b2) {
        wxr.a(j2, b2);
    }

    public static void a(long j2, int i2) {
        wxr.a(j2, i2);
    }

    public static void a(long j2, long j3) {
        wxr.a(j2, j3);
    }

    public static void a(long j2, long j3, byte b2) {
        wxr.a(j2, j3, 0);
    }

    public static void a(long j2, long j3, long j4) {
        wxr.a(j2, j3, j4);
    }

    public static void a(long j2, short s) {
        wxr.a(j2, s);
    }

    public static void a(long j2, byte[] bArr, int i2, long j3) {
        wxr.a((Object) null, j2, (Object) bArr, m + ((long) i2), j3);
    }

    public static void a(Throwable th) {
        if (i) {
            wxr.a(th);
            return;
        }
        throw th;
    }

    public static void a(ByteBuffer byteBuffer) {
        if (i && !d) {
            wxr.a(byteBuffer);
        }
    }

    public static void a(byte[] bArr, int i2, byte b2) {
        wxr.a(bArr, i2, b2);
    }

    public static void a(byte[] bArr, int i2, int i3) {
        wxr.a(bArr, i2, i3);
    }

    public static void a(byte[] bArr, int i2, long j2) {
        wxr.a(bArr, i2, j2);
    }

    public static void a(byte[] bArr, int i2, long j2, byte b2) {
        wxr.a(bArr, m + ((long) i2), j2, 0);
    }

    public static void a(byte[] bArr, int i2, long j2, long j3) {
        wxr.a((Object) bArr, m + ((long) i2), (Object) null, j2, j3);
    }

    public static void a(byte[] bArr, int i2, short s) {
        wxr.a(bArr, i2, s);
    }

    public static boolean a() {
        return d;
    }

    public static boolean a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        boolean z;
        if (!i || !wxr.c()) {
            int i5 = i4 + i2;
            while (i2 < i5) {
                if (bArr[i2] != bArr2[i3]) {
                    z = false;
                } else {
                    i2++;
                    i3++;
                }
            }
            return true;
        }
        z = wxr.a(bArr, i2, bArr2, i3, i4);
        return z;
    }

    private static int b(CharSequence charSequence, int i2) {
        int charAt;
        int charAt2;
        if (a) {
            charAt = charSequence.charAt(i2 + 1) & 31;
            charAt2 = (charSequence.charAt(i2) & 31) << 8;
        } else {
            charAt = (charSequence.charAt(i2 + 1) & 31) << 8;
            charAt2 = charSequence.charAt(i2) & 31;
        }
        return charAt2 | charAt;
    }

    public static int b(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        long j2;
        long j3;
        byte[] bArr2 = bArr;
        if (!i || !wxr.c()) {
            int i7 = -1028477387;
            int i8 = i3 & 7;
            int i9 = i2 + i8;
            for (int i10 = (i2 - 8) + i3; i10 >= i9; i10 -= 8) {
                if (a) {
                    j3 = ((((long) bArr2[i10 + 1]) & 255) << 48) | (((long) bArr2[i10]) << 56) | ((((long) bArr2[i10 + 2]) & 255) << 40) | ((((long) bArr2[i10 + 3]) & 255) << 32) | ((((long) bArr2[i10 + 4]) & 255) << 24) | ((((long) bArr2[i10 + 5]) & 255) << 16) | ((((long) bArr2[i10 + 6]) & 255) << 8);
                    j2 = ((long) bArr2[i10 + 7]) & 255;
                } else {
                    j3 = ((((long) bArr2[i10 + 6]) & 255) << 48) | ((((long) bArr2[i10 + 4]) & 255) << 32) | (((long) bArr2[i10]) & 255) | ((((long) bArr2[i10 + 1]) & 255) << 8) | ((((long) bArr2[i10 + 2]) & 255) << 16) | ((((long) bArr2[i10 + 3]) & 255) << 24) | ((((long) bArr2[i10 + 5]) & 255) << 40);
                    j2 = (((long) bArr2[i10 + 7]) & 255) << 56;
                }
                i7 = wxr.b(j3 | j2, i7);
            }
            switch (i8) {
                case 1:
                    i5 = i7 * 461845907;
                    i6 = wxr.a(bArr2[i2]);
                    break;
                case 2:
                    i5 = i7 * 461845907;
                    i6 = wxr.a(f(bArr, i2));
                    break;
                case 3:
                    i5 = ((i7 * 461845907) + wxr.a(bArr2[i2])) * 461845907;
                    i6 = wxr.a(f(bArr2, i2 + 1));
                    break;
                case 4:
                    i5 = i7 * 461845907;
                    i6 = wxr.b(e(bArr, i2));
                    break;
                case 5:
                    i5 = ((i7 * 461845907) + wxr.a(bArr2[i2])) * 461845907;
                    i6 = wxr.b(e(bArr2, i2 + 1));
                    break;
                case 6:
                    i5 = ((i7 * 461845907) + wxr.a(f(bArr, i2))) * 461845907;
                    i6 = wxr.b(e(bArr2, i2 + 2));
                    break;
                case 7:
                    i5 = ((((i7 * 461845907) + wxr.a(bArr2[i2])) * 461845907) + wxr.a(f(bArr2, i2 + 1))) * 461845907;
                    i6 = wxr.b(e(bArr2, i2 + 3));
                    break;
                default:
                    return i7;
            }
            i4 = i6 + i5;
        } else {
            i4 = wxr.b(bArr, i2, i3);
        }
        return i4;
    }

    public static long b(ByteBuffer byteBuffer) {
        return wxr.b(byteBuffer);
    }

    public static <T> Queue<T> b(int i2) {
        return a.a(i2);
    }

    public static <T> AtomicIntegerFieldUpdater<T> b(Class<? super T> cls, String str) {
        if (i) {
            try {
                return wxr.b(cls, str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static short b(long j2) {
        return wxr.b(j2);
    }

    public static short b(byte[] bArr, int i2) {
        return wxr.b(bArr, i2);
    }

    public static boolean b() {
        return e;
    }

    public static int c() {
        return f;
    }

    public static int c(long j2) {
        return wxr.c(j2);
    }

    public static int c(byte[] bArr, int i2) {
        return wxr.c(bArr, i2);
    }

    public static <T> Queue<T> c(int i2) {
        return i ? new wyk(i2) : new wzc(i2);
    }

    public static <T> AtomicLongFieldUpdater<T> c(Class<? super T> cls, String str) {
        if (i) {
            try {
                return wxr.c(cls, str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static void c(ByteBuffer byteBuffer) {
        if (r || o) {
            int capacity = byteBuffer.capacity();
            wxr.e(wxr.b(byteBuffer));
            e(capacity);
            return;
        }
        throw new AssertionError();
    }

    public static long d(long j2) {
        return wxr.d(j2);
    }

    public static long d(byte[] bArr, int i2) {
        return wxr.d(bArr, i2);
    }

    private static void d(int i2) {
        long j2;
        long j3;
        if (p != null) {
            do {
                j2 = p.get();
                j3 = ((long) i2) + j2;
                if (j3 > q) {
                    StringBuilder sb = new StringBuilder("failed to allocate ");
                    sb.append(i2);
                    sb.append(" byte(s) of direct memory (used: ");
                    sb.append(j2);
                    sb.append(", max: ");
                    sb.append(q);
                    sb.append(')');
                    throw new OutOfDirectMemoryError(sb.toString());
                }
            } while (!p.compareAndSet(j2, j3));
        }
    }

    public static boolean d() {
        return g;
    }

    private static int e(byte[] bArr, int i2) {
        byte b2;
        int i3;
        if (a) {
            b2 = (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
            i3 = bArr[i2 + 3] & 255;
        } else {
            b2 = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
            i3 = bArr[i2 + 3] << 24;
        }
        return i3 | b2;
    }

    private static void e(int i2) {
        AtomicLong atomicLong = p;
        if (atomicLong != null) {
            long addAndGet = atomicLong.addAndGet((long) (-i2));
            if (!r && addAndGet < 0) {
                throw new AssertionError();
            }
        }
    }

    public static boolean e() {
        return i;
    }

    private static short f(byte[] bArr, int i2) {
        int i3;
        int i4;
        if (a) {
            i3 = bArr[i2] << 8;
            i4 = bArr[i2 + 1] & 255;
        } else {
            i3 = bArr[i2] & 255;
            i4 = bArr[i2 + 1] << 8;
        }
        return (short) (i4 | i3);
    }

    public static boolean f() {
        return wxr.a();
    }

    public static boolean g() {
        return k;
    }

    public static long h() {
        return l;
    }

    public static boolean i() {
        return n;
    }

    public static <K, V> ConcurrentMap<K, V> j() {
        return j ? new ConcurrentHashMapV8() : new ConcurrentHashMap();
    }

    public static wxk k() {
        return i ? new LongAdderV8() : new AtomicLongCounter(0);
    }

    public static boolean l() {
        return o;
    }

    public static <T> Queue<T> m() {
        return a.a(1048576);
    }

    public static ClassLoader n() {
        return wxr.f();
    }

    public static ClassLoader o() {
        return wxr.g();
    }

    private static boolean q() {
        boolean z = false;
        try {
            Class.forName("android.app.Application", false, wxr.g());
            z = true;
        } catch (Throwable unused) {
        }
        if (z) {
            b.b("Platform: Android");
        }
        return z;
    }

    private static int r() {
        try {
            String[] split = ((String) AccessController.doPrivileged(new PrivilegedAction<String>() {
                public final /* synthetic */ Object run() {
                    return System.getProperty("java.specification.version");
                }
            })).split("\\.");
            int[] iArr = new int[split.length];
            for (int i2 = 0; i2 < split.length; i2++) {
                iArr[i2] = Integer.parseInt(split[i2]);
            }
            if (iArr[0] != 1) {
                return iArr[0];
            }
            if (!r) {
                if (iArr[1] < 6) {
                    throw new AssertionError();
                }
            }
            return iArr[1];
        } catch (SecurityException e2) {
            b.b("security exception while reading java.specification.version", (Throwable) e2);
            return 6;
        }
    }

    private static boolean s() {
        if (d) {
            b.b("sun.misc.Unsafe: unavailable (Android)");
            return false;
        } else if (h) {
            return false;
        } else {
            try {
                boolean b2 = wxr.b();
                b.b("sun.misc.Unsafe: {}", (Object) b2 ? "available" : "unavailable");
                return b2;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
        if (r0 != 'm') goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long t() {
        /*
            r0 = 0
            r1 = 0
            r3 = 1
            r4 = 0
            java.lang.String r5 = "sun.misc.VM"
            java.lang.ClassLoader r6 = defpackage.wxr.g()     // Catch:{ all -> 0x0024 }
            java.lang.Class r5 = java.lang.Class.forName(r5, r3, r6)     // Catch:{ all -> 0x0024 }
            java.lang.String r6 = "maxDirectMemory"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x0024 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ all -> 0x0024 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0024 }
            java.lang.Object r5 = r5.invoke(r0, r6)     // Catch:{ all -> 0x0024 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0024 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            r5 = r1
        L_0x0025:
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x002a
            return r5
        L_0x002a:
            java.lang.String r7 = "java.lang.management.ManagementFactory"
            java.lang.ClassLoader r8 = defpackage.wxr.g()     // Catch:{ all -> 0x00ad }
            java.lang.Class r7 = java.lang.Class.forName(r7, r3, r8)     // Catch:{ all -> 0x00ad }
            java.lang.String r8 = "java.lang.management.RuntimeMXBean"
            java.lang.ClassLoader r9 = defpackage.wxr.g()     // Catch:{ all -> 0x00ad }
            java.lang.Class r8 = java.lang.Class.forName(r8, r3, r9)     // Catch:{ all -> 0x00ad }
            java.lang.String r9 = "getRuntimeMXBean"
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ad }
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r9, r10)     // Catch:{ all -> 0x00ad }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r7.invoke(r0, r9)     // Catch:{ all -> 0x00ad }
            java.lang.String r7 = "getInputArguments"
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ad }
            java.lang.reflect.Method r7 = r8.getDeclaredMethod(r7, r9)     // Catch:{ all -> 0x00ad }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r7.invoke(r0, r8)     // Catch:{ all -> 0x00ad }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00ad }
            int r7 = r0.size()     // Catch:{ all -> 0x00ad }
            int r7 = r7 - r3
        L_0x0061:
            if (r7 < 0) goto L_0x00b2
            java.util.regex.Pattern r8 = c     // Catch:{ all -> 0x00ad }
            java.lang.Object r9 = r0.get(r7)     // Catch:{ all -> 0x00ad }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ all -> 0x00ad }
            java.util.regex.Matcher r8 = r8.matcher(r9)     // Catch:{ all -> 0x00ad }
            boolean r9 = r8.matches()     // Catch:{ all -> 0x00ad }
            if (r9 == 0) goto L_0x00af
            java.lang.String r0 = r8.group(r3)     // Catch:{ all -> 0x00ad }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x00ad }
            r0 = 2
            java.lang.String r0 = r8.group(r0)     // Catch:{ all -> 0x00ad }
            char r0 = r0.charAt(r4)     // Catch:{ all -> 0x00ad }
            r3 = 71
            if (r0 == r3) goto L_0x00a7
            r3 = 75
            if (r0 == r3) goto L_0x00a3
            r3 = 77
            if (r0 == r3) goto L_0x009f
            r3 = 103(0x67, float:1.44E-43)
            if (r0 == r3) goto L_0x00a7
            r3 = 107(0x6b, float:1.5E-43)
            if (r0 == r3) goto L_0x00a3
            r3 = 109(0x6d, float:1.53E-43)
            if (r0 == r3) goto L_0x009f
            goto L_0x00b2
        L_0x009f:
            r3 = 1048576(0x100000, double:5.180654E-318)
            goto L_0x00aa
        L_0x00a3:
            r0 = 10
            long r5 = r5 << r0
            goto L_0x00b2
        L_0x00a7:
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
        L_0x00aa:
            long r5 = r5 * r3
            goto L_0x00b2
        L_0x00ad:
            goto L_0x00b2
        L_0x00af:
            int r7 = r7 + -1
            goto L_0x0061
        L_0x00b2:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ca
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r5 = r0.maxMemory()
            wyc r0 = b
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = "maxDirectMemory: {} bytes (maybe)"
            r0.b(r2, r1)
            goto L_0x00d5
        L_0x00ca:
            wyc r0 = b
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = "maxDirectMemory: {} bytes"
            r0.b(r2, r1)
        L_0x00d5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.PlatformDependent.t():long");
    }

    private static boolean u() {
        if (d) {
            return false;
        }
        boolean a2 = wxu.a("io.netty.noJavassist", false);
        b.b("-Dio.netty.noJavassist: {}", (Object) Boolean.valueOf(a2));
        if (a2) {
            b.b("Javassist: unavailable (io.netty.noJavassist)");
            return false;
        }
        try {
            wxj.a(Object.class, wxr.a(PlatformDependent.class));
            b.b("Javassist: available");
            return true;
        } catch (Throwable unused) {
            b.b("Javassist: unavailable");
            b.b("You don't have Javassist in your class path or you don't have enough permission to load dynamically generated classes.  Please check the configuration for better performance.");
            return false;
        }
    }

    private static File v() {
        try {
            File a2 = a(wxu.b("io.netty.tmpdir"));
            if (a2 != null) {
                b.b("-Dio.netty.tmpdir: {}", (Object) a2);
                return a2;
            }
            File a3 = a(wxu.b("java.io.tmpdir"));
            if (a3 != null) {
                b.b("-Dio.netty.tmpdir: {} (java.io.tmpdir)", (Object) a3);
                return a3;
            }
            if (e) {
                File a4 = a(System.getenv("TEMP"));
                if (a4 != null) {
                    b.b("-Dio.netty.tmpdir: {} (%TEMP%)", (Object) a4);
                    return a4;
                }
                String str = System.getenv("USERPROFILE");
                if (str != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("\\AppData\\Local\\Temp");
                    File a5 = a(sb.toString());
                    if (a5 != null) {
                        b.b("-Dio.netty.tmpdir: {} (%USERPROFILE%\\AppData\\Local\\Temp)", (Object) a5);
                        return a5;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("\\Local Settings\\Temp");
                    File a6 = a(sb2.toString());
                    if (a6 != null) {
                        b.b("-Dio.netty.tmpdir: {} (%USERPROFILE%\\Local Settings\\Temp)", (Object) a6);
                        return a6;
                    }
                }
            } else {
                File a7 = a(System.getenv("TMPDIR"));
                if (a7 != null) {
                    b.b("-Dio.netty.tmpdir: {} ($TMPDIR)", (Object) a7);
                    return a7;
                }
            }
            File file = e ? new File("C:\\Windows\\Temp") : new File("/tmp");
            b.c("Failed to get the temporary directory; falling back to: {}", (Object) file);
            return file;
        } catch (Throwable unused) {
        }
    }
}
