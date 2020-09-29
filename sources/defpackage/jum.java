package defpackage;

import android.view.View.MeasureSpec;

/* renamed from: jum reason: default package */
public final class jum {
    public static boolean a(int i) {
        return MeasureSpec.getMode(i) == 1073741824;
    }

    public static boolean b(int i) {
        return MeasureSpec.getMode(i) == 0;
    }
}
