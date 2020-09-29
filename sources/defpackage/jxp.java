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

/* renamed from: jxp reason: default package */
class jxp implements jxn {
    jxp() {
    }

    public PendingIntent a(Context context) {
        return PendingIntent.getActivity(context, 0, kpo.b(context).a, 134217728);
    }

    public SpannableString a(hwq hwq, Context context) {
        CharSequence b = hwq.b();
        boolean z = VERSION.SDK_INT >= 24;
        if (!TextUtils.isEmpty(b) && ((z && !hwq.q()) || !hwq.r())) {
            return new SpannableString(b);
        }
        if (z) {
            return null;
        }
        SpannableString spannableString = new SpannableString(context.getString(R.string.app_name));
        spannableString.setSpan(new ForegroundColorSpan(fr.c(context, R.color.green)), 0, spannableString.length(), 33);
        return spannableString;
    }

    public List<jxi> a(hwq hwq, Context context, fqn fqn) {
        a aVar = new a();
        if (hwq.d().e.b()) {
            aVar.c(jxl.a(hwq.d().e.d(), R.drawable.icn_notification_new_positive_feedback_selected, R.drawable.icn_notification_new_positive_feedback, R.string.content_description_radio_thumb_down, R.string.content_description_radio_thumb_up, jxa.b(context, hwq.d().a, hwq.a()), jxa.a(context, hwq.d().a, hwq.a()), false));
        }
        aVar.c(jxl.a(hwq, context, true));
        aVar.c(jxl.b(hwq, context, true));
        aVar.c(jxl.c(hwq, context, true));
        return aVar.a();
    }

    public boolean a(hwq hwq) {
        return true;
    }

    public SpannableString b(hwq hwq, Context context) {
        hwu d = hwq.d();
        if (!d.g.b()) {
            d.g = Optional.b(new hwv(d));
        }
        String str = ((hwv) d.g.c()).a;
        if (fbo.a(str)) {
            return null;
        }
        return new SpannableString(str);
    }
}
