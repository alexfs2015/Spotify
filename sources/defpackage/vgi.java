package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: vgi reason: default package */
public final class vgi {
    public static boolean a(Context context) {
        return VERSION.SDK_INT >= 17 && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static boolean a(View view) {
        return ip.f(view) == 1;
    }
}
