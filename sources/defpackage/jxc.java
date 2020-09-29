package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import java.util.List;
import java.util.Map;

/* renamed from: jxc reason: default package */
final class jxc implements jxn {
    private final jxp a;

    jxc(jxp jxp) {
        this.a = (jxp) fbp.a(jxp);
    }

    public final PendingIntent a(Context context) {
        return this.a.a(context);
    }

    public final SpannableString a(hwq hwq, Context context) {
        SpannableString spannableString = new SpannableString((CharSequence) fbp.a(hwq.b()));
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor((String) ((Map) fbp.a(hwq.c())).get("primary_color"))), 0, spannableString.length(), 33);
        return spannableString;
    }

    public final List<jxi> a(hwq hwq, Context context, fqn fqn) {
        return this.a.a(hwq, context, fqn);
    }

    public final boolean a(hwq hwq) {
        Map c = hwq.c();
        return c != null && !TextUtils.isEmpty(hwq.b()) && c.get("primary_color") != null && !hwq.q() && this.a.a(hwq);
    }

    public final SpannableString b(hwq hwq, Context context) {
        return this.a.b(hwq, context);
    }
}
