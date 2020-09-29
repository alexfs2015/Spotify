package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.R;
import java.util.List;

/* renamed from: jut reason: default package */
public final class jut extends jvh {
    public final /* bridge */ /* synthetic */ PendingIntent a(Context context) {
        return super.a(context);
    }

    public final /* bridge */ /* synthetic */ List a(hue hue, Context context, fpt fpt) {
        return super.a(hue, context, fpt);
    }

    public final boolean a(hue hue) {
        hui d = hue.d();
        return (hue.n() || PlayerTrackUtil.isInterruptionFromAds(d.a, d.d)) && !PlayerTrackUtil.isPodcastAd(d.d);
    }

    public final SpannableString a(hue hue, Context context) {
        hui d = hue.d();
        boolean isInterruptionFromAds = PlayerTrackUtil.isInterruptionFromAds(d.a, d.d);
        boolean booleanValue = Boolean.valueOf((String) d.d.get("is_advertisement")).booleanValue();
        if (isInterruptionFromAds) {
            return new SpannableString(context.getString(R.string.widget_label));
        }
        if (!booleanValue) {
            return super.a(hue, context);
        }
        String str = (String) d.d.get("title");
        if (TextUtils.isEmpty(str)) {
            str = context.getString(R.string.audio_ads_header_title);
        }
        return new SpannableString(str);
    }

    public final SpannableString b(hue hue, Context context) {
        hui d = hue.d();
        boolean isInterruptionFromAds = PlayerTrackUtil.isInterruptionFromAds(d.a, d.d);
        boolean booleanValue = Boolean.valueOf((String) d.d.get("is_advertisement")).booleanValue();
        if (isInterruptionFromAds) {
            return null;
        }
        if (booleanValue) {
            return new SpannableString(fax.b((String) d.d.get("advertiser")));
        }
        return super.b(hue, context);
    }
}
