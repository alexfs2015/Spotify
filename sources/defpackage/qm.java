package defpackage;

import android.graphics.Matrix;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: qm reason: default package */
public final class qm {
    public static Method a;
    private static boolean b;

    public static void a() {
        if (!b) {
            try {
                Method declaredMethod = ImageView.class.getDeclaredMethod("animateTransform", new Class[]{Matrix.class});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
    }
}
