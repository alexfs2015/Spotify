package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: uur reason: default package */
public final class uur {
    public static boolean a(Context context) {
        if (VERSION.SDK_INT >= 17 && context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static boolean a(View view) {
        return ip.f(view) == 1;
    }
}
