package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: rl reason: default package */
class rl extends rk {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;
    private static Method e;
    private static boolean f;

    rl() {
    }

    public final void a(View view, Matrix matrix) {
        if (!b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public final void b(View view, Matrix matrix) {
        if (!d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public final void c(View view, Matrix matrix) {
        if (!f) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setAnimationMatrix", new Class[]{Matrix.class});
                e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f = true;
        }
        Method method = e;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (InvocationTargetException unused2) {
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
