package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.quicksilver.messages.models.QuicksilverClickAction;
import com.spotify.music.features.quicksilver.utils.QuicksilverLoggerService;
import java.lang.ref.WeakReference;

/* renamed from: qbe reason: default package */
public final class qbe {
    private final WeakReference<Context> a;

    public qbe(Context context) {
        this.a = new WeakReference<>(context);
    }

    public final void a(QuicksilverClickAction quicksilverClickAction) {
        Context context = (Context) this.a.get();
        if (context == null) {
            Assertion.b("Attempted to log impression without context.");
        } else if (quicksilverClickAction == null) {
            Logger.e("Attempted to log Interaction with null click action", new Object[0]);
        } else {
            String trackingUrl = quicksilverClickAction.getTrackingUrl();
            if (TextUtils.isEmpty(trackingUrl)) {
                Logger.e("Attempted to log to empty target or with empty action.", new Object[0]);
                return;
            }
            QuicksilverLoggerService.a(context, trackingUrl, "log_interaction_with_trigger_message");
        }
    }

    public final void a(String str) {
        Context context = (Context) this.a.get();
        if (context == null) {
            Assertion.b("Attempted to log impression without context.");
        } else if (str == null || TextUtils.isEmpty(str)) {
            Logger.e("Attempted to log to empty target or with empty action.", new Object[0]);
        } else {
            QuicksilverLoggerService.a(context, str, "log_impression_of_trigger_message");
        }
    }
}
