package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.music.R;
import java.util.List;

/* renamed from: jxd reason: default package */
final class jxd extends jxp {
    private final rjm a;

    public jxd(rjm rjm) {
        this.a = rjm;
    }

    public final List<jxi> a(hwq hwq, Context context, fqn fqn) {
        hwu d = hwq.d();
        hwp hwp = d.e;
        return ImmutableList.a(jxl.a(hwp.d(), R.drawable.icn_notification_liked, R.drawable.icn_notification_like, R.string.player_content_description_unlike, R.string.player_content_description_like, jxa.b(context, d.a, hwq.a()), jxa.a(context, d.a, hwq.a()), false), jxl.a(hwq, context, true), jxl.b(hwq, context, true), jxl.c(hwq, context, true), jxl.a(hwp.c(), R.drawable.icn_notification_banned, R.drawable.icn_notification_ban, R.string.player_content_description_unban, R.string.player_content_description_ban, jxa.d(context, d.a, hwq.a()), jxa.c(context, d.a, hwq.a()), false));
    }

    public final boolean a(hwq hwq) {
        return this.a.a((String) hwq.c().get(Metadata.FORMAT_LIST_TYPE));
    }
}
