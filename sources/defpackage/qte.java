package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: qte reason: default package */
public final class qte extends juu {
    public qte(Resources resources) {
        super(resources);
    }

    public final String a() {
        return a(R.string.free_tier_taste_onboarding_error_view_general_title, new Object[0]);
    }

    public final String a(int i, boolean z) {
        if (z) {
            return a(R.string.free_tier_taste_onboarding_artist_picker_title_update_instruction, new Object[0]);
        }
        return a(R.string.free_tier_taste_onboarding_artist_picker_title_choose_n_or_more, Integer.valueOf(i));
    }

    public final String a(boolean z) {
        return z ? a(R.string.free_tier_taste_onboarding_artist_picker_next, new Object[0]) : a(R.string.free_tier_taste_onboarding_artist_picker_done, new Object[0]);
    }

    public final String b() {
        return a(R.string.free_tier_taste_onboarding_error_view_general_subtitle, new Object[0]);
    }

    public final String c() {
        return a(R.string.free_tier_taste_onboarding_error_view_lost_internet_connection, new Object[0]);
    }

    public final String d() {
        return a(R.string.free_tier_taste_onboarding_error_view_no_internet_connection, new Object[0]);
    }

    public final String e() {
        return a(R.string.free_tier_taste_onboarding_error_view_artists_are_saved_go_online, new Object[0]);
    }

    public final String f() {
        return a(R.string.free_tier_taste_onboarding_error_view_go_online_and_try_again, new Object[0]);
    }
}
