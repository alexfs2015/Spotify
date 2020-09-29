package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: wzh reason: default package */
public final class wzh {
    public static final Unsafe a;
    private static final boolean b = (System.getProperty("rx.unsafe-disable") != null);

    static {
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get(null);
        } catch (Throwable unused) {
        }
        a = unsafe;
    }

    public static boolean a() {
        return a != null && !b;
    }

    public static long a(Class<?> cls, String str) {
        try {
            return a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            InternalError internalError = new InternalError();
            internalError.initCause(e);
            throw internalError;
        }
    }
}
