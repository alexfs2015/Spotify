package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import java.util.List;

/* renamed from: juw reason: default package */
final class juw extends jvh {
    private final jvb a = new jvb(R.drawable.icn_notification_new_positive_feedback, R.string.content_description_radio_thumb_up);
    private final jvb b = new jvb(R.drawable.icn_notification_new_positive_feedback_disabled, R.string.content_description_radio_thumb_up_disabled);
    private final jvb c = new jvb(R.drawable.icn_notification_new_positive_feedback_selected, R.string.content_description_radio_thumb_up_selected);
    private final jvb d = new jvb(R.drawable.icn_notification_new_negative_feedback, R.string.content_description_radio_thumb_down);
    private final jvb e = new jvb(R.drawable.icn_notification_new_negative_feedback_disabled, R.string.content_description_radio_thumb_down_disabled);
    private final jvb f = new jvb(R.drawable.icn_notification_new_negative_feedback_selected, R.string.content_description_radio_thumb_down_selected);

    /* renamed from: juw$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ThumbState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.spotlets.radio.model.ThumbState[] r0 = com.spotify.music.spotlets.radio.model.ThumbState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.spotlets.radio.model.ThumbState r1 = com.spotify.music.spotlets.radio.model.ThumbState.UP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.spotlets.radio.model.ThumbState r1 = com.spotify.music.spotlets.radio.model.ThumbState.DOWN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.juw.AnonymousClass1.<clinit>():void");
        }
    }

    juw() {
    }

    public final boolean a(hue hue) {
        return hue.i();
    }

    public final List<jva> a(hue hue, Context context, fpt fpt) {
        jva jva;
        jva jva2 = new jva(this.b, null, false);
        jva jva3 = new jva(this.e, null, false);
        if (!hue.n() && !hue.q()) {
            int i = AnonymousClass1.a[hue.m().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    jva2 = new jva(this.a, PendingIntent.getService(context, 1, RadioActionsService.a(context), 134217728), false);
                    jva = new jva(this.d, PendingIntent.getService(context, 2, RadioActionsService.a(context, hue.d().a), 134217728), false);
                } else {
                    jva = new jva(this.f, PendingIntent.getService(context, 2, RadioActionsService.c(context, hue.d().a), 134217728), false);
                }
                jva3 = jva;
            } else {
                jva2 = new jva(this.c, PendingIntent.getService(context, 1, RadioActionsService.b(context), 134217728), false);
            }
        }
        return ImmutableList.a(jva2, jvd.a(hue, context, true), jvd.b(hue, context, true), jvd.c(hue, context, true), jva3);
    }
}
