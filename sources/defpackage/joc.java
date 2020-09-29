package defpackage;

import android.content.Context;
import com.spotify.music.R;
import java.lang.ref.WeakReference;

/* renamed from: joc reason: default package */
public final class joc {
    public final WeakReference<Context> a;

    public joc(Context context) {
        this.a = new WeakReference<>(context);
    }

    public final String a() {
        Context context = (Context) this.a.get();
        return context != null ? context.getString(R.string.premium_upsell_interstitial_call_to_action_get_premium) : "";
    }

    public final String a(boolean z) {
        Context context = (Context) this.a.get();
        if (context == null) {
            return "";
        }
        return context.getString(z ? R.string.premium_in_app_destination_feature_heading_ontrial : R.string.premium_destination_what_you_get);
    }

    public final String b() {
        Context context = (Context) this.a.get();
        return context == null ? "" : context.getString(R.string.premium_in_app_destination_premium_not_purchasable_in_app);
    }
}
