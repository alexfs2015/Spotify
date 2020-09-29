package defpackage;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: rh reason: default package */
final class rh {
    private static Method a;
    private static boolean b;

    private static void a() {
        if (!b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
    }

    static void a(ViewGroup viewGroup, boolean z) {
        a();
        Method method = a;
        if (method != null) {
            try {
                method.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
