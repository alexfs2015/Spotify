package defpackage;

import android.os.Build.VERSION;
import android.text.Html;
import android.text.Spanned;

/* renamed from: jug reason: default package */
public final class jug {
    public static Spanned a(String str) {
        return VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }
}
