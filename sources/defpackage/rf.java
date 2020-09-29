package defpackage;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: rf reason: default package */
public final class rf {
    public static void a(ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 18) {
            rh.a(viewGroup, z);
        } else {
            rg.a(viewGroup, z);
        }
    }
}
