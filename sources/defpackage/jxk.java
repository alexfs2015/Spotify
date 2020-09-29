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

/* renamed from: jxk reason: default package */
public final class jxk extends jxp {
    private final jxj a = new jxj(R.drawable.icn_notification_new_positive_feedback, R.string.content_description_radio_thumb_up);
    private final jxj b = new jxj(R.drawable.icn_notification_new_positive_feedback_disabled, R.string.content_description_radio_thumb_up_disabled);
    private final jxj c = new jxj(R.drawable.icn_notification_new_positive_feedback_selected, R.string.content_description_radio_thumb_up_selected);
    private final jxj d = new jxj(R.drawable.icn_notification_new_negative_feedback, R.string.content_description_radio_thumb_down);
    private final jxj e = new jxj(R.drawable.icn_notification_new_negative_feedback_disabled, R.string.content_description_radio_thumb_down_disabled);
    private final jxj f = new jxj(R.drawable.icn_notification_new_negative_feedback_selected, R.string.content_description_radio_thumb_down_selected);
    private final rjm g;

    public jxk(rjm rjm) {
        this.g = rjm;
    }

    public final /* bridge */ /* synthetic */ PendingIntent a(Context context) {
        return super.a(context);
    }

    public final /* bridge */ /* synthetic */ SpannableString a(hwq hwq, Context context) {
        return super.a(hwq, context);
    }

    public final List<jxi> a(hwq hwq, Context context, fqn fqn) {
        Map<String, String> map = hwq.d().d;
        Map c2 = hwq.c();
        jxi jxi = new jxi(this.b, null, false);
        jxi jxi2 = new jxi(this.e, null, false);
        if (!hwq.n() && !hwq.q()) {
            boolean containsKey = map.containsKey(Metadata.LIKE_FEEDBACK_SELECTED);
            boolean containsKey2 = map.containsKey(Metadata.DISLIKE_FEEDBACK_SELECTED);
            if (c2 != null) {
                if (!containsKey && !containsKey2) {
                    jxi = new jxi(this.a, PendingIntent.getService(context, 1, FeedbackService.a(context, hwq.d().a, hwq.a(), hwq.f().featureIdentifier()), 134217728), false);
                    jxi2 = new jxi(this.d, PendingIntent.getService(context, 2, FeedbackService.b(context, hwq.d().a, hwq.a(), hwq.f().featureIdentifier()), 134217728), false);
                } else if (containsKey) {
                    jxi = new jxi(this.c, jwz.a(context, hwq.d().a, hwq.a(), hwq.f().featureIdentifier()), false);
                } else {
                    jxi2 = new jxi(this.f, jwz.a(context, hwq.d().a, hwq.a(), hwq.f().featureIdentifier()), false);
                }
            }
        }
        return ImmutableList.a(jxi, jxl.a(hwq, context, true), jxl.b(hwq, context, true), jxl.c(hwq, context, true), jxi2);
    }

    public final boolean a(hwq hwq) {
        PlayerTrack create = PlayerTrack.create(hwq.d().a, hwq.d().d);
        jye jye = new jye(hwq.a());
        jye.o = hwq.c();
        jye.b = create;
        PlayerContextIndex playerContextIndex = r0;
        PlayerContextIndex playerContextIndex2 = new PlayerContextIndex(0, jye.e.intValue());
        PlayerState playerState = new PlayerState(0, jye.a, jye.c, jye.b, jye.d, playerContextIndex, jye.j, jye.l, jye.k, jye.f, false, jye.g, jye.h, jye.i, jye.m, jye.n, jye.o, jye.p, jye.q);
        return rjm.b(playerState);
    }

    public final /* bridge */ /* synthetic */ SpannableString b(hwq hwq, Context context) {
        return super.b(hwq, context);
    }
}
