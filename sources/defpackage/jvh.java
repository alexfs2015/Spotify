package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.R;
import java.util.List;

/* renamed from: jvh reason: default package */
class jvh implements jvf {
    public boolean a(hue hue) {
        return true;
    }

    jvh() {
    }

    public PendingIntent a(Context context) {
        return PendingIntent.getActivity(context, 0, kmf.b(context).a, 134217728);
    }

    public List<jva> a(hue hue, Context context, fpt fpt) {
        a aVar = new a();
        if (hue.d().e.b()) {
            aVar.c(jvd.a(hue.d().e.d(), R.drawable.icn_notification_new_positive_feedback_selected, R.drawable.icn_notification_new_positive_feedback, R.string.content_description_radio_thumb_down, R.string.content_description_radio_thumb_up, jus.b(context, hue.d().a, hue.a()), jus.a(context, hue.d().a, hue.a()), false));
        }
        aVar.c(jvd.a(hue, context, true));
        aVar.c(jvd.b(hue, context, true));
        aVar.c(jvd.c(hue, context, true));
        return aVar.a();
    }

    public SpannableString a(hue hue, Context context) {
        CharSequence b = hue.b();
        boolean z = VERSION.SDK_INT >= 24;
        if (!TextUtils.isEmpty(b) && ((z && !hue.q()) || !hue.r())) {
            return new SpannableString(b);
        }
        if (z) {
            return null;
        }
        SpannableString spannableString = new SpannableString(context.getString(R.string.app_name));
        spannableString.setSpan(new ForegroundColorSpan(fr.c(context, R.color.green)), 0, spannableString.length(), 33);
        return spannableString;
    }

    public SpannableString b(hue hue, Context context) {
        hui d = hue.d();
        if (!d.g.b()) {
            d.g = Optional.b(new huj(d));
        }
        String str = ((huj) d.g.c()).a;
        if (fax.a(str)) {
            return null;
        }
        return new SpannableString(str);
    }
}
