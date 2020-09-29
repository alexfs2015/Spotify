package defpackage;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: rk reason: default package */
class rk extends rn {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    rk() {
    }

    public final float a(View view) {
        if (!d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.a(view);
    }

    public final void a(View view, float f) {
        if (!b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Float.valueOf(f)});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }

    public final void b(View view) {
    }

    public final void c(View view) {
    }
}
