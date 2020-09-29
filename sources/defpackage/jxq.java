package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.text.SpannableString;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import java.util.List;

/* renamed from: jxq reason: default package */
final class jxq implements jxn {
    private final jxp a;

    jxq(jxp jxp) {
        this.a = (jxp) fbp.a(jxp);
    }

    public final PendingIntent a(Context context) {
        return this.a.a(context);
    }

    public final SpannableString a(hwq hwq, Context context) {
        return this.a.a(hwq, context);
    }

    public final List<jxi> a(hwq hwq, Context context, fqn fqn) {
        return ImmutableList.a(new jxi(new jxj(R.drawable.icn_notification_new_skip_back_15, R.string.notification_skip_back_15), jxa.a(context, -15000), true), jxl.a(hwq, context, false), jxl.b(hwq, context, true), jxl.c(hwq, context, false), new jxi(new jxj(R.drawable.icn_notification_new_skip_forward_15, R.string.notification_skip_forward_15), jxa.a(context, 15000), true));
    }

    public final boolean a(hwq hwq) {
        String str = hwq.d().a;
        return ((!fbo.a(str) && jva.a(str).b == LinkType.SHOW_EPISODE) || PlayerTrackUtil.isPodcastAd(hwq.d().d)) && !hwq.j();
    }

    public final SpannableString b(hwq hwq, Context context) {
        return this.a.b(hwq, context);
    }
}
