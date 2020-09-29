package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.text.SpannableString;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContextIndex;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import com.spotify.music.R;
import com.spotify.music.feedback.service.FeedbackService;
import java.util.List;
import java.util.Map;

/* renamed from: jvc reason: default package */
public final class jvc extends jvh {
    private final jvb a = new jvb(R.drawable.icn_notification_new_positive_feedback, R.string.content_description_radio_thumb_up);
    private final jvb b = new jvb(R.drawable.icn_notification_new_positive_feedback_disabled, R.string.content_description_radio_thumb_up_disabled);
    private final jvb c = new jvb(R.drawable.icn_notification_new_positive_feedback_selected, R.string.content_description_radio_thumb_up_selected);
    private final jvb d = new jvb(R.drawable.icn_notification_new_negative_feedback, R.string.content_description_radio_thumb_down);
    private final jvb e = new jvb(R.drawable.icn_notification_new_negative_feedback_disabled, R.string.content_description_radio_thumb_down_disabled);
    private final jvb f = new jvb(R.drawable.icn_notification_new_negative_feedback_selected, R.string.content_description_radio_thumb_down_selected);
    private final raq g;

    public final /* bridge */ /* synthetic */ PendingIntent a(Context context) {
        return super.a(context);
    }

    public final /* bridge */ /* synthetic */ SpannableString a(hue hue, Context context) {
        return super.a(hue, context);
    }

    public final /* bridge */ /* synthetic */ SpannableString b(hue hue, Context context) {
        return super.b(hue, context);
    }

    public jvc(raq raq) {
        this.g = raq;
    }

    public final boolean a(hue hue) {
        PlayerTrack create = PlayerTrack.create(hue.d().a, hue.d().d);
        jvw jvw = new jvw(hue.a());
        jvw.o = hue.c();
        jvw.b = create;
        PlayerContextIndex playerContextIndex = r0;
        PlayerContextIndex playerContextIndex2 = new PlayerContextIndex(0, jvw.e.intValue());
        PlayerState playerState = new PlayerState(0, jvw.a, jvw.c, jvw.b, jvw.d, playerContextIndex, jvw.j, jvw.l, jvw.k, jvw.f, false, jvw.g, jvw.h, jvw.i, jvw.m, jvw.n, jvw.o, jvw.p, jvw.q);
        return raq.b(playerState);
    }

    public final List<jva> a(hue hue, Context context, fpt fpt) {
        Map<String, String> map = hue.d().d;
        Map c2 = hue.c();
        jva jva = new jva(this.b, null, false);
        jva jva2 = new jva(this.e, null, false);
        if (!hue.n() && !hue.q()) {
            boolean containsKey = map.containsKey(Metadata.LIKE_FEEDBACK_SELECTED);
            boolean containsKey2 = map.containsKey(Metadata.DISLIKE_FEEDBACK_SELECTED);
            if (c2 != null) {
                if (!containsKey && !containsKey2) {
                    jva = new jva(this.a, PendingIntent.getService(context, 1, FeedbackService.a(context, hue.d().a, hue.a(), hue.f().featureIdentifier()), 134217728), false);
                    jva2 = new jva(this.d, PendingIntent.getService(context, 2, FeedbackService.b(context, hue.d().a, hue.a(), hue.f().featureIdentifier()), 134217728), false);
                } else if (containsKey) {
                    jva = new jva(this.c, jur.a(context, hue.d().a, hue.a(), hue.f().featureIdentifier()), false);
                } else {
                    jva2 = new jva(this.f, jur.a(context, hue.d().a, hue.a(), hue.f().featureIdentifier()), false);
                }
            }
        }
        return ImmutableList.a(jva, jvd.a(hue, context, true), jvd.b(hue, context, true), jvd.c(hue, context, true), jva2);
    }
}
