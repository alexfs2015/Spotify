package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import java.util.List;

/* renamed from: jxg reason: default package */
final class jxg extends jxp {
    private final jxj a = new jxj(R.drawable.icn_notification_new_positive_feedback, R.string.content_description_radio_thumb_up);
    private final jxj b = new jxj(R.drawable.icn_notification_new_positive_feedback_disabled, R.string.content_description_radio_thumb_up_disabled);
    private final jxj c = new jxj(R.drawable.icn_notification_new_positive_feedback_selected, R.string.content_description_radio_thumb_up_selected);
    private final jxj d = new jxj(R.drawable.icn_notification_new_negative_feedback, R.string.content_description_radio_thumb_down);
    private final jxj e = new jxj(R.drawable.icn_notification_new_negative_feedback_disabled, R.string.content_description_radio_thumb_down_disabled);

    jxg() {
    }

    public final List<jxi> a(hwq hwq, Context context, fqn fqn) {
        jxi jxi = new jxi(this.b, null, false);
        jxi jxi2 = new jxi(this.e, null, false);
        if (!hwq.n() && !hwq.q()) {
            if (hwq.d().e.d()) {
                jxi = new jxi(this.c, jxa.b(context, hwq.d().a, hwq.a()), false);
                jxi2 = new jxi(this.e, null, false);
            } else {
                jxi = new jxi(this.a, jxa.a(context, hwq.d().a, hwq.a()), false);
                jxi2 = new jxi(this.d, PendingIntent.getService(context, 2, RadioActionsService.a(context, ThumbState.DOWN), 134217728), false);
            }
        }
        return ImmutableList.a(jxi, jxl.a(hwq, context, true), jxl.b(hwq, context, true), jxl.c(hwq, context, true), jxi2);
    }

    public final boolean a(hwq hwq) {
        return hwq.h();
    }
}
