package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: cv reason: default package */
public final class cv {
    private static Method a;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(View view) {
        return ip.f(view) == 1;
    }

    public static void b(View view) {
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }
}
