package defpackage;

import android.graphics.Rect;

/* renamed from: lvq reason: default package */
public abstract class lvq {
    public abstract Rect a();

    public abstract String b();

    public abstract String c();

    public static lvq a(Rect rect, String str, String str2) {
        return new lvd(rect, str, str2);
    }
}
