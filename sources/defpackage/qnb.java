package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: qnb reason: default package */
public final class qnb extends jsn {
    public qnb(Resources resources) {
        super(resources);
    }

    public final String a(int i) {
        if (i == 1) {
            return a(R.string.free_tier_taste_onboarding_building_update_title_singular, new Object[0]);
        }
        return a(R.string.free_tier_taste_onboarding_building_update_title_plural, new Object[0]);
    }
}
