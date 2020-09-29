package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

/* renamed from: in reason: default package */
public final class in {
    Object a;

    private in(Object obj) {
        this.a = obj;
    }

    public static in a(Context context, int i) {
        if (VERSION.SDK_INT >= 24) {
            return new in(PointerIcon.getSystemIcon(context, 1002));
        }
        return new in(null);
    }
}
