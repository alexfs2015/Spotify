package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.music.R;
import com.spotify.music.spotlets.radio.model.ThumbState;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import java.util.List;

/* renamed from: jxe reason: default package */
final class jxe extends jxp {
    private final jxj a = new jxj(R.drawable.icn_notification_new_positive_feedback, R.string.content_description_radio_thumb_up);
    private final jxj b = new jxj(R.drawable.icn_notification_new_positive_feedback_disabled, R.string.content_description_radio_thumb_up_disabled);
    private final jxj c = new jxj(R.drawable.icn_notification_new_positive_feedback_selected, R.string.content_description_radio_thumb_up_selected);
    private final jxj d = new jxj(R.drawable.icn_notification_new_negative_feedback, R.string.content_description_radio_thumb_down);
    private final jxj e = new jxj(R.drawable.icn_notification_new_negative_feedback_disabled, R.string.content_description_radio_thumb_down_disabled);
    private final jxj f = new jxj(R.drawable.icn_notification_new_negative_feedback_selected, R.string.content_description_radio_thumb_down_selected);

    /* renamed from: jxe$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jxe.AnonymousClass1.<clinit>():void");
        }
    }

    jxe() {
    }

    public final List<jxi> a(hwq hwq, Context context, fqn fqn) {
        jxi jxi;
        jxi jxi2 = new jxi(this.b, null, false);
        jxi jxi3 = new jxi(this.e, null, false);
        if (!hwq.n() && !hwq.q()) {
            int i = AnonymousClass1.a[hwq.m().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    jxi2 = new jxi(this.a, PendingIntent.getService(context, 1, RadioActionsService.a(context), 134217728), false);
                    jxi = new jxi(this.d, PendingIntent.getService(context, 2, RadioActionsService.a(context, hwq.d().a), 134217728), false);
                } else {
                    jxi = new jxi(this.f, PendingIntent.getService(context, 2, RadioActionsService.c(context, hwq.d().a), 134217728), false);
                }
                jxi3 = jxi;
            } else {
                jxi2 = new jxi(this.c, PendingIntent.getService(context, 1, RadioActionsService.b(context), 134217728), false);
            }
        }
        return ImmutableList.a(jxi2, jxl.a(hwq, context, true), jxl.b(hwq, context, true), jxl.c(hwq, context, true), jxi3);
    }

    public final boolean a(hwq hwq) {
        return hwq.i();
    }
}
