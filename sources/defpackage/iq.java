package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: iq reason: default package */
public final class iq {
    private static Method a;

    static {
        if (VERSION.SDK_INT == 25) {
            try {
                a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    public static float a(ViewConfiguration viewConfiguration, Context context) {
        return VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : d(viewConfiguration, context);
    }

    public static int a(ViewConfiguration viewConfiguration) {
        return VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static float b(ViewConfiguration viewConfiguration, Context context) {
        return VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : d(viewConfiguration, context);
    }

    public static boolean c(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }

    private static float d(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 25) {
            Method method = a;
            if (method != null) {
                try {
                    return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
                } catch (Exception unused) {
                }
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
