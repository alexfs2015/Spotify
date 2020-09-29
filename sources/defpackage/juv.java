package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.music.R;
import java.util.List;

/* renamed from: juv reason: default package */
final class juv extends jvh {
    private final raq a;

    public juv(raq raq) {
        this.a = raq;
    }

    public final boolean a(hue hue) {
        return this.a.a((String) hue.c().get(Metadata.FORMAT_LIST_TYPE));
    }

    public final List<jva> a(hue hue, Context context, fpt fpt) {
        hui d = hue.d();
        hud hud = d.e;
        return ImmutableList.a(jvd.a(hud.d(), R.drawable.icn_notification_liked, R.drawable.icn_notification_like, R.string.player_content_description_unlike, R.string.player_content_description_like, jus.b(context, d.a, hue.a()), jus.a(context, d.a, hue.a()), false), jvd.a(hue, context, true), jvd.b(hue, context, true), jvd.c(hue, context, true), jvd.a(hud.c(), R.drawable.icn_notification_banned, R.drawable.icn_notification_ban, R.string.player_content_description_unban, R.string.player_content_description_ban, jus.d(context, d.a, hue.a()), jus.c(context, d.a, hue.a()), false));
    }
}
