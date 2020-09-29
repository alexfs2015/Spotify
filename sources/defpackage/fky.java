package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: fky reason: default package */
public final class fky {
    private static final Unsafe a = d();
    private static final boolean b = f();
    private static final boolean c;
    private static final long d;

    static {
        boolean e = e();
        c = e;
        d = (long) (e ? a.arrayBaseOffset(byte[].class) : -1);
        Field a2 = a(Buffer.class, "address");
        if (a2 != null) {
            Unsafe unsafe = a;
            if (unsafe != null) {
                unsafe.objectFieldOffset(a2);
            }
        }
    }

    public static boolean a() {
        return c;
    }

    public static boolean b() {
        return b;
    }

    public static long c() {
        return d;
    }

    public static byte a(byte[] bArr, long j) {
        return a.getByte(bArr, j);
    }

    public static void a(byte[] bArr, long j, byte b2) {
        a.putByte(bArr, j, b2);
    }

    public static long b(byte[] bArr, long j) {
        return a.getLong(bArr, j);
    }

    private static Unsafe d() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() {
                public final /* synthetic */ Object run() {
                    Field[] declaredFields;
                    Class<Unsafe> cls = Unsafe.class;
                    for (Field field : cls.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (cls.isInstance(obj)) {
                            return (Unsafe) cls.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean e() {
        Unsafe unsafe = a;
        if (unsafe != null) {
            try {
                Class cls = unsafe.getClass();
                cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean f() {
        String str = "getLong";
        Unsafe unsafe = a;
        if (unsafe != null) {
            try {
                Class cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getByte", new Class[]{Long.TYPE});
                cls.getMethod(str, new Class[]{Object.class, Long.TYPE});
                cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
                cls.getMethod(str, new Class[]{Long.TYPE});
                cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
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
}
