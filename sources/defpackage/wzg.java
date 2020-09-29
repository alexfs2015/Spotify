package defpackage;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: wzg reason: default package */
public final class wzg {
    public static final Unsafe a;

    static {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            a = (Unsafe) declaredField.get(null);
            try {
                Unsafe.class.getMethod("getAndSetObject", new Class[]{Object.class, Long.TYPE, Object.class});
            } catch (Exception unused) {
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
