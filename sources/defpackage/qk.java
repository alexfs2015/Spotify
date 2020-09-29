package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: qk reason: default package */
public final class qk implements ql {
    private static Class<?> a;
    private static boolean b;
    private static Method c;
    private static boolean d;
    private static Method e;
    private static boolean f;
    private final View g;

    private qk(View view) {
        this.g = view;
    }

    public static ql a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (!d) {
            try {
                a();
                Method declaredMethod = a.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return new qk((View) method.invoke(null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return null;
    }

    private static void a() {
        if (!b) {
            try {
                a = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            b = true;
        }
    }

    public static void a(View view) {
        if (!f) {
            try {
                a();
                Method declaredMethod = a.getDeclaredMethod("removeGhost", new Class[]{View.class});
                e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f = true;
        }
        Method method = e;
        if (method != null) {
            try {
                method.invoke(null, new Object[]{view});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public final void a(ViewGroup viewGroup, View view) {
    }

    public final void setVisibility(int i) {
        this.g.setVisibility(i);
    }
}
