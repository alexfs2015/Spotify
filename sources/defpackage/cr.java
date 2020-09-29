package defpackage;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: cr reason: default package */
public final class cr {
    public static void a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            cs.a(view, charSequence);
        }
    }
}
