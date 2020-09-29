package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.R;
import java.util.List;

/* renamed from: jxf reason: default package */
final class jxf extends jxp {
    jxf() {
    }

    public final List<jxi> a(hwq hwq, Context context, fqn fqn) {
        hwu d = hwq.d();
        hwp hwp = d.e;
        return ImmutableList.a(jxl.a(hwp.d(), R.drawable.icn_notification_liked, R.drawable.icn_notification_like, R.string.player_content_description_unlike, R.string.player_content_description_like, jxa.b(context, d.a, hwq.a()), jxa.a(context, d.a, hwq.a()), false), jxl.a(hwq, context, true), jxl.b(hwq, context, true), jxl.c(hwq, context, true), jxl.a(hwp.c(), hwq.t() ? R.drawable.icn_notification_block : R.drawable.icn_notification_banned, hwq.t() ? R.drawable.icn_notification_block : R.drawable.icn_notification_ban, hwq.t() ? R.string.player_content_description_unhide : R.string.player_content_description_unban, hwq.t() ? R.string.player_content_description_hide : R.string.player_content_description_ban, jxa.d(context, d.a, hwq.a()), jxa.c(context, d.a, hwq.a()), false));
    }

    public final boolean a(hwq hwq) {
        if (hwq.s()) {
            hwu d = hwq.d();
            return !(jva.a(d.a).b == LinkType.SHOW_EPISODE && "audio".equals((String) d.d.get("media.type"))) && !hwq.j() && !hwq.n();
        }
    }
}
