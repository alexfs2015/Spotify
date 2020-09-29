package defpackage;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: ji reason: default package */
public final class ji {
    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
