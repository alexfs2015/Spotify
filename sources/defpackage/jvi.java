package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.text.SpannableString;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import java.util.List;

/* renamed from: jvi reason: default package */
final class jvi implements jvf {
    private final jvh a;

    jvi(jvh jvh) {
        this.a = (jvh) fay.a(jvh);
    }

    public final boolean a(hue hue) {
        String str = hue.d().a;
        return ((!fax.a(str) && jst.a(str).b == LinkType.SHOW_EPISODE) || PlayerTrackUtil.isPodcastAd(hue.d().d)) && !hue.j();
    }

    public final PendingIntent a(Context context) {
        return this.a.a(context);
    }

    public final List<jva> a(hue hue, Context context, fpt fpt) {
        return ImmutableList.a(new jva(new jvb(R.drawable.icn_notification_new_skip_back_15, R.string.notification_skip_back_15), jus.a(context, -15000), true), jvd.a(hue, context, false), jvd.b(hue, context, true), jvd.c(hue, context, false), new jva(new jvb(R.drawable.icn_notification_new_skip_forward_15, R.string.notification_skip_forward_15), jus.a(context, 15000), true));
    }

    public final SpannableString a(hue hue, Context context) {
        return this.a.a(hue, context);
    }

    public final SpannableString b(hue hue, Context context) {
        return this.a.b(hue, context);
    }
}
