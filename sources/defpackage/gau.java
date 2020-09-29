package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;

/* renamed from: gau reason: default package */
public final class gau {
    public static int a(Resources resources) {
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier == 0) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    public static void a(Context context) {
        if (VERSION.SDK_INT >= 19 && (context instanceof Activity)) {
            ((Activity) context).getWindow().addFlags(67108864);
        }
    }

    public static boolean b(Context context) {
        return VERSION.SDK_INT >= 19 && (context instanceof Activity) && (((Activity) context).getWindow().getAttributes().flags & 67108864) != 0;
    }

    public static int c(Context context) {
        if (b(context)) {
            return a(context.getResources());
        }
        return 0;
    }
}
