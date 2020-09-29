package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import java.util.List;

/* renamed from: jux reason: default package */
final class jux extends jvh {
    jux() {
    }

    public final boolean a(hue hue) {
        if (hue.s()) {
            hui d = hue.d();
            if ((jst.a(d.a).b == LinkType.SHOW_EPISODE && "audio".equals((String) d.d.get("media.type"))) || hue.j() || hue.n()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final List<jva> a(hue hue, Context context, fpt fpt) {
        hui d = hue.d();
        hud hud = d.e;
        return ImmutableList.a(jvd.a(hud.d(), R.drawable.icn_notification_liked, R.drawable.icn_notification_like, R.string.player_content_description_unlike, R.string.player_content_description_like, jus.b(context, d.a, hue.a()), jus.a(context, d.a, hue.a()), false), jvd.a(hue, context, true), jvd.b(hue, context, true), jvd.c(hue, context, true), jvd.a(hud.c(), hue.t() ? R.drawable.icn_notification_block : R.drawable.icn_notification_banned, hue.t() ? R.drawable.icn_notification_block : R.drawable.icn_notification_ban, hue.t() ? R.string.player_content_description_unhide : R.string.player_content_description_unban, hue.t() ? R.string.player_content_description_hide : R.string.player_content_description_ban, jus.d(context, d.a, hue.a()), jus.c(context, d.a, hue.a()), false));
    }
}
