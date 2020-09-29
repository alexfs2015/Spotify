package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import java.util.List;

/* renamed from: juy reason: default package */
final class juy extends jvh {
    private final jvb a = new jvb(R.drawable.icn_notification_new_positive_feedback, R.string.content_description_radio_thumb_up);
    private final jvb b = new jvb(R.drawable.icn_notification_new_positive_feedback_disabled, R.string.content_description_radio_thumb_up_disabled);
    private final jvb c = new jvb(R.drawable.icn_notification_new_positive_feedback_selected, R.string.content_description_radio_thumb_up_selected);
    private final jvb d = new jvb(R.drawable.icn_notification_new_negative_feedback, R.string.content_description_radio_thumb_down);
    private final jvb e = new jvb(R.drawable.icn_notification_new_negative_feedback_disabled, R.string.content_description_radio_thumb_down_disabled);

    juy() {
    }

    public final boolean a(hue hue) {
        return hue.h();
    }

    public final List<jva> a(hue hue, Context context, fpt fpt) {
        jva jva = new jva(this.b, null, false);
        jva jva2 = new jva(this.e, null, false);
        if (!hue.n() && !hue.q()) {
            if (hue.d().e.d()) {
                jva = new jva(this.c, jus.b(context, hue.d().a, hue.a()), false);
                jva2 = new jva(this.e, null, false);
            } else {
                jva = new jva(this.a, jus.a(context, hue.d().a, hue.a()), false);
                jva2 = new jva(this.d, PendingIntent.getService(context, 2, RadioActionsService.a(context, ThumbState.DOWN), 134217728), false);
            }
        }
        return ImmutableList.a(jva, jvd.a(hue, context, true), jvd.b(hue, context, true), jvd.c(hue, context, true), jva2);
    }
}
