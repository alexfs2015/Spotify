package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.R;
import java.util.List;

/* renamed from: jxb reason: default package */
public final class jxb extends jxp {
    public final /* bridge */ /* synthetic */ PendingIntent a(Context context) {
        return super.a(context);
    }

    public final SpannableString a(hwq hwq, Context context) {
        hwu d = hwq.d();
        boolean isInterruptionFromAds = PlayerTrackUtil.isInterruptionFromAds(d.a, d.d);
        boolean booleanValue = Boolean.valueOf((String) d.d.get("is_advertisement")).booleanValue();
        if (isInterruptionFromAds) {
            return new SpannableString(context.getString(R.string.widget_label));
        }
        if (!booleanValue) {
            return super.a(hwq, context);
        }
        String str = (String) d.d.get("title");
        if (TextUtils.isEmpty(str)) {
            str = context.getString(R.string.audio_ads_header_title);
        }
        return new SpannableString(str);
    }

    public final /* bridge */ /* synthetic */ List a(hwq hwq, Context context, fqn fqn) {
        return super.a(hwq, context, fqn);
    }

    public final boolean a(hwq hwq) {
        hwu d = hwq.d();
        return (hwq.n() || PlayerTrackUtil.isInterruptionFromAds(d.a, d.d)) && !PlayerTrackUtil.isPodcastAd(d.d);
    }

    public final SpannableString b(hwq hwq, Context context) {
        hwu d = hwq.d();
        boolean isInterruptionFromAds = PlayerTrackUtil.isInterruptionFromAds(d.a, d.d);
        boolean booleanValue = Boolean.valueOf((String) d.d.get("is_advertisement")).booleanValue();
        if (isInterruptionFromAds) {
            return null;
        }
        return booleanValue ? new SpannableString(fbo.b((String) d.d.get("advertiser"))) : super.b(hwq, context);
    }
}
