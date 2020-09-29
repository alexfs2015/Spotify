package defpackage;

import android.graphics.Color;

/* renamed from: njp reason: default package */
public final class njp {
    public static int a(String str, int i) {
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return i;
        }
    }
}
