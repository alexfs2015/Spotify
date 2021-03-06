package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: jtc reason: default package */
public final class jtc {
    private static Boolean a;

    public static <T> T a(T t, T t2) {
        return t != null ? t : t2;
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static boolean b(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static synchronized boolean c(Context context) {
        boolean booleanValue;
        synchronized (jtc.class) {
            if (a == null) {
                int i = context.getResources().getConfiguration().smallestScreenWidthDp;
                if (VERSION.SDK_INT >= 24) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    i = (int) (((float) i) / (((float) DisplayMetrics.DENSITY_DEVICE_STABLE) / ((float) displayMetrics.densityDpi)));
                }
                a = Boolean.valueOf(i >= 600);
            }
            booleanValue = a.booleanValue();
        }
        return booleanValue;
    }
}
