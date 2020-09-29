package defpackage;

import android.graphics.Color;

/* renamed from: npl reason: default package */
public final class npl {
    public static int a(String str, int i) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return i;
        }
    }
}
