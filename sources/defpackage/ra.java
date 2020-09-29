package defpackage;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: ra reason: default package */
public final class ra {
    public static void a(ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 18) {
            rc.a(viewGroup, z);
        } else {
            rb.a(viewGroup, z);
        }
    }
}
