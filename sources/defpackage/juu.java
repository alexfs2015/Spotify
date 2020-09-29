package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import java.util.List;
import java.util.Map;

/* renamed from: juu reason: default package */
final class juu implements jvf {
    private final jvh a;

    juu(jvh jvh) {
        this.a = (jvh) fay.a(jvh);
    }

    public final boolean a(hue hue) {
        Map c = hue.c();
        return c != null && !TextUtils.isEmpty(hue.b()) && c.get("primary_color") != null && !hue.q() && this.a.a(hue);
    }

    public final PendingIntent a(Context context) {
        return this.a.a(context);
    }

    public final List<jva> a(hue hue, Context context, fpt fpt) {
        return this.a.a(hue, context, fpt);
    }

    public final SpannableString a(hue hue, Context context) {
        SpannableString spannableString = new SpannableString((CharSequence) fay.a(hue.b()));
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor((String) ((Map) fay.a(hue.c())).get("primary_color"))), 0, spannableString.length(), 33);
        return spannableString;
    }

    public final SpannableString b(hue hue, Context context) {
        return this.a.b(hue, context);
    }
}
